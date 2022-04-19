package testsuite;

import browserfactory.BaseTest;
import com.beust.jcommander.Strings;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void openBrowserRegisterTest() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        // find "register" element  by linktext
        WebElement register = driver.findElement(By.linkText("Register"));
        register.click();// to click on "register"

        String expectedHeading = "Register";
        //to find element of actual register heading element
        WebElement actualHeadingElement = driver.findElement(By.linkText("Register"));
        // to get actual heading text
        String actualHeading = actualHeadingElement.getText();

        Assert.assertEquals(expectedHeading, actualHeading);
    }

    @Test
    public void userSholdRegisterAccountSuccessfully() {
        // find "register" element  by linktext
        WebElement register = driver.findElement(By.linkText("Register"));
        register.click();// to click on "regester"
        String expectedHeading = "Register";
        //to find element of actual register heading element
        WebElement actualHeadingElement = driver.findElement(By.linkText("Register"));
        // to get actual heading text
        String actualHeading = actualHeadingElement.getText();

        Assert.assertEquals(expectedHeading, actualHeading);

        //fing elements for gender by ID
        WebElement maleGender = driver.findElement(By.id("gender-male"));
        maleGender.click();// to click on male gender radio button

        // to find first name field element by name  and send input in that field
        WebElement firstName =  driver.findElement(By.name("FirstName"));
        firstName.sendKeys("Pinakin");
        // to find last name field element by name  and send input in that field
        WebElement lastName =  driver.findElement(By.name("LastName"));
        lastName.sendKeys("Valand");
        // to find date field element by name  and send input in that field
        WebElement dateOfBirthDay=  driver.findElement(By.name("DateOfBirthDay"));
        dateOfBirthDay.click();
        // to find element for date# 30 by xpath and click on it.
        WebElement dateOfBirth=  driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]/option[31]"));
        dateOfBirth.click();

        // to find month field element by name  and send input in that field
        WebElement monthOfBirthDay=  driver.findElement(By.name("DateOfBirthMonth"));
        monthOfBirthDay.click();
        // to find october month element by xpath and click on it.
        WebElement monthOfBirth=  driver.findElement(By.xpath("//option[contains(text(),'October')]"));
        monthOfBirth.click();

        // to find year field element by name  and send input in that field
        WebElement yearOfBirthDay=  driver.findElement(By.name("DateOfBirthYear"));
        yearOfBirthDay.click();
        // to find 1995 year element by xpath and click on it.
        WebElement yearOfBirth=  driver.findElement(By.xpath("//option[contains(text(),'1995')]"));
        yearOfBirth.click();
        // to find emailfield by id locator
        WebElement emailfield= driver.findElement(By.id("Email"));
        Random randomGenerator = new Random();// introducing random class and object
        int randomInt= randomGenerator.nextInt(1000);//save random num in to randomInt
        // sending email to email field element
        emailfield.sendKeys("vpinakin"+randomInt +"@gmail.com");

        // to find passwordfield element by name locator
        WebElement passwordfield= driver.findElement(By.name("Password"));
        // sending password to password field element
        passwordfield.sendKeys("Pinakin5434@");
        // to find confirmPasswordfield element by name locator
        WebElement confirmPasswordfield= driver.findElement(By.name("ConfirmPassword"));
        // sending password to password field element
        confirmPasswordfield.sendKeys("Pinakin5434@");

        // to find Register button element by ID locator and click on it
        WebElement registerBtn= driver.findElement(By.id("register-button"));
        registerBtn.click();

        String expectedMessage= "Your registration completed";
        // to find register sucessfully message element by xpath
        WebElement successfullyRegisterMessageElement= driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        String actualMessage =successfullyRegisterMessageElement.getText();

        Assert.assertEquals(expectedMessage,actualMessage);


    }

    @After
    public void closeBrowserRegisterTest() {
        closeBrowser();
    }
}

