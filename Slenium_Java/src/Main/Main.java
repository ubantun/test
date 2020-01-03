package Main;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.TestCase;
import org.openqa.selenium.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main extends TestCase{
	public  void test(){
	    
        System.out.println("start selenium");
        //如下为对百度网页进行一次搜索的过程

        WebDriver   driver;
        System.setProperty("webdriver.chrome.driver","C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");     

        driver = new ChromeDriver();  
        driver.get("http://www.baidu.com/"); 
        //通过元素属性id=kw找到百度输入框，并输入"Selenium java"
        driver.findElement(By.id("kw")).sendKeys("Selenium java");
        //通过元素属性id=su找到百度一下搜索按钮，并对按钮进行点击操作
        driver.findElement(By.id("su")).click();
        //driver.close();  //暂时注释掉
    }
}
