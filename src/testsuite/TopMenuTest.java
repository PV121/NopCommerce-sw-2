package testsuite;

import browserfactory.BaseTest;
import javafx.scene.control.Tab;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    @Before
    public void openBrowserTopMenuTest(){
        openBrowser("https://demo.nopcommerce.com/");
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        // find computers tab element by link text
        WebElement computersTab = driver.findElement(By.linkText("Computers"));
        computersTab.click();// to click on computers tab

        String expectedHeading = "Computers";

        //to find actual heading element by xpath
        WebElement actualHeadingElement= driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        String actualHeading= actualHeadingElement.getText();// to get text for actual heading element

        // validate expected and actual heading is equal
        Assert.assertEquals(expectedHeading,actualHeading);
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully (){
        // find Electronics tab element by link text
        WebElement electonicsTab = driver.findElement(By.linkText("Electronics"));
        electonicsTab.click();// to click on electronics tab

        String expectedHeading = "Electronics";

        //to find actual heading element by xpath
        WebElement actualHeadingElement= driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        String actualHeading= actualHeadingElement.getText();// to get text for actual heading element

        // validate expected and actual heading is equal
        Assert.assertEquals(expectedHeading,actualHeading);
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully (){
        // find Apparel tab element by link text
        WebElement apparelTab = driver.findElement(By.linkText("Apparel"));
        apparelTab.click();// to click on Apparel tab

        String expectedHeading = "Apparel";

        //to find actual heading element by xpath
        WebElement actualHeadingElement= driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        String actualHeading= actualHeadingElement.getText();// to get text for actual heading element

        // validate expected and actual heading is equal
        Assert.assertEquals(expectedHeading,actualHeading);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfull (){
        // find Digital downloads tab element by link text
        WebElement digitalDownloadsTab = driver.findElement(By.linkText("Digital downloads"));
        digitalDownloadsTab.click();// to click on Digital downloads tab

        String expectedHeading = "Digital downloads";

        //to find actual heading element by xpath
        WebElement actualHeadingElement= driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        String actualHeading= actualHeadingElement.getText();// to get text for actual heading element

        // validate expected and actual heading is equal
        Assert.assertEquals(expectedHeading,actualHeading);
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully (){
        // find Digital Books tab element by link text
        WebElement booksTab = driver.findElement(By.linkText("Books"));
        booksTab.click();// to click on Books tab

        String expectedHeading = "Books";

        //to find actual heading element by xpath
        WebElement actualHeadingElement= driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        String actualHeading= actualHeadingElement.getText();// to get text for actual heading element

        // validate expected and actual heading is equal
        Assert.assertEquals(expectedHeading,actualHeading);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully (){
        // find Digital Jewelry tab element by link text
        WebElement jewelryTab = driver.findElement(By.linkText("Jewelry"));
        jewelryTab.click();// to click on Jewelry tab

        String expectedHeading = "Jewelry";

        //to find actual heading element by xpath
        WebElement actualHeadingElement= driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        String actualHeading= actualHeadingElement.getText();// to get text for actual heading element

        // validate expected and actual heading is equal
        Assert.assertEquals(expectedHeading,actualHeading);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully (){
        // find Digital Gift Cards tab element by link text
        WebElement giftCardsTab = driver.findElement(By.linkText("Gift Cards"));
        giftCardsTab.click();// to click on Gift Cards tab

        String expectedHeading = "Gift Cards";

        //to find actual heading element by xpath
        WebElement actualHeadingElement= driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        String actualHeading= actualHeadingElement.getText();// to get text for actual heading element

        // validate expected and actual heading is equal
        Assert.assertEquals(expectedHeading,actualHeading);
    }



    @After
    public void closeBrowserTopMenuTest(){
        closeBrowser();
    }
}
