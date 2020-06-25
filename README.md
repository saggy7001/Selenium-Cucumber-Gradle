# Selenium-Cucumber-Gradle

### Intention: Get rid of JUnit test runner
While exploring alternatives I found a way that solves this problem and that is Gradle tasks.
I like Gradle over maven as it offers many more advantages you can explore those at https://gradle.org/features/

#### This project uses below tools, </br>
Build tool: Gradle </br>
UI Automation: Selenium </br>
Testing Framework: JUnit 

#### If you explore code you will find test runner but that is not used

#### Execution choices:
Gradle: To use this open your terminal and type `gradlew cucumber` </br>
JUnit: Open test runner and run it. 

#### Using Tags: 
Traditionally we use to add tags in test runner, we can do it in Gradle by using --tags   
