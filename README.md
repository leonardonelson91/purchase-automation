# Purchase Automation
This project is meant to serve as an automation interview codebase. It already has Selenium dependencies and ChromeDriver setup, with a WebDriver instance available in the `PurchaseTests.java` class.

# Build Instructions
After cloning the codebase, just run the embedded gradle to build the code:

`./gradlew clean build` on Linux
`gradlew.bat clean build` on Windows

# Interview Tips
* Ask the candidate to write Page Objects in the `com.wipro.quality.engineering.interview.pages` package. You'll evaluate how familiar the person is with the Page Objects pattern.
* Tests must be written in the `PurchaseTests.java` class.
* Selenium operations must be handled in the Page Objects, not in the test class.
* Test the candidate's ability to work with explicit/implicit waits.
