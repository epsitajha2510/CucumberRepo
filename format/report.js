$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM login feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters the username and the Password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginstepDefination.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 245786000,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepDefination.LoginstepDefination.user_is_already_on_Login_Page(LoginstepDefination.java:21)\r\n\tat ✽.Given user is already on Login Page(login.feature:5)\r\n",
  "status": "pending"
});
formatter.match({
  "location": "LoginstepDefination.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginstepDefination.user_enters_the_username_and_the_Password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginstepDefination.user_clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginstepDefination.user_is_on_home_page()"
});
formatter.result({
  "status": "skipped"
});
});