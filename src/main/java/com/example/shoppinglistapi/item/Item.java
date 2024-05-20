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

    private String quantity;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = ShoppingList.class)
    @JoinColumn(name = "list_id", insertable = false, updatable = false)
    private ShoppingList list;

    @Column(name = "list_id")
    private Long listId;
}
