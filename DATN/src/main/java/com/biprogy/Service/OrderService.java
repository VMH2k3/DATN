package com.biprogy.Service;

import com.biprogy.Model.Order;
import org.springframework.data.domain.Page;

import java.util.Set;
import java.util.Date;
import java.util.List;

public interface OrderService {
    Boolean addOrder(Integer CardID);
    Order getOrder(Integer OrderID);
    Set<Order> getOrdersByUserID(Long UserId);
    Boolean updateOrder(Order order);
    Page getAll(Integer pageNo);
    Boolean update(Order order);
    Boolean addOrder(Integer CardID, Long VoucherID);
    List<Object[]> getWeeklyRevenue(Date startDate, Date endDate);
    List<Order> getAllOrder();
}
