package Main;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
public class test {
	private static WebDriver driver;
	private static DesiredCapabilities browser;
	
	public static void runBaiduTest(WebDriver driver){
		driver.get("https://www.baidu.com"); 
		driver.findElement(By.id("kw")).sendKeys("selenium"); 
		driver.findElement(By.id("su")).click(); 
		driver.quit();
	}
	public static void main(String[] args) throws Exception { 
		String browsers [];
		browsers = new String[3]; 
		browsers[0] = "chrome"; 
		browsers[1] = "ie" ; 
		browsers[2] = "ff";
		for (int i=0;i<1;i++){ 
			System.out.println(browsers[i]); 
			if(browsers[i].equals("chrome")) 
				browser = DesiredCapabilities.chrome();
			else if(browsers[i].equals("ff")) 
				browser = DesiredCapabilities.firefox();
			else if(browsers[i].equals("ie")) 
				browser =DesiredCapabilities.internetExplorer();
			else 
				System.out.println("browser 参数有误，只能为 ie、 ff、chrome");
			driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"),browser);
			runBaiduTest(driver);
		}
	}
}
