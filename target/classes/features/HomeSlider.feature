@Smoke
  Feature: We need to validate that 2 sliders direct users to their pages
    Scenario: check that user click on first slider, it should direct the user to the slider's page
      Given user click on first slider
      Then check that user is directed to the first slider page

    Scenario: check that user click on second slider, it should direct the user to the slider's page
      Given user click on second slider
      Then check that user is directed to the second slider page