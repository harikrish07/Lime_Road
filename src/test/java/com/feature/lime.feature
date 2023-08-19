Feature: Lime road

Background:
Given user open the "chrome" browser

Scenario: To add kid Tees into cart
Given Launch the url "https://www.limeroad.com/"
When click the shop men
Then user lands on HomePage
Given user click on kids option in HomePage
When user click on striped tees option
And user click blue cotton T-shirt
Then user select the t-shirt size
And user click on Add to cart button