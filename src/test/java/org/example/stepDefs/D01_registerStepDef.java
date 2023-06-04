package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.Pages.Courses;
import org.example.pages.Pages.Homepage;
import org.example.pages.Pages.Login;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;

import java.time.Duration;

import static org.example.Locators.CoursesL.ADD_COURSE;

public class D01_registerStepDef {
    Homepage home = new Homepage();
    Courses courses =new Courses();


    @Given("user go to website and login with valid  {string} and {string}")
    public void userGoToWebsiteAndLoginWithValidAnd(String arg0, String arg1) {
        Login login=new Login();
        login.enter_username(arg0);
        login.enter_pass(arg1);
        login.click_login().click();

    }

    @When("Open courses page from left side navigation  barClick on create course")
    public void openCoursesPageFromLeftSideNavigationBarClickOnCreateCourse() throws InterruptedException {
        home.select_courses();
        home.add_course();
    }

    @And("add course info {string}{string}")
    public void addCourseAnd(String coursename, String subject) throws InterruptedException {
        courses.add_username_personal_info(coursename);
        courses.select_subject(subject);
    }

    @And("select range {string}")
    public void selectRangeAnd(String start) {
    courses.Grade_or_Range(start);
    }

    @And("select teacher{string}and{string}")
    public void selectTeacherAnd(String arg0, String arg1) throws InterruptedException {

        courses.select_teacher(arg0);
        courses.Course_Completion_Criteria(arg1);
        courses.create_course();
    }

    @Then("Back to courses list page")
    public void backToCoursesListPage() {
        home.select_courses();
    }

    @And("assert that course title is displayed by {string}")
    public void assertThatCourseTitleIsDisplayed(String coursename ) throws InterruptedException {

       Assert.assertEquals(home.search_course(coursename) , coursename);
    }


   

}
