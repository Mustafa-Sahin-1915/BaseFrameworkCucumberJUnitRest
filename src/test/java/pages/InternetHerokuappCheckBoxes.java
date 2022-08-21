package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class InternetHerokuappCheckBoxes extends BasePage{

    public InternetHerokuappCheckBoxes() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    public WebElement checkbox1;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    public WebElement checkbox2;

    @FindBy(xpath = "//input[@type='checkbox']")
    public List<WebElement> checkboxes;

}
