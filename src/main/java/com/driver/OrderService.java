package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public void addOrder(Order order) {
        orderRepository.addOrder(order);
    }

    public void addPartner(String id) {
        orderRepository.addPartner(id);
    }

    public void addOrderPartnerPair(String orderId, String partnerId) {
        orderRepository.addOrderPartnerPair(orderId,partnerId);
    }

    public Order getOrderById(String orderId) {
      return orderRepository.getOrderById(orderId);
    }

    public DeliveryPartner getPartnerById(String partnerId) {
         return orderRepository.getPartnerById(partnerId);
    }


}
