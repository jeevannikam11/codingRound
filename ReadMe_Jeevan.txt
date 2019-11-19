Design
======
1. We have implemented POM using PageFactory
2. Extent Report is also implemented and available in TestReport folder
3. Retry analyzer is implemented with max retry count 2

Execution
=========
Prerequisites
  - Apache Maven should be installed on the system
  - TestNG should be installed in Eclipse if you are running from Eclipse
  - Maven path should be set on machine
  - Java path should be set on machine
  - Java 8 should be installed on machine

Execute from command Line (Make sure maven in installed and M2 path is set)

1. Download project named as SeleniumProject from GitHub
2. Go to the pom.xml path on command line
3. Execute command "mvn clean install", this will trigger execution
4. After completion of test you can check logs at logs folder and Extent Report at TestReport folder

Execute from Eclipse or any other IDE

1. Download project named as SeleniumProject from GitHub
2. Import maven project in your workspace
3. Right click on project and Go to run as and click on Maven clean
4. Click on Maven install
5. After completion of test you can check logs at logs folder and Extent Report at TestReport folder

Key Features of the Framework

1. Page Object Model is implemented in this framework
2. This Framework has Extent Report to get user friendly reports
3. You can Re-Try failed test cases at same time by giving MaxRetryCount = 2 in config.properties file, this will execute failed test case 2 more times
4. Log4J is implemented in this framework
5. All the configurations are present in config.properties file in resources folder
6. Screenshots of failed test cases are available in screenshots folder under resources folder

Code-Review Comments
====================

1. All the web elements should be at common place, so that they can be easy to manage.
2. Methods like setDriverPath, isElementPresent, waitFor can be written into some utils class as they are commons methods.
3. Elements should have been accessed by @FindBy annotation or uniform method should have been implemented to access them.
4. Explicit wait should have been used instead of thread.sleep.

