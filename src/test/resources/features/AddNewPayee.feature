Feature: Add new payee under pay bills

  Background:
    When the user is	on the page
    When the user is on "Online Banking" page on Dashboard
    When the user is on "Pay Bills" page on Online Banking page



  Scenario: Add a new payee
    Then the user is on the "Add New Payee" tab
    And creates new payee using following information
    |name|The Law Office of Hyde, Price & Scharks|
    |address|100 Same st, Anytown, USA, 10001|
    |account|Checking|
    |details|XYZ account|


    Then message The new payee The Law Office of Hyde, Price & Scharks was succesfully created should be displayed