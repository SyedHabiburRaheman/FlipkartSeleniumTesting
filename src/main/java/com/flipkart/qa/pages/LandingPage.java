package com.flipkart.qa.pages;

import com.flipkart.qa.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Objects;

public class LandingPage extends TestBase{

    //Page Factory : LOGIN
    @FindBy(xpath = "//div[@class='_1jA3uo _34niwY']")
    WebElement flipkartLogin;

    @FindBy(xpath = "//div[@class='_1XBjg- row']//form//input[@type='text']")
    WebElement flipkartLoginInput;

    @FindBy(xpath = "//div[@class='_1XBjg- row']//form//input[@type='password']")
    WebElement flipkartLoginPassword;

    @FindBy(xpath = "//div[@class='_1XBjg- row']//form//button[@type='submit']")
    WebElement submitButton;

    @FindBy(xpath = "//button[@class='_2AkmmA _29YdH8']")
    WebElement cancelButton;

    //Page Factory : Solid Men Round Neck Blue, Grey T-Shirt
    @FindBy(xpath = "//input[@placeholder='Search for products, brands and more']")
    WebElement searchBox;

    @FindBy(xpath = "//div[@class='IIdQZO _1SSAGr NbTNnk']//a[@class='_2mylT6'][contains(text(),'Solid Men Round Neck Blue, Grey T-Shirt')]")
    WebElement flipkartSearch;

    @FindBy(xpath = "//button[@class='vh79eN']//*[local-name()='svg']")
    WebElement searchButton;

    @FindBy(xpath = "//div[@class='_1HmYoV _35HD7C']//div[2]//div[1]//div[3]//div[1]//div[1]//a[1]")
    WebElement flipkartTshirt;

    @FindBy(xpath = "//div[@id='container']")
    WebElement displayFlipkartTshirt;

    @FindBy(xpath = "//li[@class='_3IpUi6 _2UBURg']")
    WebElement sizeChart;

    @FindBy(xpath = "//div[@class='_3onOd7']")
    WebElement displaySizeChart;

    @FindBy(xpath = "//button[@class='_2AkmmA _2Rr3iH']")
    WebElement cancelSizeChart;

    @FindBy(xpath = "//li[@id='swatch-3-size']//a[@class='_1TJldG _2I_hq9 _2UBURg'][contains(text(),'XL')]")
    WebElement selectSize;


    //Initializing the Page Objects:
    public LandingPage(WebDriver driver) throws AWTException {
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }
    Robot rb = new Robot();

    //Actions:

    public boolean validateLogin(){
        return flipkartLogin.isDisplayed();
    }

    public boolean validateSearchBoxIsPresent(){
        return searchBox.isDisplayed();
    }

    public boolean validateSearch(){
        return flipkartSearch.isDisplayed();
    }

    public void loginInputQuery(String searchText) throws InterruptedException{
        flipkartLoginInput.sendKeys(searchText);
        Thread.sleep(2000);
    }

    public void loginPasswordQuery(String searchText) throws InterruptedException{
        flipkartLoginPassword.sendKeys(searchText);
        Thread.sleep(2000);
    }

    public void submitButton() throws InterruptedException{
        submitButton.click();
    }

    public void cancelButton() throws InterruptedException{
        cancelButton.click();
    }

    public void enterSearchQuery(String searchText) throws InterruptedException {
        searchBox.sendKeys(searchText);
        Thread.sleep(2000);
        searchButton.click();
    }

    public void clickFlipkartSearch() throws InterruptedException {
        searchButton.click();
        Thread.sleep(2000);
    }

    public void clickFlipkartTshirt() throws InterruptedException{
        flipkartTshirt.click();
        Thread.sleep(15000);
    }

    public boolean validateTshirtPage(){
        return displayFlipkartTshirt.isDisplayed();
    }

    public void clickSizeChart() throws InterruptedException{
        sizeChart.click();
        Thread.sleep(5000);
    }

    public boolean validateSizeChart(){
        return displaySizeChart.isDisplayed();
    }

    public void cancelSizeChart() throws InterruptedException{
        cancelSizeChart.click();
        Thread.sleep(2000);
    }

    public void clickSize() throws InterruptedException{
        selectSize.isSelected();
        Thread.sleep(5000);
    }

}