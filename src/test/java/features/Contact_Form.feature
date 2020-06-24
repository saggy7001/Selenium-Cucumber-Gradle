Feature: Using Contact Form

  @regression
  Scenario: Filling contact form 1
    Given I am on Home Page of "http://room5.trivago.com/contact/"
    And Dismiss cookies popup
    When I enter message as "some gibberish"
    And I enter full name as "My Name"
    And I enter email as "test@deshtest.com"
    And I click on Submit button
    Then I see success message

  @regression
  Scenario: Filling contact form 2
    Given I am on Home Page of "http://room5.trivago.com/contact/"
    And Dismiss cookies popup
    When I enter message as "some gibberish"
    And I enter full name as "My Name"
    And I enter email as "test@deshtest.com"
    And I click on Submit button
    Then I see success message

  @smoke
  Scenario: Filling contact form 3
    Given I am on Home Page of "http://room5.trivago.com/contact/"
    And Dismiss cookies popup
    When I enter message as "some gibberish"
    And I enter full name as "My Name"
    And I enter email as "test@deshtest.com"
    And I click on Submit button
    Then I see success message