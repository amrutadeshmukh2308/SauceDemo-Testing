package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ProductPage {
    WebDriver driver;
    WebDriverWait wait;

    private By menuBtn = By.id("react-burger-menu-btn");
    private By aboutLink = By.id("about_sidebar_link");
    private By logoutLink = By.id("logout_sidebar_link");
    private By addToCartBtn = By.id("add-to-cart-sauce-labs-backpack");
    private By cartIcon = By.className("shopping_cart_link");


    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void navigateToAboutPage() {
        wait.until(ExpectedConditions.elementToBeClickable(menuBtn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(aboutLink)).click();
    }

    public void addBackpackToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn)).click();
    }
    public void clickCart() {
        wait.until(ExpectedConditions.elementToBeClickable(cartIcon)).click();
    }
    public void logout() {
        wait.until(ExpectedConditions.elementToBeClickable(menuBtn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(logoutLink)).click();
    }
}