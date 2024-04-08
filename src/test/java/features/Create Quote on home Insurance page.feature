Feature: Create a quote for home on Home insurance Page
           
  Scenario Outline: Verify that user is able to create a quote on Home Insurance page
    Given the user log into the application and select <province> as Province
    And in the Home Page, the user click on the Get a Quote
    
    
    
    

    @LoginTest @SmokeTests
    Examples: 
      | province | message                              | stringData   | intData |
      | Alberta  | Always by your side. Make it Intact. | "StringData" | 1233455 |
     
