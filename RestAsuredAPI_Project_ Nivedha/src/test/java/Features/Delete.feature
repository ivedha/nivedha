@UserInfoAPI2  @APISuite @Post
Feature: User_Info_APIPOst


  Scenario: Delete the User Informations.
    Given I have valid URL for delete request 
    Then I should receive status code as 204
    And  Verify the id generated is correct
    And Verify the Response Schema
    
    

