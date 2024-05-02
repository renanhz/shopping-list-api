package com.example.shoppinglistapi.shoppinglist;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/shopping-list")
public class ShoppingListController {

    @GetMapping("/{channelId}")
    public ResponseEntity<String> getShoppingList(@PathVariable("channelId") Long channelId) {
        return ResponseEntity.ok("Hello World");
    }
}
