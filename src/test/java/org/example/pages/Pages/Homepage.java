package org.example.pages.Pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.List;
import java.util.Objects;


import static org.example.Locators.CoursesL.ADD_COURSE;
import static org.example.Locators.HomePageL.*;

public class Homepage {



    public void select_courses() {
        FluentWait waiit = new FluentWait(Hooks.driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1)).ignoring(ElementClickInterceptedException.class);
        waiit.until(ExpectedConditions.presenceOfElementLocated(CATEGORY_ELEMENT.by()));
       Hooks.driver.findElement(CATEGORY_ELEMENT.by()).click();

    }
    public void add_course() throws InterruptedException {
        FluentWait waiit = new FluentWait(Hooks.driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
        waiit.until(ExpectedConditions.presenceOfElementLocated(ADD_COURSE.by()));
        Hooks.driver.findElement(ADD_COURSE.by()).click();

    }
    public String search_course(String course) throws InterruptedException {

        List<WebElement> list_element = Hooks.driver.findElements(LIST_SEARCH_ELEMENTS.by());
        WebElement obj=  Hooks.driver.findElement(LOAD_MORE_ELEMENT.by());

        for (int j= 0; j<list_element.size(); j++) {
            for (int i = 0; i < list_element.size(); i++) {
                list_element = Hooks.driver.findElements(LIST_SEARCH_ELEMENTS.by());
                if (list_element.get(i).getText().equals(course)) {

                    return list_element.get(i).getText();
                }
            }
           obj.click();
        }
        return  null;



    }



}
