package Friday;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
	
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.setExperimentalOption("excludeSwitches",

        Arrays.asList("disable-popup-blocking"));
		
		String month="Sep";
		
		String date="30";
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.path2usa.com/travel-companions");
	    
	    Thread.sleep(5000);
	 
	    
        driver.findElement(By.id("travel_date")).click();
        
        //  dec 25
      
      
      while(!driver.findElement(By.xpath("//div[@class='datepicker-days']  //th[@class='datepicker-switch']")).getText().contains(month))
      {
 
    	  driver.findElement(By.xpath("//div[@class='datepicker-days']  //th[@class='next']")).click();
      }
	    
      
      Thread.sleep(5000);

      
     // day 25
      
        List<WebElement> li= driver.findElements(By.xpath("//td[@class='day']"));
        
        for(int i=0;i<li.size();i++)
        {
        	
        	  if(li.get(i).getText().equalsIgnoreCase(date))
        	  {
        		  li.get(i).click();
        		  break;
        	  }
        	
        }
        
     
      
	}

}
