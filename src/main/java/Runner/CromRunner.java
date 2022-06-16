package Runner;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeTest;
public class CromRunner {

    @BeforeTest
    public static void Setup(){
        Selenide.open("https://redmed.ge/ka/user/register");
        Configuration.browserSize = "1920x1080";

        

    }
}
