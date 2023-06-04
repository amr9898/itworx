package org.example.pages.Pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import static org.example.Locators.LoginL.*;

public class Login {


    public void enter_username( String user_name) {
        Hooks.driver.findElement(USERNAME_LOCATOR.by()).sendKeys(user_name);
    }
    public void enter_pass( String password) {
        Hooks.driver.findElement(PASSWORD_LOCATOR.by()).sendKeys(password);
    }
   public WebElement click_login(){
        return Hooks.driver.findElement(SUBMIT_LOCATOR.by());


   }
}
