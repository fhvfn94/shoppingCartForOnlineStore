package com.ShoppingCartForOnlineStore.ShoppingCartForOnlineStore.Controller;

import com.ShoppingCartForOnlineStore.ShoppingCartForOnlineStore.Model.Item;
import com.ShoppingCartForOnlineStore.ShoppingCartForOnlineStore.Service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class Controller {
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/add")
    public void add(@RequestParam Set<Integer> id) {
        service.add(id);
    }

    @GetMapping("/get")
    public List<Item> get() {
        return service.get();
    }
}
