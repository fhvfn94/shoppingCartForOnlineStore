package com.ShoppingCartForOnlineStore.ShoppingCartForOnlineStore.Repository;
import org.springframework.stereotype.Component;
import com.ShoppingCartForOnlineStore.ShoppingCartForOnlineStore.Model.Item;

import javax.annotation.PostConstruct;
import java.util.*;
@Component
public class StoreRepository {
    private Integer idCount = 1;
    private final Map<Integer, Item> store = new HashMap<>();

    @PostConstruct
    public void init() {
        store.put(idCount, new Item(idCount++, "Ноутбук"));
        store.put(idCount, new Item(idCount++, "Смартфон"));
        store.put(idCount, new Item(idCount++, "Книга"));
        store.put(idCount, new Item(idCount++, "Телевизор"));
        store.put(idCount, new Item(idCount++, "Автомобиль"));
        store.put(idCount, new Item(idCount++, "ПК"));
    }

    public void add(Item item) {
        store.put(item.getId(), item);
    }

    public Item get(Integer id) {
        return store.get(id);
    }

    public List<Item> getAll() {
        return new ArrayList<>(store.values());
    }

    public void update(Integer id, Item item) {
        if (store.containsKey(id)) {
            store.replace(id, item);
        }
    }
    public Item delete(Integer id) {
        return store.remove(id);
    }
}
