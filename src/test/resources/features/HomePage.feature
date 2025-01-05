@smoke
Feature:  Cricket homepage header validation
Scenario: Validate the headers of ESPNcricinfo Website
	Given   I launch chrome browser
  When   	I Entered Url
  Then    I validate homepage title
  Then    validate the header data
  And   	I close browser