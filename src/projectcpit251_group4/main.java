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
        Product prod=new Product("1",40.3,"acrylics");
        Product prod1=new Product("2",36.7,"oils");
        Product prod2=new Product("3",44.50,"watercolors");
        Product prod3=new Product("4",27.3,"pastels");
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
        String i = null;
        
        do{
             switch(x){
                case "1":{
                      System.out.println("----------------Customer menue-------------------"
                                      + "\n1 for view products"
                                      + "\n2 to add to cart and view cart"
                                      + "\n3 search for product"
                                      + "\n4 place order"
                                      + "\no to exit"
                                      + "\n-----------------------------------------------");
                      
                     i=input.next();
                     
                     if(i.charAt(0)=='1'){
                         main.printAllProduct();
                     }
                     
                      else if(i.charAt(0)=='2'){
                       
                          String ex=null;
                          
                          do{
                            
                         System.out.println("Enter id for item: "
                                          + "1 for acrylics, "
                                          + "2 for oils, "
                                          + "3 for watercolors, "
                                          + "4 for pastels");
                         String item=input.next();
                         if(item.charAt(0)=='1'){
                              
                             System.out.println(main.addToCart(prod.getType(),prod.getPrice()));
                         }
                         else if(item.charAt(0)=='2'){
                              
                            System.out.println(main.addToCart(prod1.getType(),prod1.getPrice()));
                         }
                         else if(item.charAt(0)=='3'){
                              
                            System.out.println(main.addToCart(prod2.getType(),prod2.getPrice()));
                         }
                         else if(item.charAt(0)=='4'){
                              
                           System.out.println(main.addToCart(prod3.getType(),prod3.getPrice()));
                         }
                         else
                             System.out.println("out of stock");
                        
                         
                         main.printCart();
                        
                         System.out.println("if you want exit cart enter 0");
                         ex=input.next();
                        }while(!(ex.charAt(0)=='0'));
                        
                         
                     }
                    
                    
                }
                
                case "2":{
                
                }
            
            
             }
            
         System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\");   
        }while(!(i.charAt(0)=='0'));
        
        System.out.println("------------------------ Thank you ------------------------");
        System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\");
        
        
        
        
        
    
        }
    
     public String addToCart(String item, double price){
       
        cart1=new Cart(item, true,0.0);
        cartList.add(cart1);
                         System.out.println("------------------------------------");
                         System.out.println("          item in cart ");
                         System.out.println("------------------------------------");
              return cart1.getType()+" added";
    }
    
    
     public void printCart(){
         int quan=0;
         
         for(Cart s:cartList){
            System.out.println("item type:"+s.getType()+""
                    + "\nitem price: "+s.price);
            quan++;
        }
         
         System.out.println("item number in the cart: "+quan);
         System.out.println("------------------------------------");
         
    }
    
     public void printAllProduct(){
         
        for(Product s:productList){
            System.out.println(""+s.prodInfo());
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
