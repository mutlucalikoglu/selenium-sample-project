package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.security.PublicKey;

public class bein_Page extends AbstractClass{

    WebDriver driver;

    public bein_Page(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

    }

@FindBy(xpath = "//a[@name=\"Subscribe\"]")

    private WebElement subscribeButton;

    public void clickSubscribeButton(){
    clickFunction(subscribeButton);
    }

@FindBy(xpath = "//a[@class='btn-type-2 mt-20-plus bc-subscribe border-none add-card'][1]")

    private WebElement packageButton;

    public void selectPackage(){
        clickFunction(packageButton);

    }
@FindBy(css = "input[name=FirstName]")

    private WebElement firstnameText;

    public void Typefirstname(){
        sendKeysFunction(firstnameText,"Tester");
    }

@FindBy(css = "input[name=LastName")

    private WebElement lastnameText;

    public void Typelastname(){
        sendKeysFunction(lastnameText,"Tst");
    }


@FindBy(css = "input[name=EmailOrPhone]")

    private WebElement emailText;

    public void Emailtext(){

        sendKeysFunction(emailText, randomestring());

    }

@FindBy(css = "input#password")

    private WebElement password;

    public void Passwordsend(){

        sendKeysFunction(password,"Asd123");
    }

@FindBy(css = "input[type=submit]")

    private WebElement submitButton;

    public void Submitbutton(){
        clickFunction(submitButton);

    }

@FindBy(css = "span[role=combobox]")

    private  WebElement payment;

    public void PaymentMethod(){
        clickFunction(payment);
    }

@FindBy(css = "ul#select2-drpPaymentMethod-results>:nth-child(2)")

    private WebElement paymentselect;

    public void Paymentselect(){
        clickFunction(paymentselect);
    }


@FindBy(css = "div.custom-checkbox")

    private WebElement combo;

    public void Comboclick(){
        clickFunction(combo);
    }



@FindBy(css = "div.form-group.position-r.show>:nth-child(3)")

    private WebElement submit2;
    public void SubmitPay(){

        clickFunction(submit2);
    }

/////kart

@FindBy(css = "input#Ecom_Payment_Card_Name")
    private WebElement cardName;
    public void CardName(){
        sendKeysFunction(cardName,"Test tst");
    }

@FindBy(css = "input#Ecom_Payment_Card_Number")
    private WebElement cardnumber;
    public void CardNumber(){
        sendKeysFunction(cardnumber,"5282080044362514");
    }


@FindBy(name = "Ecom_Payment_Card_ExpDate_Month")

    private WebElement monthDropdown;
    public void Selectmont(){

        selectElementFromDropdown(monthDropdown,"04");
    }

@FindBy(name = "Ecom_Payment_Card_ExpDate_Year")
    private WebElement years;
    public void Selectyears(){

        selectElementFromDropdown(years,"2027");

    }

@FindBy(id = "Ecom_Payment_Card_Verification")
    private WebElement cvv;
    public void Cvvinput(){
        sendKeysFunction(cvv,"192");
    }

@FindBy(name = "payment")
    private WebElement pay;
    public void Payment(){

        clickFunction(pay);
    }


}
