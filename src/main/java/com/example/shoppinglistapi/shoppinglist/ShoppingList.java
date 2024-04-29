package com.example.shoppinglistapi.shoppinglist;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

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
}
