Feature: Login Functionality

  Background: Navigate to the Website
    Given Navigate to the WebSite

  @Smoketest @RegressionTest
  Scenario: Register into the Website

    And Click on the Element in LeftNav
      | register |

    And User sending the keys in DialogContent
      | firstName       | Ummet       |
      | lastName        | Ozsari      |
      | address         | Mimar sinan |
      | city            | Aydin       |
      | state           | Turkiye     |
      | zipCode         | 09100       |
      | phoneNumber     | 123456789   |
      | ssn             | 454545      |
      | userName        | temmu79     |
      | passWord        | 491700      |
      | confirmPassword | 491700      |
    And Click on the DialogContent
      | register |

    Then Success mesaage should be displayed




