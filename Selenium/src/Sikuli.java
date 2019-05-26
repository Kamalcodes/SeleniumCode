import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;

import com.sun.xml.bind.v2.schemagen.xmlschema.List;

import net.lightbody.bmp.proxy.jetty.html.Link;

public class Sikuli {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\dwnloads\\\\selenium\\\\Packages\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
		driver.get("https://www.youtube.com");
		
		Screen s=new Screen();
		
		//Pattern playImg=new Pattern();
		
		//s.wait(playImg,2000);
		s.click();
		s.click();
		
		
//		Pattern pausImg=new Pattern("");
//		s.wait(pausImg,2000);
//		s.click();
//		
//		
//		List<> totalLinks=driver.findElement(By.tagName("a"));
//		
//		int totalLinkSize=totalLinks.size();
//		System.out.println("Total Links by way1:"+totalLinkSize);
//	
//		
//		Link<>Links=driver.findElement(By.tagName("a"));
//		int LinkSize=Links.size();
//		
//		System.out.println(LinkSize);
//		
		
	
	}

}
