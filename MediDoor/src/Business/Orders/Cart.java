/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Orders;

import java.util.ArrayList;
/**
 *
 * @author chandrkiran
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

