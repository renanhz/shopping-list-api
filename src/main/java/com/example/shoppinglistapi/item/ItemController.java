package com.example.shoppinglistapi.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/item")
public class ItemController {

    @Autowired
    ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping("/{channelId}")
    public ResponseEntity<String> addItemToList(
            @PathVariable("channelId") Long channelId,
            @RequestBody Item item) {
        itemService.addItemToList(channelId, item);

        return new ResponseEntity<String>("Item adicionado", HttpStatus.CREATED);
    }
}
