/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcpit251_group4;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lenovo
 */
public class mainTest {
    
    public mainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   

    /**
     * Test of addToCart method, of class main.
     */
    @Test
    public void testAddToCart() {
        System.out.println("addToCart");
        String item = "oils";
        double price = 0.0;
        main instance = new main();
        String expResult = "oils added";
        String result = instance.addToCart(item, price);
        assertEquals(expResult, result);
        assertNotNull(result);
    }

    /**
     * Test of addItem method, of class main.
     */
    @Test
    public void testAddItem() {
        System.out.println("addItem");
        Product prod = new Product("1",3.0,"oils");
        main instance = new main();
        String expResult = "1";
        String result = instance.addItem(prod);
        assertEquals(expResult, result);
        assertNotNull(result);
    }

    /**
     * Test of searchProduct method, of class main.
     */
    @Test (timeout = 90)
    public void testSearchProduct() {
        System.out.println("searchProduct");
        String type = "";
        main instance = new main();
        instance.searchProduct(type);
        assertNotNull(type);
    }

    /**
     * Test of placeOrder method, of class main.
     */
    @Test (timeout = 90)
    public void testPlaceOrder() {
        System.out.println("placeOrder");
        String item = "";
        main instance = new main();
        instance.placeOrder(item);
        assertNotNull(item);
    }
}

    