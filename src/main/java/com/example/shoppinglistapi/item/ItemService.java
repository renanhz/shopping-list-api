package com.example.shoppinglistapi.item;

import com.example.shoppinglistapi.shoppinglist.ShoppingList;
import com.example.shoppinglistapi.shoppinglist.ShoppingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ItemService {



    @Autowired
    ItemRepository itemRepository;

    @Autowired
    ShoppingListService shoppingListService;

    public ItemService(ItemRepository itemRepository, ShoppingListService shoppingListService) {
        this.itemRepository = itemRepository;
        this.shoppingListService = shoppingListService;
    }

    public void addItemToList(Long channelId, Item item) throws Exception {
        Optional<ShoppingList> shoppingList = shoppingListService.getOpenShoppingList(channelId);

        if (shoppingList.isPresent()) {
            item.setListId(shoppingList.get().getId());

            itemRepository.save(item);
        } else {
            throw new Exception("É preciso criar uma lista antes de adicionar um item");
        }
    }

}
