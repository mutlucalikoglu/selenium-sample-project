package stepDefinition;

import PageObjectModel.bein_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class bein_test_steps {

    private WebDriver driver;
    bein_Page bein_page = new bein_Page();

    @Given("^Navigate to bein sports$")
    public void navigate_to_bein_sports() throws Throwable {
    driver = Driver.getDriver();

    driver.manage().window().maximize();
    driver.get("https://connect-au.beinsports.com/en");
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @Given("^Click Subscribe button$")
    public void click_Subscribe_button() throws Throwable {
    bein_page.clickSubscribeButton();
    }

    @Given("^Register to One Month Package$")
    public void register_to_One_Month_Package() throws Throwable {
    bein_page.selectPackage();
    }

    @Then("^Validate package price$")
    public void validate_package_price() throws Throwable {

    }

    @Given("^Fill Create Account form with a random email$")
    public void fill_Create_Account_form_with_a_random_email() throws Throwable {
    bein_page.Typefirstname();
    bein_page.Typelastname();
    bein_page.Emailtext();
    bein_page.Passwordsend();
    bein_page.Submitbutton();
    }

    @Given("^Make Payment with Credit Card$")
    public void make_Payment_with_Credit_Card() throws Throwable {
        bein_page.PaymentMethod();
        bein_page.Paymentselect();
        Thread.sleep(2000);
        bein_page.Comboclick();
        bein_page.SubmitPay();

    }

    @Then("^Expect for a total charge of$")
    public void expect_for_a_total_charge_of() throws Throwable {

    }


    @Given("^Provide a test card data and confirm payment\\(Do not enter a real card data\\)$")
    public void provide_a_test_card_data_and_confirm_payment_Do_not_enter_a_real_card_data() throws Throwable {
        bein_page.CardName();
        bein_page.CardNumber();
        bein_page.Selectmont();
        bein_page.Selectyears();
        bein_page.Cvvinput();
        bein_page.Payment();

    }

    @Then("^Expect for a error text and finish test with success$")
    public void expect_for_a_error_text_and_finish_test_with_success() throws Throwable {

    }

}
