Feature:
User should be able to login and place the order for selected medicines

  Scenario:
  To verify user should be able to login with userName & Password
    Given Setting RestAssured connection for "TARGET_ACL_API"
    Then user should be able to login
