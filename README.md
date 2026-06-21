# SauceDemo-Testing

This project is a comprehensive automation suite designed to validate the core user journey of the SauceDemo e-commerce application. It bridges the gap between **Manual QA Analysis** and **Test Automation**.

## 📝 QA & Testing Approach
As a QA Engineer, I first analyzed the application manually to identify the critical user flows (Happy Path). I then transformed these manual test scenarios into a scalable automation framework.

### Test Scenarios Covered
| Test Case ID | Manual Scenario | Automation Status |
| :--- | :--- | :--- |
| TC01 | Verify Login functionality with valid credentials | Automated |
| TC02 | Validate Navigation (Hamburger Menu -> About -> Back) | Automated |
| TC03 | Add product to cart and verify cart count | Automated |
| TC04 | Perform E2E Checkout process (Name, Zip, Finish) | Automated |
| TC05 | Verify Logout functionality and session termination | Automated |

## 🛠 Tech Stack
* **Language:** Java (JDK 24)
* **Automation:** Selenium WebDriver
* **Framework:** TestNG (Page Object Model - POM)
* **Build Tool:** Maven

## 🚀 Key Features of this Automation
1. **POM Pattern:** Separated test logic from page locators for better maintainability.
2. **Dynamic Handling:** Used `WebDriverWait` to handle page loading and dynamic elements like the Hamburger Menu.
3. **Complex Flow:** Successfully automated the navigation flow where the browser goes back and forth.
4. **Error Handling:** Implemented robust locators to avoid `NoSuchElementException`.

## ⚙️ How to Run
1. Clone the repo: `git clone https://github.com/amrutadeshmukh2308/SauceDemo-Testing.git`
2. Open the project in **IntelliJ IDEA**.
3. Ensure Maven dependencies are downloaded.
4. Run the tests using the `testng.xml` file or directly from the `SauceDemoTest` class.

