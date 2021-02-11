Feature: Purchase an insurance as Single

Scenario: A Single user with Employed public service =Yes and Selbstbeteiligung purchasing insurance 

Given Initialize the Browser with Chrome
And Navigate to "ClarkHomePage"
And User clicks Akzeptieren button
And user clicks on Angebote menu item 
And user selects "Privathaftpflicht" in insurance type page  
When user selects Single
And User Selects Emeployed in public service
And user selects Sellbeteiligung
Then user is able to purchase insurance