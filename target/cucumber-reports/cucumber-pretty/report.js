$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/DesktopFeatures.feature");
formatter.feature({
  "line": 1,
  "name": "Verify all Items are Present in Desktops tab",
  "description": "",
  "id": "verify-all-items-are-present-in-desktops-tab",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "Multiple items present on show all desktops",
  "description": "",
  "id": "verify-all-items-are-present-in-desktops-tab;multiple-items-present-on-show-all-desktops",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@SuccessTest"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "User click ADD TO CART option on \u0027\u003cItemName\u003e\u0027 item",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User select quantity \u0027\u003c1\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User click add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User should see a message \u0027Success: you have added HP LP 3065 to your shopping cart!\u0027",
  "keyword": "Then "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "verify-all-items-are-present-in-desktops-tab;multiple-items-present-on-show-all-desktops;",
  "rows": [
    {
      "cells": [
        "ItemName",
        "Quantity"
      ],
      "line": 27,
      "id": "verify-all-items-are-present-in-desktops-tab;multiple-items-present-on-show-all-desktops;;1"
    },
    {
      "cells": [
        "HP LP3065",
        "1"
      ],
      "line": 28,
      "id": "verify-all-items-are-present-in-desktops-tab;multiple-items-present-on-show-all-desktops;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2854648000,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on Retail website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click on Desktops tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User click on Show all desktops",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTestStepDefinition.user_is_on_Retail_website()"
});
formatter.result({
  "duration": 3424136200,
  "status": "passed"
});
formatter.match({
  "location": "DesktopStepDefinition.user_click_on_desktops_tabs()"
});
formatter.result({
  "duration": 456546300,
  "status": "passed"
});
formatter.match({
  "location": "DesktopStepDefinition.user_click_on_Show_all_desktops()"
});
formatter.result({
  "duration": 45080595500,
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d88.0.4324.150)\nBuild info: version: \u00273.7.0\u0027, revision: \u00272321c73\u0027, time: \u00272017-11-02T22:22:35.584Z\u0027\nSystem info: host: \u0027CON10477L-W10\u0027, ip: \u0027192.168.0.191\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.150, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\\Users\\ZOHAL~1.AMI\\AppDat...}, goog:chromeOptions: {debuggerAddress: localhost:61439}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: ed8e3f04b034b3e6ad62aca84ef443aa\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy22.click(Unknown Source)\r\n\tat utilities.WebDriverUtility.clickOnElement(WebDriverUtility.java:23)\r\n\tat pageObjects.DesktopPageObj.ShowAllDesktopsOption(DesktopPageObj.java:43)\r\n\tat stepDefinitions.DesktopStepDefinition.user_click_on_Show_all_desktops(DesktopStepDefinition.java:38)\r\n\tat ✽.And User click on Show all desktops(Features/DesktopFeatures.feature:7)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 28,
  "name": "Multiple items present on show all desktops",
  "description": "",
  "id": "verify-all-items-are-present-in-desktops-tab;multiple-items-present-on-show-all-desktops;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@SuccessTest"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "User click ADD TO CART option on \u0027HP LP3065\u0027 item",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User select quantity \u0027\u003c1\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User click add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User should see a message \u0027Success: you have added HP LP 3065 to your shopping cart!\u0027",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "HP LP3065",
      "offset": 34
    }
  ],
  "location": "DesktopStepDefinition.user_click_add_to_cart_option(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003c1\u003e",
      "offset": 22
    }
  ],
  "location": "DesktopStepDefinition.user_select_quantity(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DesktopStepDefinition.user_click_add_to_cart_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DesktopStepDefinition.user_should_see_a_message_success_you_have_added_HP_Lp_to_your_shopping_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 685648300,
  "status": "passed"
});
});