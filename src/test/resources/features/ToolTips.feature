Feature: Hover

  Background:
    When user click the Widgets module
    Then user click the Tool tips button

  Scenario: Tool tips first hover action
    When hover over the hover me to see button
    Then verify "You hovered over the Button" message

  Scenario: Tool tips second hover action
    When hover over the text field hover me to see
    Then verify text field "You hovered over the text field" message