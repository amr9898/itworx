package org.example.Locators;

import org.openqa.selenium.By;

public enum HomePageL {

   CATEGORY_ELEMENT(By.id("btnMyCoursesList")),
    LOAD_MORE_ELEMENT(By.xpath("//*[@id='lnkLoadMoreCourses']")),
    LIST_SEARCH_ELEMENTS(By.xpath("//*[@id='lnkListCourseSelcted']"));
    private final By locator;
    HomePageL(By locator){
        this.locator = locator;
    }


    public By by() {
        return this.locator;
    }


}
