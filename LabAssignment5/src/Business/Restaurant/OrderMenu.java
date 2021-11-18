/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author ronak
 */
public class OrderMenu {
    
    private String menuName;
    private String dishDescripton;
    private String price;
    
    public OrderMenu(String menuName, String dishDescription, String dishPrice) {
        this.menuName = menuName;
        this.dishDescripton = dishDescription;
        this.price = dishPrice;
    }

    public String getDishName() {
        return menuName;
    }

    public void setDishName(String menuName) {
        this.menuName = menuName;
    }

    public String getDishDescripton() {
        return dishDescripton;
    }

    public void setDishDescripton(String dishDescripton) {
        this.dishDescripton = dishDescripton;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return menuName;
    }
    
}
