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
        //����Ϊ�԰ٶ���ҳ����һ�������Ĺ���

        WebDriver   driver;
        System.setProperty("webdriver.chrome.driver","C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");     

        driver = new ChromeDriver();  
        driver.get("http://www.baidu.com/"); 
        //ͨ��Ԫ������id=kw�ҵ��ٶ�����򣬲�����"Selenium java"
        driver.findElement(By.id("kw")).sendKeys("Selenium java");
        //ͨ��Ԫ������id=su�ҵ��ٶ�һ��������ť�����԰�ť���е������
        driver.findElement(By.id("su")).click();
        //driver.close();  //��ʱע�͵�
    }
}
