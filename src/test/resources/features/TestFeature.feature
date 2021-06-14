Feature: Visit a page and click on a link

@test
  Scenario: Visit a page and check the page title
    Given I go to url https://www.bbc.co.uk/
    When I click in signIn tab
    When I enter userName kerry-anne.kane@opencastsoftware.com
    And I enter password mypassword1
    And I click on SignIn button
    Then I verify Your account is displayed


