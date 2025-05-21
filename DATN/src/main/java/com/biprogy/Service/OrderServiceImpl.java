package com.biprogy.Service;

import com.biprogy.Model.Cart;
import com.biprogy.Model.Order;
import com.biprogy.Repository.CartRepository;
import com.biprogy.Repository.OrderRepository;
import com.biprogy.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    CartRepository cartRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public List<Order> getAllOrders() {
        return this.orderRepository.findAll();
    }

    @Override
    public Boolean addOrder(Integer CardID) {
        Cart cart = cartRepository.findById(CardID).get();
        Date orderDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(orderDate);
        calendar.add(Calendar.DAY_OF_MONTH, 3);
        Date shipDate = calendar.getTime();
        Order order = new Order();
        order.setOderdate(orderDate);
        order.setShipdate(shipDate);
        order.setOderstatus("PENDING"); // Set default status
        order.setUser(cart.getUser()); // Assuming the cart has a user
        order.setCart(cart);

        try {
            this.orderRepository.save(order);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


    @Override
    public Set<Order> getOrdersByUserID(Long UserId) {
        return this.userRepository.findById(UserId).get().getOrders();
    }
}

