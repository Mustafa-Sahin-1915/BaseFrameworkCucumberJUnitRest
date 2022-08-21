package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.injectors.SetterInjection;
import pages.InternetHerokuappCheckBoxes;
import utilities.Driver;

public class Hooks {

    @Before(value = "@ui")
    public void setUp(){

    }

    @After(value = "@ui")
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver())
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        Driver.closeDriver();
    }
}
