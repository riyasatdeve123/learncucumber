Feature: Verify login OrangeHRM
  In order to perform login
  As a user
  I have to enter username and password

  Scenario Outline: Login to the OrangeHRM with valid user
    Given User navigate to OrangeHRM website  "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And User is on login page
    When User enter valid username as "<username>"
    And User enter valid password as "<password>"
    And User click on OrangeHRM login button
    Then Dash  Board should be displayed

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | admin    | Admin123 |
      | Admin    | admin123 |
      | admin    | Adom123  |
