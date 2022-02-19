@UserInfoAPI2  @APISuite @Post
Feature: User_Info_APIPOst


  Scenario: User Information verification with valid details
    Given I have valid URL for put request 
    Then I should receive status code as 200
    And  Verify the id generated is correct
    And Verify the Response Schema
    
    

