package week11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Week11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\22R01A6742\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
    
		Actions builder = new Actions(driver);
		driver.get("https://www.google.co.in/");
    
		WebElement searchBar = driver.findElement(By.name("q"));
		searchBar.sendKeys("Myntra");
		Thread.sleep(500);
    
		searchBar.submit();	WebElement myntraLink = driver.findElement(By.xpath("(//h3[contains(text(),'Myntra: Online Shopping for Women, Men, Kids Fashi')])[1]"));
		myntraLink.click();
    
		WebElement profileHyperLink = driver.findElement(By.xpath("(//span[normalize-space()='Profile'])[1]"));
		profileHyperLink.click();
    
		WebElement loginBtn = driver.findElement(By.xpath("(//a[normalize-space()='login / Signup'])[1]"));
		loginBtn.click();
    
		WebElement mobileNo = driver.findElement(By.xpath("(//input[@type='tel'])[1]"));
		mobileNo.sendKeys("9948621019");
    
		WebElement continueBtn = driver.findElement(By.xpath("(//div[@class='submitBottomOption'])[1]"));
		continueBtn.click();
		Thread.sleep(500);
}

}
