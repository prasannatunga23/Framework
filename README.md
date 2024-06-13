#Task : To Automate the Below Scenario.
#Scenario :- All the users of City `FanCode` should have more than half of their todos task completed.
#Given User has the todo tasks
#And User belongs to the city FanCode
#Then User Completed task percentage should be greater than 50%


Step-by-Step Guide to Set Up and Run the Project
Step 1: Prerequisites

Java Development Kit (JDK) installed (version 8 or higher)
Apache Maven installed

Step 2: Project Structure

Ensure your project has a structure similar to the following:


my-maven-project
│
├── pom.xml
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── example
│   │               └── automation
│   │                   └── UserUtils.java
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── automation
│                       └── UserTodosTest.java
└── src
    └── test
        └── resources
            └── testng.xml 

Step 3: pom.xml
Add dependencies for SLF4J, Logback (or Log4j 2), RestAssured, ExtenetReports and TestNG in your pom.xml:

Step 4 : Create Utilities
Create Utilities like ExtenetReportListeners, Helpers etc

Step 6: Implement Test Class
Create UserTodosTest.java in src/test/java/com/example/automation for TestNG tests using RestAssured and SLF4J.

Step 7: Create TestNG xml file 
Create testng.xml file with Listeners to run teh suite

Step 7: Running Tests
Go to the project directory
Run command mvn clean test to run the test and allure serve allure-results to generate allure report http://192.168.0.100:60611/index.html#
