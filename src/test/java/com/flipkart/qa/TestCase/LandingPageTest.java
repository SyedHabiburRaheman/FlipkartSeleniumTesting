package com.flipkart.qa.TestCase;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.LandingPage;
import javafx.scene.layout.Priority;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.net.MalformedURLException;

public class LandingPageTest extends TestBase {
    LandingPage landingPage;

    public LandingPageTest()
    {
        super();
    }

    @BeforeClass
    public void setUp() throws MalformedURLException, AWTException {
        initialization();
        landingPage = new LandingPage(driver);
    }

    @Test(priority=1)
    public void loginTest() throws InterruptedException {
        Thread.sleep(2000);
        boolean flag = landingPage.validateLogin();
        Assert.assertTrue(flag);
    }
//    public void loginToFlipkart() {
//        driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='text']")).sendKeys("testuser@abc.com");
//
//        driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='password']")).sendKeys("Test@1234");
//
//        driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//button[@type='submit']")).click();
//    }

    @Test(priority=2)
    public void verifyInputText() throws InterruptedException {
        landingPage.loginInputQuery("syedraheman1234@gmail.com");
        Thread.sleep(2000);
    }

    @Test(priority=3)
    public void verifyInputPassword() throws InterruptedException{
        landingPage.loginPasswordQuery("Test@1234");
        Thread.sleep(2000);
    }

    @Test(priority=4)
    public void enterSubmitButton() throws InterruptedException{
        landingPage.submitButton();
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    public void clickCancelButton() throws InterruptedException{
        landingPage.cancelButton();
        Thread.sleep(2000);
    }


    @Test(priority=6)
    public void searchBoxTest(){
        boolean flag = landingPage.validateSearchBoxIsPresent();
        Assert.assertTrue(flag);
    }

    @Test(priority=7)
    public void searchTextTestAndVerifySame() throws InterruptedException {
        landingPage.enterSearchQuery("Solid Men Round Neck Blue, Grey T-Shirt");
        Thread.sleep(2000);
    }

    @Test(priority=8)
    public void clickAndVerifyPage() throws InterruptedException {
        landingPage.clickFlipkartSearch();
        Thread.sleep(2000);
    }

    @Test(priority = 9)
    public void selectTheTshirt() throws InterruptedException{
        landingPage.clickFlipkartTshirt();
        Thread.sleep(15000);
    }

    @Test(priority = 10)
    public void scrollDown() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(5000);
    }

    @Test(priority = 11)
    public void tshirtDisplayed(){
        boolean flag = landingPage.validateTshirtPage();
        Assert.assertTrue(flag);
    }

    @Test(priority = 12)
    public void selectSizeChart() throws InterruptedException{
        landingPage.clickSizeChart();
        Thread.sleep(10000);
    }

    @Test(priority=13)
    public void sizeChartDisplay(){
        boolean flag = landingPage.validateSizeChart();
        Assert.assertTrue(flag);
    }

    @Test(priority = 14)
    public void cancelSizeChart() throws InterruptedException{
        landingPage.cancelSizeChart();
        Thread.sleep(2000);
    }

    @Test(priority = 15)
    public void selectXLSize() throws InterruptedException{
        landingPage.clickSize();
        Thread.sleep(5000);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}