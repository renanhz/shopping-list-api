package com.example.shoppinglistapi.shoppinglist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ShoppingListService {

    @Autowired
    private ShoppingListRepository shoppingListRepository;

    public ShoppingListService(ShoppingListRepository shoppingListRepository) {
        this.shoppingListRepository = shoppingListRepository;
    }

    public Optional<ShoppingList> getOpenShoppingList(Long channelId) {
        return shoppingListRepository.findByChannelId(channelId);
    }

    public ShoppingList createShoppingList(Long channelId) {
        ShoppingList shoppingList = new ShoppingList(channelId);

        return shoppingListRepository.save(shoppingList);
    }

}
