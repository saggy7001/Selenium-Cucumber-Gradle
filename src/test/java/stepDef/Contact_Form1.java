package stepDef;

import Objects.BaseSpec;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by SagarGa on 17/05/18.
 */
public class Contact_Form1 {
    WebDriver driver = null;

    @Before
    public void getDriver(){
        driver = BaseSpec.getBaseSpecInstance().before();
    }

    @After
    public void quitDriver(){
        BaseSpec.getBaseSpecInstance().after();
    }

    @Given("^I am on Home Page of \"([^\"]*)\"$")
    public void i_am_on_Home_Page_of(String arg1){
        // Write code here that turns the phrase above into concrete actions
        driver.get(arg1);
    }

    @Given("^Dismiss cookies popup$")
    public void dismiss_cookies_popup(){
        // Write code here that turns the phrase above into concrete actions
        if (driver.findElements(By.id("cn-accept-cookie")).size() != 0){
            new Actions(driver).moveToElement(driver.findElement(By.id("cn-accept-cookie"))).click().build().perform();
        }
    }

    @When("^I enter message as \"([^\"]*)\"$")
    public void i_enter_message_as(String arg1){
        // Write code here that turns the phrase above into concrete actions
        new Actions(driver).moveToElement(driver.findElement(By.className("contact-msg"))).click().sendKeys(driver.findElement(By.className("contact-msg")),arg1).build().perform();
    }

    @When("^I enter full name as \"([^\"]*)\"$")
    public void i_enter_full_name_as(String arg1){
        // Write code here that turns the phrase above into concrete actions
        new Actions(driver).moveToElement(driver.findElement(By.className("contact-input"))).click().sendKeys(driver.findElement(By.className("contact-input")),arg1).build().perform();
    }

    @When("^I enter email as \"([^\"]*)\"$")
    public void i_enter_email_as(String arg1){
        // Write code here that turns the phrase above into concrete actions
        new Actions(driver).moveToElement(driver.findElement(By.id("contact-email"))).click().sendKeys(driver.findElement(By.id("contact-email")),arg1).build().perform();
    }

    @When("^I click on Submit button$")
    public void i_click_on_Submit_button(){
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.cssSelector("input#confirm")).click();
        driver.findElement(By.className("contact-submit")).click();
    }

    @Then("^I see success message$")
    public void i_see_success_message(){
        // Write code here that turns the phrase above into concrete actions
        By selector = By.cssSelector("p.feedback");
        WebDriverWait wait = new WebDriverWait(driver,30000);
        wait.until(ExpectedConditions.elementToBeClickable(selector));
        String status = driver.findElement(selector).getText();
        Assert.assertEquals(status, "Message Sent Successfully!");
    }
}
