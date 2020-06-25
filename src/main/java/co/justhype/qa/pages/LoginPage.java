package co.justhype.qa.pages;


import co.justhype.qa.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    //Page Factory or OR

    @FindBy(xpath = "//div[@class='menu-evas-shop-container']//a[contains(text(),'Login')]")
    WebElement LoginLink;

    @FindBy(id = "login-email")
    WebElement email;

    @FindBy(id="login-password")
    WebElement Password;

    @FindBy(name = "login")
    WebElement Submit;

    @FindBy(id="recaptcha-anchor")
    WebElement captcha;

    @FindBy(xpath = "//input[@class='shopify-challenge__button btn']")
    WebElement captchasubmit;

    @FindBy(xpath = "//a[contains(text(),'My Account')]")
    WebElement MyAccount;

    @FindBy(xpath = "//nav[@class='myaccount-navigation']//a[contains(text(),'Addresses')]")
    WebElement Addresses;

    @FindBy(id = "user_address")
    WebElement Addaddress;

    @FindBy(xpath="//input[@id='new-first_name']")
    WebElement FirstName;

    @FindBy(xpath="//input[@id='new-last_name']")
    WebElement LastName;

    @FindBy(xpath="//input[@id='new-city']")
    WebElement City;

    @FindBy(xpath="//input[@id='new-zip']")
    WebElement PostalCode;

    @FindBy(id="address_default_address_new")
    WebElement SetAsDefault;

    @FindBy(xpath = "//input[@class='button']")
    WebElement SubmitAddress;


    //Intializing the page Object
    public LoginPage(){

        PageFactory.initElements(driver, this);
    }


    //Actions

    public String validateLoginPageTitle(){
        return driver.getTitle();

    }


    public HomePage validateLoginFunctionality(){

        LoginLink.click();

        email.clear();
        email.sendKeys("0109shipra@gmail.com");
        Password.clear();
        Password.sendKeys("admin@123");
        Submit.click();



        return new HomePage();

    }

    public void addNewAddress()
    {
        captcha.click();
        captchasubmit.click();
        MyAccount.click();
        Addresses.click();
        Addaddress.click();
        FirstName.sendKeys("Shipra");
        LastName.sendKeys("Parihar");
        City.sendKeys("EastLondon");
        PostalCode.sendKeys("5241");
        SetAsDefault.click();
        SubmitAddress.click();





    }

}

