/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcpit251_group4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class main {

    /**
     * @param args the command line arguments
     */
      private List<Product> productList=new ArrayList();
     private List<Cart> cartList=new ArrayList();
     private List<Customer> cusList=new ArrayList();
     private List<Artist> artistList=new ArrayList();
     private List<order> orderList=new ArrayList();
     Product p;
     Cart cart1;
     order ord;
     Artist artId;
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input=new Scanner(System.in);
         
        main main=new main();
        Product prod=new Product("1",0.0,"acrylics");
        Product prod1=new Product("2",1.0,"oils");
        Product prod2=new Product("3",0.0,"watercolors");
        Product prod3=new Product("4",0.0,"pastels");
        main.productList.add(prod);
        main.productList.add(prod1);
        main.productList.add(prod2);
        main.productList.add(prod3);
        
        
        
    
        showMenue();
        String x=input.next();
       // check input \\ 
        while (!(x.charAt(0)=='1'||x.charAt(0)=='2')){
            System.out.println("wrong input try again");
            x=input.next();
        }
        
        
        
        
        
        
    }
    public static void showMenue(){
        System.out.println("****************************************************************************"
                         + "\n****************************************************************************"
                         + "\n                       Welcome to Artsy application                         "
                         + "\n****************************************************************************"
                         + "\n****************************************************************************"
                         + "\n"
                + "\npress (1) if you are a customer"
                + "\npress (2) if you are an artist");
    }
    
}
