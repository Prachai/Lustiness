package test_Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import page_Objects.Orders_Page;
import page_Objects.Product_Page;
import test_Components.BaseClass;

public class RahulShetty2 extends BaseClass
{
public String itemName;



@Test()
public void validationOrder0()
{
Product_Page product_Page=landing_Page.userLogin("Chaip819@gmail.com","Chaip819@gmail.com");
Orders_Page orders_Page=product_Page.ordersPage();
Boolean element=orders_Page.verifyTheOrderedProduct(itemName);
Assert.assertTrue(element);
System.out.println("changes made");
System.out.println();
System.out.println();
System.out.println();
System.out.println(); 
}


@Test()
public void validationOrder1New()
{
Product_Page product_Page=landing_Page.userLogin("Chaip819@gmail.com","Chaip819@gmail.com");
Orders_Page orders_Page=product_Page.ordersPage();
Boolean element=orders_Page.verifyTheOrderedProduct(itemName);
Assert.assertTrue(element);
System.out.println("really");
}

@Test()
public void validationOrder2New()
{
System.out.println("really");	
Product_Page product_Page=landing_Page.userLogin("Chaip819@gmail.com","Chaip819@gmail.com");
Orders_Page orders_Page=product_Page.ordersPage();
Boolean element=orders_Page.verifyTheOrderedProduct(itemName);
Assert.assertTrue(element);
System.out.println("hungry so i will update it");
}

@Test()
public void validationOrde()
{
System.out.println("really");	
System.out.println("ok");	
System.out.println("hmm");
System.out.println("yup");
Product_Page product_Page=landing_Page.userLogin("Chaip819@gmail.com","Chaip819@gmail.com");
Orders_Page orders_Page=product_Page.ordersPage();
Boolean element=orders_Page.verifyTheOrderedProduct(itemName);
Assert.assertTrue(element);
System.out.println("thank u");
}

}



