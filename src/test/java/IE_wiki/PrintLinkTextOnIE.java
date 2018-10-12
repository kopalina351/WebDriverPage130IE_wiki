package IE_wiki;


        import org.junit.After;
        import org.junit.Test;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.ie.InternetExplorerDriver;

        import java.io.IOException;


public class PrintLinkTextOnIE {
    WebDriver driver = new InternetExplorerDriver();
    HomePage homePage = new HomePage(driver);

    public PrintLinkTextOnIE() throws IOException {

    }

    @Test
    public void PrintLinkTextOnIE() throws IOException {

        homePage.openBrowserAndHomePage();
        homePage.PrintLinkTextOfListElements();

    }

    @After
    public void tearDown() { homePage.closeBrowser();
    }
}