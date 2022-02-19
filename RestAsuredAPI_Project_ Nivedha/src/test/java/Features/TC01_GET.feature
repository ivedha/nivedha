@UserInfoAPI @APISuite @Get
Feature: User_Info_API


  Scenario: User Information verification with valid details
    Given I have valid access token and valid URL
    Then I should receive status code as 200

  Scenario Outline: Verify the value of first_name for id 10 is ‘Byron’
  
  Given I have valid access token and valid URL
  Then I should receive status code as 200
  And for "<id>" the value of "<first_name>" should be correct
  
  Examples:
   | first_name | id  |
   | Byron      | 10  |
