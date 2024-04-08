Feature: Application Login and Landing Page Details

  Scenario Outline: Login and Verify Landing page details
    Given the user log into the application and select <province> as Province
    Then in the HomePage, the user assert that the text message <message> is displayed in the page
    And in the LandingPage, the user assert that the text message <message> is displayed in the page
    When in the homePage, the user clicks on the Claims link.

    @LoginTest @SmokeTests
    Examples: 
      | province | message                                    | stringData   | intData |
      | Alberta  | Always by your sidessssss. Make it Intact. | "StringData" | 1233455 |
      | Ontario  | Always by your side. Make it Intact.       | "StringData" | 1233455 |
      | Yukon    | Always by your side. Make it Intact.       | "StringData" | 1233455 |
