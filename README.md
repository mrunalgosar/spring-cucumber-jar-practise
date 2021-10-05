[![Build Status](https://dev.azure.com/mrunal-open-source/spring-cucumber-jar-runner-practise/_apis/build/status/mrunalgosar.spring-cucumber-jar-practise?branchName=master)](https://dev.azure.com/mrunal-open-source/spring-cucumber-jar-runner-practise/_build/latest?definitionId=1&branchName=master)

# Run Cucumber tests from Jar via command line.

```mvn install assembly:single```

```java -cp "target/spring-cucumber-jar-practise-1.0-SNAPSHOT-test-jar-with-dependencies.jar:target/spring-cucumber-jar-practise-1.0-SNAPSHOT-tests.jar" io.cucumber.core.cli.Main classpath:features --glue com.practise.automation```