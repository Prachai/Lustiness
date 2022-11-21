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

}


@Test()
public void validationOrder1New()
{
Product_Page product_Page=landing_Page.userLogin("Chaip819@gmail.com","Chaip819@gmail.com");
Orders_Page orders_Page=product_Page.ordersPage();
Boolean element=orders_Page.verifyTheOrderedProduct(itemName);
Assert.assertTrue(element);

}

@Test()
public void validationOrder2New()
{
Product_Page product_Page=landing_Page.userLogin("Chaip819@gmail.com","Chaip819@gmail.com");
Orders_Page orders_Page=product_Page.ordersPage();
Boolean element=orders_Page.verifyTheOrderedProduct(itemName);
Assert.assertTrue(element);

}

@Test()
public void validationOrde()
{
Product_Page product_Page=landing_Page.userLogin("Chaip819@gmail.com","Chaip819@gmail.com");
Orders_Page orders_Page=product_Page.ordersPage();
Boolean element=orders_Page.verifyTheOrderedProduct(itemName);
Assert.assertTrue(element);

}

}



