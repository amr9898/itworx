package org.example.Locators;

import org.openqa.selenium.By;

public enum CoursesL {
    ADD_COURSE(By.id("btnListAddCourse")),
    RADIO_BUTTON_TEACHER(By.xpath("//*[@id='lblGetSelectedSubjectTeachers']/i")),
    RADIO_BUTTON_RANGE_GRADE(By.xpath("//*[@id='divAddEditTGradeRange']/label[1]/i")),
    LEFT_SELECTOR(By.xpath("//*[@id='divAddEditTGradeRange']/span/table/tbody/tr/td/div[2]")),
    RIGHT_SELECTOR(By.xpath("//*[@id='divAddEditTGradeRange']/span/table/tbody/tr/td/div[3]")),
    USER_NAME(By.xpath("//*[@id='txtCourseName']")),
    DROPDOWN_SUBJECT(By.xpath("//*[@data-role='listview']")),
    DROPDOWN_TEACHER(By.xpath("//*[@id='teacherOnBehalf']/div[1]/span")),
    DROPDOWN_TEACHER_CHOICES(By.xpath("//*[contains(@class,'ui-select-choices')]")),
    CREATE_COURSE(By.id("btnSaveAsDraftCourse")),
    NAME_COURSE(By.id("courseNameView")),

    ;

    private final By locator;
    CoursesL(By locator){
        this.locator = locator;
    }


    public By by() {
        return this.locator;
    }
}
