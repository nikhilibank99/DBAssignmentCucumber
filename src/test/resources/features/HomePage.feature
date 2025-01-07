@smoke
Feature:  Cricket homepage header validation
Scenario: Validate the headers of ESPNcricinfo Website
Given   I launch browser
When   	I Entered Url
Then    I validate homepage title
And     I validate the header data
Then   	I close browser