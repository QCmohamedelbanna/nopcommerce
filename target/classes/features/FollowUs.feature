@smoke
  Feature: We have to make sure when users click on social media links, they should direct to their pages
    Scenario: users click on Facebook Link and make sure that redirected them
      Given user click on Facebook link
      Then make sure that user directed to Facebook page

    Scenario: users click on Twitter Link and make sure that redirected them
      Given user click on Twitter link
      Then make sure that user directed to Twitter page

    Scenario: users click on RSS Link and make sure that redirected them
      Given user click on RSS link
      Then make sure that user directed to RSS page

    Scenario: users click on Youtube Link and make sure that redirected them
      Given user click on Youtube link
      Then make sure that user directed to Youtube page