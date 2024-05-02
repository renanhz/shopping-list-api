package com.example.shoppinglistapi.shoppinglist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/shopping-list")
public class ShoppingListController {

    @Autowired
    private ShoppingListService shoppingListService;

    public ShoppingListController(ShoppingListService shoppingListService) {
        this.shoppingListService = shoppingListService;
    }

    @GetMapping("/{channelId}")
    public ResponseEntity<String> getShoppingList(@PathVariable("channelId") Long channelId) {
        return ResponseEntity.ok("Hello World");
    }

    @PostMapping("/{channelId}")
    public ResponseEntity<ShoppingList> createShoppingList(@PathVariable("channelId") Long channelId) {
        ShoppingList shoppingList = shoppingListService.createShoppingList(channelId);

        return new ResponseEntity<ShoppingList>(shoppingList, HttpStatus.CREATED);
    }
}
