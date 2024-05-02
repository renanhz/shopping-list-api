package com.example.shoppinglistapi.shoppinglist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ShoppingListRepository extends JpaRepository<ShoppingList, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM shopping_list s WHERE s.channel_id = ?1 AND s.closed = 0")
    Optional<ShoppingList> findByChannelId(Long channelId);
}
