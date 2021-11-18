/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author ronak
 */
public class Restaurant {
    
    public String restaurantName;
    public String restaurantUsername;
    public String restaurantPassword;
    public String restaurantAddress;
    public String restaurantNumber;
    public OrderMenu dishes;
    public ArrayList<OrderMenu> dishesList;
    public ArrayList<Order> orderList;
    int id = 1;

    public Restaurant(String restaurantName, String restaurantUsername, String restaurantPassword, String restaurantAddress, String restaurantNumber) {
        this.restaurantName = restaurantName;
        this.restaurantUsername = restaurantUsername;
        this.restaurantPassword = restaurantPassword;
        this.restaurantAddress = restaurantAddress;
        this.restaurantNumber = restaurantNumber;
        dishesList = new ArrayList<OrderMenu>();
        orderList = new ArrayList<Order>();
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantUsername() {
        return restaurantUsername;
    }

    public void setRestaurantUsername(String restaurantUsername) {
        this.restaurantUsername = restaurantUsername;
    }

    public String getRestaurantPassword() {
        return restaurantPassword;
    }

    public void setRestaurantPassword(String restaurantPassword) {
        this.restaurantPassword = restaurantPassword;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getRestaurantNumber() {
        return restaurantNumber;
    }

    public void setRestaurantNumber(String restaurantNumber) {
        this.restaurantNumber = restaurantNumber;
    }

    public ArrayList<OrderMenu> getDishesList() {
        if (dishesList == null) {
            dishesList = new ArrayList<OrderMenu>();
        }
        return dishesList;
    }

    public void setDishesList(ArrayList<OrderMenu> dishesList) {
        this.dishesList = dishesList;
    }

    public OrderMenu getOneDish(String menuName) {
        for (OrderMenu dish : dishesList) {
            if (dish.getDishName().equalsIgnoreCase(menuName)) {
                return dish;
            }
        }
        return null;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public void addOrder(String orderId, String restaurantName, String customerName, String delivermanName, String totalPrice, String status, ArrayList<OrderMenu> dishesList, String deliveryAddress) {
        Order order = new Order(orderId, restaurantName, customerName, delivermanName, totalPrice, "New Order", dishesList, deliveryAddress);
        if (orderList == null) {
            orderList = new ArrayList<Order>();
        }
        orderList.add(order);
        id++;
    }

    @Override
    public String toString() {
        return restaurantName;
    }
    
}
