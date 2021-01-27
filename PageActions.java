package pagesactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import basepackage.BaseClass;
import pages.PageLocators;

public class PageActions {
	 
	 BaseClass bc= new BaseClass();
	 PageLocators pl=null;
	  
	WebDriver driver= bc.getDriver();
	  public PageActions(){
		   this.pl= new PageLocators();
		    PageFactory.initElements(  driver, pl);
	  }
	
	
	 public  void click_on_calender(WebElement element){
		 element.click();
	 }
	  public void click_ondate(WebElement element){
		 bc.wait.until(ExpectedConditions.visibilityOf(element)).click();
	  }
	
	  public void click_onmonth( WebElement element){
		 element.click();
	  }
	   public void select_month( WebElement element){
		  for(int i=0;i<=8;i++){
			   element.click();
		  }
		   
	   }
	  public void date( WebElement  element){
        element .click();
 		  
}
 public void clickonyear(WebElement element){
	 element.click();
		    	
		    }
		  public void clickonresult( WebElement element){
			  element.click();
		  }
		   public String  verifyresult(WebElement element){
			String result=element.getText();
			 return result;
		   }
}