package com.example.shoppinglistapi.item;

public class ItemDTO {

    private String name;

    private String quantity;

    public ItemDTO(Item item) {
        this.name = item.getName();
        this.quantity = item.getQuantity();
    }

}
