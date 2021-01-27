package basepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	 public static BaseClass bs;
	 private static WebDriver driver;
	  public  int pageLoad_time=30;
	 
	   public static  WebDriverWait wait;
	  
	    public BaseClass(){
		   if(driver==null){
			    System.setProperty("webdriver.chrome.driver", "D://SelGrid//chromedriver.exe");
			    driver= new ChromeDriver();
			     driver.manage().timeouts().implicitlyWait(pageLoad_time, TimeUnit.SECONDS);
			   wait = new WebDriverWait(driver,10);
			    driver.manage().window().maximize();
			    
		   }
		   
	   }
	    public static  void persetup(){
	    	 bs= new BaseClass();
	    	
	    }
	    
	     public static  void launchurl(String url){ 
	    	   driver.get(url);
	     }
	     public WebDriver getDriver(){
	    	  return driver;
	     }
	    	 
public void teardown(){
	    	if(driver!=null){
	    		 driver.quit();
	    	}
	    	 driver=null;
	    	
	    }
	  
	

}
