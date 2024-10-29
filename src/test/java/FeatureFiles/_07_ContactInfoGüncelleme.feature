Feature: Update contact Functionally

  Background:
    Given Navigate to the ParaBank website

    Scenario: Update Contact Info

      And Send to the Username and Password
      |username |temmu123|
      |password |123456|

      And Click on the Element in DialogContent
        | login             |
        | updateContact     |

      And User send the keys in Dialog
        | firstName   | ummet123      |
        | lastName    | ozsari123     |
        | address     | mimar sinan   |
        | city        | Aydin         |
        | state       | turkiye       |
        | zipCode     | 09100         |
        | phoneNumber | 5554443311    |
        | ssn         | 123456789     |

      And Click on the Element in DialogContent
        | updateContact     |

      And Successfully updated message should be displayed

      And Click on the Element in LeftNav
        | logout |

      And Send to the Username and Password
        | username | temmu123 |
        | password | 123456   |

      Then User confirms update










