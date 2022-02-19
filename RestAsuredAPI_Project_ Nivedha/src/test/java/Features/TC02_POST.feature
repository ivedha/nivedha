@UserInfoAPI2  @APISuite @Post
Feature: User_Info_APIPOst


  Scenario: User Information verification with valid details
    Given I have valid URL for post request 
    Then I should receive status code as 201
    And  Verify the id generated is correct
    And Verify the Response Schema
    
    

