@FeatureTag
Feature: Check the Promo Page display
				As User, I want to check if Promo Page displays correctly

  @ScenarioTag
  Scenario: Check elements of the Promo Page
    Given Go to HomePage
    When Click on button "جرّب شاهد VIP"
    Then Verify that the URL of the page is "https://shahid-qc-pyco-web.shahid.net/ar/others-promo"
    And Verify that the page display the text "7 أيام تجربة مجانية"


#	Scenario Outline: Login to Shahid with Invalid accounts
#		Given Go to HomePage
#		When Click on button "الدخول"
#		And Click on button "متابعة"
#		Then Verify that there is error display with no input "هذه الخانة مطلوبة."
#		And Input Invalid data to <Email Text Box>
#		And Verify that there is error display with invalid data: "صيغة البريد الالكتروني غير صحيحة."
#			
#	Examples:
#	|Email Text Box|
#	|123456	|