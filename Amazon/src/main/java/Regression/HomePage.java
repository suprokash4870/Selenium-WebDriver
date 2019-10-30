package Regression;

import Base.CommonAPI;
import org.openqa.selenium.By;


    public class HomePage extends CommonAPI {
     public void clickAccount(){

         System.out.println(driver.getCurrentUrl());
    }

    public void SignIn(){
        driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span")).click();
    }

    public void WriteValidUserName(String userName)  {
         driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("suprokashsanyal@yahoo.com");
    }
    public void WriteValidPassword(String pass){
         driver.findElement(By.name("password")).sendKeys("ashok4870");
        driver.findElement(By.xpath("//*[@type='submit']")).click();
    }
}
