package com.example.pizzaaplicationtest.remote.rest.dto.response;

import java.util.List;

public class OrderList {

    private List<OrderInfoDto> orders;

    public OrderList() {
    }

    public OrderList(List<OrderInfoDto> orders) {
        this.orders = orders;
    }

    public List<OrderInfoDto> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderInfoDto> orders) {
        this.orders = orders;
    }
}
