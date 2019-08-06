Feature: Form Validation

Scenario: Username Validation
Given User is on register page
When username is invalid
Then then show message invalid username

Scenario: Password Validation
Given User is on register page
When password is invalid
Then then show message invalid password


Scenario: First Name Validation
Given User is on register page
When firstname is invalid
Then then show message invalid firstname

Scenario: Last Name Validation
Given User is on register page
When lastname is invalid
Then then show message invalid lastname

Scenario: Gender Validation
Given User is on register page
When gender is invalid
Then then show message invalid gender

Scenario: DOB Validation
Given User is on register page
When dob is invalid
Then then show message invalid dob

Scenario: email Validation
Given User is on register page
When email is invalid
Then then show message invalid email

Scenario: address Validation
Given User is on register page
When address is invalid
Then then show message invalid address

Scenario: city Validation
Given User is on register page
When city is invalid
Then then show message invalid city

Scenario: mobile Validation
Given User is on register page
When mobile is invalid
Then then show message invalid mobile

Scenario: Username Validation
Given User is on register page
When username is invalid
Then then show message invalid username


Scenario: Valid details
Given User is on register page
When all valid details
Then then go to success page









