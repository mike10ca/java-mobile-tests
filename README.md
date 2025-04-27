# Sample Mobile Automation Framework

This project is a **Java-based mobile automation framework** for testing Android applications using **Appium**, **TestNG**, and **Allure Reports** .
This is a very basic implementation to show how mobile apps can be automated, and of course due to time constraints, there are improvements that can be done depending on project infrastructure setup and best practises used by the team. 

## Further additions can include (out of scope of this framework version): 

### Use Docker:

- To reduce local setup dependancies, use Docker images or create a custom one

### Continuous Integration (CI) Setup:

- Automate test execution in a CI pipeline.
- Download the APK dynamically from GitHub Releases during CI runs.
- Spin up the environment, run tests, and generate reports directly from the workflow.

### Cross-Device Testing with Device Farms:

- Integrate with BrowserStack, Sauce Labs, or Firebase Test Lab.

### Parallel Test Execution:

- Set up parallel execution for faster feedback.
- Use TestNG XML configuration for test grouping and parallelization.

### Screenshots & Logs in Reports:

- Capture screenshots on test failures.
- Attach screenshots and logs to Allure Reports for better debugging.

### Page Object Model (POM) Enhancements:

- Fully implement Page Object Model for better code reusability and maintenance.

### Test Data Management:

- Use external test data files for data-driven testing.
- Enable easier test scaling and coverage.
- Enable usage of different apk versions.

### Refactor code to adhere to best practises:

- Review access modifiers and update them to serve better in ongoing development. What is currently setup is fine for now, but a further adjustments might be required
- Replace hardcoded URLs and app paths with variables
- Remove Thread.sleep timeouts - currently there are some to show animation process due to the nature of this task. These should be removed in further development
- Create additional desired capabilities for different devices and reuse them in tests
- Add Logger to tests and logic
- Other changes based on the project growth strategy

### Advanced Reporting:

- Integrate Extent Reports or Custom Dashboards for team-wide visibility.
- Automatically publish reports after each CI run.

---

## Features
- Appium-based automation for Android.
- TestNG for test orchestration.
- Allure Reports generated through Maven (no CLI needed).
- Supports local emulator testing.

---

## Requirements

Before running tests, ensure you have the following installed:

- Java JDK
- Android Studio & SDK
- Appium
- UI Automator
- Maven


## Running tests

### Start Android emulator device

### Check the emulator is in list of devices
```bash
adb devices
```

### Start Appium
```bash
appium server -p 4725 -a 127.0.0.1 -pa /wd/hub
```

### Run tests using Maven
```bash
mvn clean test
```

### Generate the Allure report
```bash
mvn allure:report
```

### Serve the report locally
```bash
mvn allure:serve
```
The report will open automatically in your default browser.


🧰 Technologies Used
- Java
- Appium
- TestNG
- Allure Reports
- Android Emulator (AVD)