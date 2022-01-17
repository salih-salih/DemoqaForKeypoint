Feature: Alert,Frame,Windows module

  Background:
    When user click the Alert,Frame,Windows module
    Then user click the Alerts button under menu


  #1.Click me Popup Button-----------------------------#

  Scenario: Click me/Click Button to see alert
    Then click the click me-alertButton
    And verify the popup is open with "You clicked a button" message

  #2. Click me Popup Button-----------------------------#

  Scenario: Click me/On button click, alert will appear after 5 seconds
    Then click the click me-timerAlertButton
    And verify the timer popup is open after 5 seconds with "This alert appeared after 5 seconds" message

  #3. Click me Popup Button-----------------------------#

  Scenario: Click me/On button click, confirm box will appear
    Then click the click me-confirmButton
    And verify the confirm box popup is open with "Do you confirm action?" message

  Scenario: Click me/Ok
    Then click the click me-confirmButton
    Then user click the tamam button on popup
    And verify appearing message OK: "You selected Ok"

  Scenario: Click me/Cancel
    Then click the click me-confirmButton
    Then user click the iptal button on popup
    And verify appearing message Cancel: "You selected Cancel"

  #4.Click me Popup Button-----------------------------#

  Scenario: Click me/On button click, prompt box will appear
    When click the click me-promtButton
    And verify the promt box popup is open with "Please enter your name" message

  Scenario: Click me/enter your name
    When click the click me-promtButton
    Then send any name "KeyPoint" in to the box on popup
    And verify "You entered KeyPoint" message is appeared

  Scenario: Click me/previous entered name check
    When click the click me-promtButton
    Then send any name "KeyPoint" in to the box on popup
    Then click the iptal button on popup
    And verify the previous Name is already existed