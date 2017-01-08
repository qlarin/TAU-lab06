Scenario: User change page to registration
 
Given user is on Home page
When user opens Registration link
Then Registration page is shown

Scenario: User register on site

Given user is on Registration page
When user fills firstname
When user fills lastname
When user checks hobby
When user fills phone
When user fills username
When user fills email
When user enters password
When user repeat password
When user clicks submit button
Then success message has appeard