@FeatureTag
Feature: Check the Promo Page display
  		As User, I want to check if Promo Page displays correctly

  Background: 
    Given Go to HomePage

  @Test1
  Scenario: Check elements of the Promo Page
    When Click on button1 "جرّب شاهد VIP"
    Then Verify that the URL of the page is "https://shahid-qc-pyco-web.shahid.net/ar/others-promo"
    And Verify that the page display the text "7 أيام تجربة مجانية"

  @Test2
  Scenario: Login to Shahid with empty email
    When Click on button2 "الدخول"
    And Click on button3 "متابعة"
    Then Verify that there is error display with no input "هذه الخانة مطلوبة."

  @Test3
  Scenario Outline: Login to Shahid with Invalid accounts
    When Click on button2 "الدخول"
    And Input Invalid data to <Email Text Box>
    Then Verify that there is error display with invalid data: "صيغة البريد الالكتروني غير صحيحة."

    Examples: 
      | Email Text Box           |
      |                   123456 |
      | nguyenan.feight@gmail    |
      | trankha feight@gmail     |
      | #@%^%#$@#$@#.com         |
      | .email@example.com       |
      | email..email@example.com |
      #| email@-example.com       |
      | email@111.222.333.44444  |
      | email@example..com       |

  @Test4
  Scenario Outline: Login to Shahid with Invalid accounts
    When Click on button2 "الدخول"
    And Input Invalid data to Email Text Box from 'Excel file'
    Then Verify that there is error display with invalid data: "صيغة البريد الالكتروني غير صحيحة."
