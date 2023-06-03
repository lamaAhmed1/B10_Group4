/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcpit251_group4;

/**
 *
 * @author Almaha
 */
public class Cart {
    
String type;
    double price;
    int quantiti=1;
    boolean status;
    

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
     public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantiti() {
        return quantiti++;
    }

    public void setQuantiti(int quantiti) {
        this.quantiti = quantiti;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Cart(String type, boolean status, double price) {
        this.type=type;
        
        this.status = status;
        this.price= price;
    }
}
