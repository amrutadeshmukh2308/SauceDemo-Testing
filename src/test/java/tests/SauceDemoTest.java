package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.LoginPage;
import pages.ProductPage;
import pages.CheckoutPage;

public class SauceDemoTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @Test(priority = 1)
    public void testComplexNavigationAndPurchaseFlow() {
        LoginPage login = new LoginPage(driver);
        login.enterUsername("standard_user");
        login.enterPassword("secret_sauce");
        login.clickLogin();

        ProductPage products = new ProductPage(driver);
        products.navigateToAboutPage();
        driver.navigate().back();
        products.addBackpackToCart();
        products.logout();

        System.out.println("Test Case Passed: Complex navigation flow!");
    }

    @Test(priority = 2)
    public void testFullE2EFlow() {
        LoginPage login = new LoginPage(driver);
        ProductPage products = new ProductPage(driver);
        CheckoutPage checkout = new CheckoutPage(driver);

        login.enterUsername("standard_user");
        login.enterPassword("secret_sauce");
        login.clickLogin();

        products.addBackpackToCart();

        products.clickCart();

        checkout.checkoutProcess("Rahul", "Patil", "431513");

        products.logout();
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}