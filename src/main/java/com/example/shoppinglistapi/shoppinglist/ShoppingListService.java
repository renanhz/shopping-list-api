package com.example.shoppinglistapi.shoppinglist;

import com.example.shoppinglistapi.item.ItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
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
    public List<ItemDTO> getShoppingListItems(Long channelId) {
        Optional<ShoppingList> sl = getOpenShoppingList(channelId);

        if (sl.isPresent()) {
            ShoppingListDTO slDTO = new ShoppingListDTO(sl.get());
            return slDTO.getItems();
        } else {
            return List.of();
        }
    }

    public ShoppingList createShoppingList(Long channelId) {
        ShoppingList shoppingList = new ShoppingList(channelId);

        getOpenShoppingList(channelId).ifPresent(sl -> {
            sl.setClosed(true);
            sl.setClosedDate(LocalDate.now());

            shoppingListRepository.save(sl);
        });

        return shoppingListRepository.save(shoppingList);
    }

}
