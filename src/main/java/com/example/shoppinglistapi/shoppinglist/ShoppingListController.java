package com.example.shoppinglistapi.shoppinglist;

import com.example.shoppinglistapi.item.ItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/shopping-list")
public class ShoppingListController {

    @Autowired
    private ShoppingListService shoppingListService;

    public ShoppingListController(ShoppingListService shoppingListService) {
        this.shoppingListService = shoppingListService;
    }

    @GetMapping("/{channelId}")
    public ResponseEntity<List<ItemDTO>> getShoppingList(@PathVariable("channelId") Long channelId) {
        List<ItemDTO> items = shoppingListService.getShoppingListItems(channelId);

        return new ResponseEntity<>(items, HttpStatus.OK);
    }

    @PostMapping("/{channelId}")
    public ResponseEntity<ShoppingList> createShoppingList(@PathVariable("channelId") Long channelId) {
        ShoppingList shoppingList = shoppingListService.createShoppingList(channelId);

        return new ResponseEntity<>(shoppingList, HttpStatus.CREATED);
    }
}
