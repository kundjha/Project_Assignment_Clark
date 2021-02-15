Feature: Purchase an insurance as Single

Scenario: A Single user with Employed public service =Yes and Selbstbeteiligung=Yes purchasing insurance 

Given Initialize the Browser with Chrome
And Navigate to ClarkHomePage
When User selects Privathaftpflicht category 
And user type is  Single_PublicServant_YesDeductible
Then user is able to purchase insurance

Scenario: A Single user with Employed public service =Yes and Selbstbeteiligung=No purchasing insurance 

Given Initialize the Browser with Chrome
And Navigate to ClarkHomePage
When User selects Privathaftpflicht category 
And user type is  Single_PublicServant_NoDeductible
Then user is able to purchase insurance


