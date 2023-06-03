/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcpit251_group4;

/**
 *
 * @author lenovo
 */
public class Customer {
    String phone;
    String userName;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

   

    public Customer(String phone, String userName) {
        this.phone = phone;
        this.userName = userName;
        
    }
     public String customerInfo(){
        
        return "************ customer information ***************"
                    + "\n"
                    + "\n user name:"+this.userName+""
                     + "\n user phone number "+this.phone;
        
    }
}
