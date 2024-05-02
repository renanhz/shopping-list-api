package com.example.shoppinglistapi.shoppinglist;

import com.example.shoppinglistapi.item.Item;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
@Getter
@Setter
public class ShoppingList {

    @Id
    @GeneratedValue
    private Long id;

    private Long channelId;

    private LocalDate creationDate;

    private LocalDate closedDate;

    private boolean closed;

    @OneToMany(mappedBy = "list")
    private List<Item> items;

    public ShoppingList(Long channelId) {
        this.channelId = channelId;
        this.closed = false;
        this.creationDate = LocalDate.now();
    }
}
