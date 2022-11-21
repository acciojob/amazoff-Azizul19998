package com.driver;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class OrderRepository {
  HashMap<String,Order> orderMap = new HashMap<>();
 HashMap<String,DeliveryPartner> deliveryMap = new HashMap<>();
 HashMap<String,String> pair  =new HashMap<>();


       public void addOrder(Order order) {
           orderMap.put(order.getId(),order);
       }

    public void addPartner(String id) {
        DeliveryPartner partner = new DeliveryPartner(id);
        deliveryMap.put(id,partner);
    }

    public void addOrderPartnerPair(String orderId, String partnerId) {
           pair.put(orderId,partnerId);
    }

    public Order getOrderById(String orderId) {
           for(String id:orderMap.keySet()) {
               if(orderId.equals(id)) return orderMap.get(id);
           }
           return null;
    }

    public DeliveryPartner getPartnerById(String partnerId) {
           for(String id : deliveryMap.keySet()) {
               if(partnerId.equals(id)) return deliveryMap.get(id);
           }
           return null;
    }

}
