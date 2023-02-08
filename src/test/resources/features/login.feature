Feature: Verify login OrangeHRM
  In order to perform login
  As a user
  I have to enter username and password

  Scenario: Login to the OrangeHRM with valid user
    Given User navigate to OrangeHRM website  "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And User is on login page
    When User enter valid username as "Admin"
    And User enter valid password as "admin123"
    And User click on OrangeHRM login button
    Then Dash  Board should be displayed
