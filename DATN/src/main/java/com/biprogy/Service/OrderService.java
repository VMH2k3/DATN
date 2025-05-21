package com.biprogy.Service;

import com.biprogy.Model.Order;

import java.util.List;
import java.util.Set;

public interface OrderService {
    List<Order> getAllOrders();
    Boolean addOrder(Integer CardID);
    Set<Order> getOrdersByUserID(Long UserId);
}
