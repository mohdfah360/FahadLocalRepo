$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/features/TaggedHooksFeature.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login feature",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@First"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is  on homepagq",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.TaggedHooks.user_is_on_homepagq()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to Logq",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.TaggedHooks.user_navigates_to_Logq()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Tite of The page isq",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.TaggedHooks.tite_of_The_page_isq()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});