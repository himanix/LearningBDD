Feature: Google Home Page
  Background: Open Google HomePage
    When user gets the url

    @regression
    Scenario Outline: Verify google search with valid keywords
      Given user enters "<keyword>" in search box
      When user clicks on search button
      Then links are displayed according to "<keyword>"
      @smoke
      Examples:
      | keyword |
      | book   |
      | money  |
      | picnic |

    Scenario Outline: Verify google page title
      When user fetches the title of the page
      Then user verifies the "<title>"
      Examples:
      | title |
      | Google |