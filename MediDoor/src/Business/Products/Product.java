/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Products;

import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author vish
 */
public class Product {
    String name;
    private double price;
    private int productId;
    private int stockunits;
    private boolean availability;
    private static int count = 0;
    private File productImage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Product() {
        this.name = "";
        this.price = 0.0;
        this.productId = this.count++;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getStockunits() {
        return stockunits;
    }

    public void setStockunits(int stockunits) {
        if(this.stockunits == 0) {
            this.availability = false;
        }
        this.stockunits = stockunits;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    public File getProductImage() {
        return this.productImage;
    }

    public void setProductImage(File productImage) {
        this.productImage = productImage;
    }
}
