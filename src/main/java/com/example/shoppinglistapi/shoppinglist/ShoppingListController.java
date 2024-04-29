package com.example.shoppinglistapi.shoppinglist;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/shopping-list")
public class ShoppingListController {

    @RequestMapping("/{channelId}")
    public ResponseEntity<String> getShoppingList(@PathVariable("channelId") String channelId) {
        return ResponseEntity.ok("Hello World");
    }
}
