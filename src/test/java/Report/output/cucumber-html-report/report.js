$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:Report/report.feature");
formatter.feature({
  "name": "Life of IT Tester",
  "description": "In order to get good salary\nAS an IT guy\nI want to keep my boss happy",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "I am a tester",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am a \"\u003cTester_Type\u003e\" tester",
  "keyword": "Given "
});
formatter.step({
  "name": "I go to work",
  "keyword": "When "
});
formatter.step({
  "name": "I \"\u003cWork_Output\u003e\" it",
  "keyword": "Then "
});
formatter.step({
  "name": "My boss \"\u003cBoss_Action\u003e\" me",
  "keyword": "And "
});
formatter.step({
  "name": "The developer \"\u003cDeveloper_Reaction\u003e\" me",
  "keyword": "But "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Tester_Type",
        "Work_Output",
        "Boss_Action",
        "Developer_Reaction"
      ]
    },
    {
      "cells": [
        "good",
        "completes",
        "salutes",
        "hates"
      ]
    },
    {
      "cells": [
        "bad",
        "mess",
        "fires",
        "likes"
      ]
    },
    {
      "cells": [
        "avg",
        "satisfies",
        "congratulates",
        "respects"
      ]
    }
  ]
});
formatter.scenario({
  "name": "I am a tester",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am a \"good\" tester",
  "keyword": "Given "
});
formatter.match({
  "location": "report.I_am_a_good_developer(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to work",
  "keyword": "When "
});
formatter.match({
  "location": "report.I_go_to_work()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I \"completes\" it",
  "keyword": "Then "
});
formatter.match({
  "location": "report.I_completes_it_up(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "My boss \"salutes\" me",
  "keyword": "And "
});
formatter.match({
  "location": "report.My_boss_salutes_me(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The developer \"hates\" me",
  "keyword": "But "
});
formatter.match({
  "location": "report.The_tester_hates_me(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "I am a tester",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am a \"bad\" tester",
  "keyword": "Given "
});
formatter.match({
  "location": "report.I_am_a_good_developer(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to work",
  "keyword": "When "
});
formatter.match({
  "location": "report.I_go_to_work()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I \"mess\" it",
  "keyword": "Then "
});
formatter.match({
  "location": "report.I_completes_it_up(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "My boss \"fires\" me",
  "keyword": "And "
});
formatter.match({
  "location": "report.My_boss_salutes_me(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The developer \"likes\" me",
  "keyword": "But "
});
formatter.match({
  "location": "report.The_tester_hates_me(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "I am a tester",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am a \"avg\" tester",
  "keyword": "Given "
});
formatter.match({
  "location": "report.I_am_a_good_developer(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to work",
  "keyword": "When "
});
formatter.match({
  "location": "report.I_go_to_work()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I \"satisfies\" it",
  "keyword": "Then "
});
formatter.match({
  "location": "report.I_completes_it_up(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "My boss \"congratulates\" me",
  "keyword": "And "
});
formatter.match({
  "location": "report.My_boss_salutes_me(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The developer \"respects\" me",
  "keyword": "But "
});
formatter.match({
  "location": "report.The_tester_hates_me(String)"
});
formatter.result({
  "status": "passed"
});
});