$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SecondFeaturefiletagging.feature");
formatter.feature({
  "line": 2,
  "name": "Facebook application testing",
  "description": "",
  "id": "facebook-application-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@2ndfeaturefile"
    }
  ]
});
formatter.scenario({
  "line": 17,
  "name": "Create a Deal",
  "description": "",
  "id": "facebook-application-testing;create-a-deal",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@End2End"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "This is a deal test case",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingStepDefination.this_is_a_deal_test_case()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("tagging.feature");
formatter.feature({
  "line": 2,
  "name": "Free CRM application testing",
  "description": "",
  "id": "free-crm-application-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@1stfeature"
    }
  ]
});
formatter.scenario({
  "line": 65,
  "name": "validate a report",
  "description": "",
  "id": "free-crm-application-testing;validate-a-report",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 64,
      "name": "@End2End"
    }
  ]
});
formatter.step({
  "line": 66,
  "name": "This is a report test",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingStepDefination.this_is_a_report_test()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 69,
  "name": "Validate the Incorrect Report",
  "description": "",
  "id": "free-crm-application-testing;validate-the-incorrect-report",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 68,
      "name": "@End2End"
    }
  ]
});
formatter.step({
  "line": 70,
  "name": "This report is Incorrect.",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 73,
  "name": "Application Logout",
  "description": "",
  "id": "free-crm-application-testing;application-logout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 72,
      "name": "@End2End"
    }
  ]
});
formatter.step({
  "line": 74,
  "name": "This is a logout test",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingStepDefination.this_is_a_logout_test()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 77,
  "name": "browser closed",
  "description": "",
  "id": "free-crm-application-testing;browser-closed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 76,
      "name": "@End2End"
    }
  ]
});
formatter.step({
  "line": 78,
  "name": "This is a close broswer test",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingStepDefination.this_is_a_close_broswer_test()"
});
formatter.result({
  "status": "skipped"
});
});