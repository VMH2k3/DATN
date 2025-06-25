package com.biprogy.Service;

import com.biprogy.Model.Cart;
import com.biprogy.Model.Order;
import com.biprogy.Model.Voucher;
import com.biprogy.Repository.CartRepository;
import com.biprogy.Repository.OrderRepository;
import com.biprogy.Repository.UserRepository;
import java.time.LocalDate;
import java.time.ZoneId;

import com.biprogy.Repository.VoucherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.Set;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    CartRepository cartRepository;

    @Autowired
    UserRepository userRepository;


    @Override
    public Boolean addOrder(Integer CardID) {
        Cart cart = cartRepository.findById(CardID).get();

        // Sử dụng LocalDate để chỉ lấy ngày tháng năm
        LocalDate today = LocalDate.now();
        Date orderDate = Date.from(today.atStartOfDay(ZoneId.systemDefault()).toInstant());

        // Tính shipDate (3 ngày sau)
        LocalDate shipLocalDate = today.plusDays(3);
        Date shipDate = Date.from(shipLocalDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

        Order order = new Order();
        order.setOderdate(orderDate);
        order.setShipdate(shipDate);
        order.setOderstatus("PENDING");
        order.setUser(cart.getUser());
        order.setCart(cart);
        order.setVoucher(null);
        order.setOrderprice(cart.getTotalprice());

        try {
            this.orderRepository.save(order);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Order getOrder(Integer OrderID) {
        return this.orderRepository.findById(OrderID).get();
    }


    @Override
    public Set<Order> getOrdersByUserID(Long UserId) {
        return this.userRepository.findById(UserId).get().getOrders();
    }

    @Override
    public Boolean updateOrder(Order order) {
        try {
            this.orderRepository.save(order);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Page getAll(Integer pageNo) {
        Pageable pageable = PageRequest.of(pageNo-1, 5);
        return this.orderRepository.findAll(pageable);
    }

    @Override
    public Boolean update(Order order) {
        try {
            this.orderRepository.save(order);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Autowired
    VoucherRepository voucherRepository;

    @Override
    public Boolean addOrder(Integer CardID, Long VoucherID) {
        Cart cart = cartRepository.findById(CardID).get();
        Voucher voucher = this.voucherRepository.findById(Math.toIntExact(VoucherID)).get();

        // Sử dụng LocalDate để chỉ lấy ngày tháng năm
        LocalDate today = LocalDate.now();
        Date orderDate = Date.from(today.atStartOfDay(ZoneId.systemDefault()).toInstant());

        // Tính shipDate (3 ngày sau)
        LocalDate shipLocalDate = today.plusDays(3);
        Date shipDate = Date.from(shipLocalDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

        Order order = new Order();
        order.setOderdate(orderDate);
        order.setShipdate(shipDate);
        order.setOderstatus("PENDING");
        order.setUser(cart.getUser());
        order.setCart(cart);
        order.setVoucher(voucher);
        order.setOrderprice(cart.getTotalprice()-cart.getTotalprice()*voucher.getDiscountPercent()/100);
        try {
            this.orderRepository.save(order);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Object[]> getWeeklyRevenue(Date startDate, Date endDate) {
        return orderRepository.getWeeklyRevenue(startDate, endDate);
    }

    @Override
    public List<Order> getAllOrder() {
        return
        this.orderRepository.findAll();
    }
}

