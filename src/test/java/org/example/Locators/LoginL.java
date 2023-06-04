package org.example.Locators;

import org.openqa.selenium.By;

public enum LoginL {
   USERNAME_LOCATOR(By.xpath("//*[@id='Email']")),
    PASSWORD_LOCATOR(By.xpath("//*[@id='inputPassword']")),
   SUBMIT_LOCATOR(By.id("btnLogin"));
    private final By locator;
    LoginL(By locator){
        this.locator = locator;
    }


    public By by() {
        return this.locator;
    }
}

