@smoke
Feature: As a user, I want to add course and click on Save button, so that i will be able to search for it
  Scenario Outline:  user login with valid data and add course successfully and search fo it
    Given user go to website and login with valid  "<username>" and "<password>"
    When Open courses page from left side navigation  barClick on create course
        And add course info "<coursename>""<selectsubject>"
        And select range "<start>"
        And select teacher"<selectteacher>"and"<CourseCompletionCriteria>"
      Then Back to courses list page
        And assert that course title is displayed by "<coursename>"
    Examples:
      |      username        |  password       |   coursename           | selectsubject |       start   | selectteacher|CourseCompletionCriteria|
      |testregister@aaa.com  |  Wakram_123     |  amrcourseonline100      |Language Arts  |         5   | nada rehan   | Final Assessment      |






