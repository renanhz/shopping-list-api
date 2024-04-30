package com.example.shoppinglistapi.item;

import com.example.shoppinglistapi.shoppinglist.ShoppingList;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int quantity;

    @ManyToOne
    @JoinColumn(name = "listId")
    private ShoppingList list;
}