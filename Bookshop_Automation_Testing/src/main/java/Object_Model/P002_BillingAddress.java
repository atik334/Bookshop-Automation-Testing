package Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P002_BillingAddress {
	
	 WebDriver driver = null;
		
		public P002_BillingAddress(WebDriver driver) {
			this.driver=driver;
		}
		
		By namefield = By.xpath("//input[@id='billing_first_name']");
		By billadd = By.xpath("//input[@id='billing_address_1']");
		By district =By.xpath("//*[@id='billing_state']");
		By phone = By.xpath("//input[@id='billing_phone']");
		By email =By.xpath("//input[@id='billing_email']");
		By createacc=By.xpath("//input[@id='createaccount']");
		By createpass = By.xpath("//input[@id='account_password']");
		By comment=By.xpath("//textarea[@id='order_comments']");
		
	    public void NameField(String n) {
			
			driver.findElement(namefield).sendKeys(n);;
		}
        public void BillingAddress(String b) {
			
			driver.findElement(billadd).sendKeys(b);;
		}
        
        public void selectDistrict() {
        	
        	Select sd = new Select(driver.findElement(district));
        	sd.selectByVisibleText("Satkhira");
       	
        }
        public void PhoneNumber(String p) {
			
 			driver.findElement(phone).sendKeys(p);;
 		}
      public void Email(String e) {
			
 			driver.findElement(email).sendKeys(e);;
 		}
      public void CreateAccount() {
			
			driver.findElement(createacc).click();
		}
      public void CreatePassword(String p) {
			
			driver.findElement(createpass).sendKeys(p);;
		}
      public void addComment(String c) {
    	  driver.findElement(comment).sendKeys(c);;
    	  
    	  
      }
 	    
	    
	    

}
