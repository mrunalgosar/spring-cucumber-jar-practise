[![Build Status](https://dev.azure.com/mrunal-open-source/spring-cucumber-jar-runner-practise/_apis/build/status/mrunalgosar.spring-cucumber-jar-practise?branchName=master)](https://dev.azure.com/mrunal-open-source/spring-cucumber-jar-runner-practise/_build/latest?definitionId=1&branchName=master)

[![CircleCI](https://circleci.com/gh/mrunalgosar/spring-cucumber-jar-practise.svg?style=svg)](https://app.circleci.com/pipelines/github/mrunalgosar/spring-cucumber-jar-practise)

# Run Cucumber tests from Jar via command line.

```mvn install```

```java -cp "target/dependency/*" io.cucumber.core.cli.Main classpath:features --glue com.practise.automation```