package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //find log in link and click on log in link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        // this is from requirement
        String expectedMessage = "Welcome, Please Sign In!";

        //find the welcome text element and get the text.
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = actualMessageElement.getText();

        //validate actual and expected message
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //find log in link and click on log in link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        WebElement emailfield = driver.findElement(By.id("Email"));
        // sending email to email field element
        emailfield.sendKeys("vpinakin96@gmail.com");
        // to find name element
        WebElement passwordfield = driver.findElement(By.name("Password"));
        // sending password to password field element
        passwordfield.sendKeys("Pinakin5434@");

        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        // this is from requirement
        String expectedMessage = "Log out";

        //find the welcome text element and get the text.
        WebElement actualMessageElement = driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
        String actualMessage = actualMessageElement.getText();

        //validate actual and expected message
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void verifyTheErrorMessage() {
        //find log in link and click on log in link
        WebElement loginBtn = driver.findElement(By.linkText("Log in"));
        loginBtn.click();
        // to find emailfield element(By xpath)
        WebElement emailfield = driver.findElement(By.xpath("//input[@id='Email']"));
        // sending email to email field element
        emailfield.sendKeys("vpinakin@gmail.com");
        // to find passwordfield element(by xpath)
        WebElement passwordfield = driver.findElement(By.xpath("//input[@id='Password']"));
        // sending password to password field element
        passwordfield.sendKeys("12345678");

        WebElement loginfield = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginfield.click();

        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";

        WebElement errorMessageElement = driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]"));
        String actualMessage = errorMessageElement.getText();

        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @After
    public void closedown() {
        closeBrowser();
    }
}
