import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestNew {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://ru.wikipedia.org/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

//    @Test
//    public void testNew() throws Exception {
//        driver.get(baseUrl + "/wiki");
//        driver.findElement(By.id("searchInput")).clear();
//        driver.findElement(By.id("searchInput")).sendKeys("арбуз");
//        driver.findElement(By.id("searchButton")).click();
//        driver.findElement(By.linkText("Арбуз")).click();
//        try {
//            assertTrue(isElementPresent(By.xpath("//*[@id='mw-content-text']/table[1]/tbody/tr[2]/td/span[1]/a/img")));
//        } catch (Error e) {
//            verificationErrors.append(e.toString());
//        }
//        try {
//            assertTrue(isElementPresent(By.xpath("//*[@id='mw-content-text']/p[1]/b")));
//        } catch (Error e) {
//            verificationErrors.append(e.toString());
//        }
//    }

    @Test
    public void testMy() throws Exception {
        driver.get(baseUrl);
        driver.findElement(By.id("searchInput")).click();
        driver.findElement(By.id("searchInput")).sendKeys("Хоббит");
        driver.findElement(By.id("searchButton")).click();
        String text = driver.findElement(By.xpath("//*[@id='mw-content-text']/table[1]/tbody/tr[7]/td/p/span")).getText();
        String expected = "21 сентября 1937";
        assertEquals(expected, text);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}

