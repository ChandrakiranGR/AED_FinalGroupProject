/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Orders;

import java.util.ArrayList;

/**
 *
 * @author chandrakiran
 */
public class Cart {
    private int cartId;
    ArrayList<OrderItem> cartItems;
    private static int count = 0;
    
    public Cart() {
        this.cartId = count++;
        this.cartItems = new ArrayList<>();
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public ArrayList<OrderItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(ArrayList<OrderItem> cartItems) {
        this.cartItems = cartItems;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Cart.count = count;
    }
    
    
}
