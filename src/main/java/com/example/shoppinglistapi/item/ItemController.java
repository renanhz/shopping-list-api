package com.example.shoppinglistapi.item;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/item")
public class ItemController {

    @PostMapping("/{channelId}")
    public ResponseEntity<String> addItemToList(
            @PathVariable("channelId") Long channelId,
            @RequestBody Item item)
    {
        return new ResponseEntity<String>("Item adicionado", HttpStatus.CREATED);
    }
}
