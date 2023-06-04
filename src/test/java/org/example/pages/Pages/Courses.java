package org.example.pages.Pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;


import static org.example.Locators.CoursesL.*;

public class Courses {





    private void scrolldown() {
        WebElement table_element = Hooks.driver.findElement(RADIO_BUTTON_RANGE_GRADE.by());
        String scribt="arguments[0].scrollIntoView();";
        ((JavascriptExecutor)Hooks.driver).executeScript(scribt,table_element);


    }

    public void add_username_personal_info(String user_name ) throws InterruptedException {

        FluentWait waiit = new FluentWait(Hooks.driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
        waiit.until(ExpectedConditions.presenceOfElementLocated(USER_NAME.by()));
        Hooks.driver.findElement(USER_NAME.by()).sendKeys(user_name);

    }

    public void select_subject(String index) {

        WebElement dropdown = Hooks.driver.findElement(DROPDOWN_SUBJECT.by());
        Select select= new Select(dropdown);
        select.selectByVisibleText(index);

    }



    public void Grade_or_Range(String range  ) {
        WebElement dropdown = Hooks.driver.findElement(By.xpath("//*[@id='courseGrade']"));
        Select select= new Select(dropdown);
        select.selectByVisibleText(range);


    }

    public void select_teacher (String teacher) throws InterruptedException {
        Hooks.driver.findElement(RADIO_BUTTON_TEACHER.by()).click();
        scrolldown();
        Hooks.driver.findElement(DROPDOWN_TEACHER.by()).click();
        List<WebElement> list=Hooks.driver.findElements(DROPDOWN_TEACHER_CHOICES.by());

        for(int j=0;j<list.size();j++) {
            if(list.get(j).getText().contains(teacher)) {

                list.get(j).click();
                break;
            }

        }
    }
    public void Course_Completion_Criteria (String Course) {
            List<WebElement> list=Hooks.driver.findElements(By.xpath("//*[contains(@class,'lms-position-relative')]"));
            for(int j=0;j<list.size();j++) {
                if(list.get(j).getText().contains(Course)) {
                    System.out.println(list.get(j).getText().contains(Course));
                    list.get(j).click();
                    break;
                }

            }
        }
    public void create_course () {
        Hooks.driver.findElement(CREATE_COURSE.by()).click();
        FluentWait waiit = new FluentWait(Hooks.driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
        waiit.until(ExpectedConditions.presenceOfElementLocated(NAME_COURSE.by()));



    }
}



