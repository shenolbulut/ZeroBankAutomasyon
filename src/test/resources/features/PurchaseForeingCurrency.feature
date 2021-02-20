

Feature: Purcahse Foreign Currency
    Background: 
      Given the user is	on the page
      Given the user is on "Online Banking" page on Dashboard
      Given the user is on "Pay Bills" page on Online Banking page
      Given the user is on the "Purchase Foreign Currency" tab

    Scenario: Available currency
      Then following currencies should be available
    |Select One|
    |Australia (dollar)|
    |Canada (dollar)|
    |Switzerland (franc)|
    |China (yuan)|
    |Denmark (krone)|
    |Eurozone (euro)|
    |Great Britain (pound)|
    |Hong Kong (dollar)   |
    |Japan (yen)|
    |Mexico (peso)|
    |Norway (krone)|
    |New Zealand (dollar)|
    |Sweden (krona)      |
    |Singapore (dollar)|
    |Thailand (baht)   |

    Scenario: Error	message for	not selecting currency
      When user tries to calculate cost without selecting currency
      Then error message displayed
  @wip

    Scenario: Error message for not entering value
      When user tries to calculate cost without entering a value
      Then error message displayed

