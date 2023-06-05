package com.ShoppingCartForOnlineStore.ShoppingCartForOnlineStore.Service;

import com.ShoppingCartForOnlineStore.ShoppingCartForOnlineStore.Model.Basket;
import com.ShoppingCartForOnlineStore.ShoppingCartForOnlineStore.Model.Item;
import com.ShoppingCartForOnlineStore.ShoppingCartForOnlineStore.Repository.StoreRepository;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@org.springframework.stereotype.Service
public class Service {
    private final Basket basket;
    private final StoreRepository storeRepository;

    public Service(Basket basket, StoreRepository storeRepository) {
        this.basket = basket;
        this.storeRepository = storeRepository;
    }

    public void add(Set<Integer> ids) {
        basket.add(ids);
    }

    public List<Item> get() {
        return basket.get().stream()
                .map(id -> storeRepository.get(id))
                .collect(Collectors.toList());
    }
}
