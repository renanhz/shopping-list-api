package com.example.shoppinglistapi.shoppinglist;

import com.example.shoppinglistapi.item.Item;
import com.example.shoppinglistapi.item.ItemDTO;

import java.util.ArrayList;
import java.util.List;

public class ShoppingListDTO {

    private List<ItemDTO> items = new ArrayList<>();

    public List<ItemDTO> getItems() {
        return items;
    }

    public ShoppingListDTO(ShoppingList sl) {
        for (Item item:sl.getItems()) {
            ItemDTO itemDTO = new ItemDTO(item);
            items.add(itemDTO);
        }
    }
}
