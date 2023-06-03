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
public class order {
     
    boolean confirm ;
    String paymentMethod;

    public order(boolean confirm, String paymentMethod) {
        this.confirm = confirm;
        this.paymentMethod = paymentMethod;
    }

    public boolean isConfirm() {
        return confirm;
    }

    public void setConfirm(boolean confirm) {
        this.confirm = true;
    }
    
   

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
