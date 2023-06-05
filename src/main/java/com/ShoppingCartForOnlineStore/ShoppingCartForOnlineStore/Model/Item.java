package com.ShoppingCartForOnlineStore.ShoppingCartForOnlineStore.Model;

import java.util.Objects;

public class Item {
    private Integer id;

    public Item() {
    }

    private String title;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id.equals(item.id) && title.equals(item.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Item(Integer id, String title) {
        this.id = id;
        this.title = title;
    }
}
