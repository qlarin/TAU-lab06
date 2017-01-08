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
When user opens Blog link
Then Blog page is shown

Scenario: User choose post on blog page

Given user is on Blog page
When user opens Sample post link
Then Sample post page is shown

Scenario: User type a comment on post

Given user is on Sample post page
When user fills author in form
When user fills email in form
When user fills comment in form
When user clicks submit button in form
Then comment is shown on comment list