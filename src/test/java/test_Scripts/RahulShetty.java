package test_Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import page_Objects.Cart_Page;
import page_Objects.Confirmation_Page;
import page_Objects.Orders_Page;
import page_Objects.PaymentPage;
import page_Objects.Product_Page;
import test_Components.BaseClass;

public class RahulShetty extends BaseClass
{
public String itemName;

@Test
public void submitOrder() throws InterruptedException
{
Product_Page product_Page=landing_Page.userLogin("Chaip819@gmail.com","Chaip819@gmail.com");
itemName="zara coat 3";
Cart_Page cart_page=product_Page.getTheProduct(itemName);
//cartPage
PaymentPage payment_page=cart_page.buyNowProduct(itemName);
//payment page
String country="india";
Confirmation_Page cnfPage=payment_page.paymentSelected(country);
//confirmtion page
String text=cnfPage.orderConfirmation();
Assert.assertEquals(text, "THANKYOU FOR THE ORDER.");
}


//dependsOnMethods = "submitOrder"
@Test()
public void validationOrder0()
{
Product_Page product_Page=landing_Page.userLogin("Chaip819@gmail.com","Chaip819@gmail.com");
Orders_Page orders_Page=product_Page.ordersPage();
Boolean element=orders_Page.verifyTheOrderedProduct(itemName);
Assert.assertTrue(element);
System.out.println("chai");
System.out.println("chai");
System.out.println("chai");
System.out.println("chai");
System.out.println("chai");
System.out.println("chai");
System.out.println("pradeep");
System.out.println("govinda");   
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

}



