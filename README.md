# OrangeHRMS Automation Project 🧪

This project automates key functionalities of the [OrangeHRM](https://opensource-demo.orangehrmlive.com/) web application using **Selenium WebDriver**, **Java**, and **TestNG**.

## 🔧 Tech Stack

- 🧠 **Programming Language**: Java
- 🤖 **Automation Tool**: Selenium WebDriver
- ✅ **Test Framework**: TestNG
- 🌐 **Browser**: Chrome, Edge, Firefox
- ⚙️ **Build Tool**: Maven (if used)
- 📋 **Test Data**: Hardcoded or from Excel/Propertie

## 📂 Folder Structure
OrangeHRMSProject/ │ ├── src/test/java/ │ ├── testcases/ │ │ ├── LoginTest.java │ │ ├── AddEmployeeTest.java │ │ └── LogoutTest.java │ │ │ ├── pages/ │ │ ├── LoginPage.java │ │ ├── DashboardPage.java │ │ └── EmployeePage.java │ │ │ ├── base/ │ │ └── BaseTest.java │ │ │ └── utilities/ │ ├── ConfigReader.java │ └── ExcelReader.java │ ├── testng.xml ├── pom.xml └── README.md

## ✅ Features Covered

- 🔐 Login with valid/invalid credentials
- 👨‍💼 Add New Employee functionality
- 🚪 Logout functionality
- 🧪 Assertion-based validations
- 🧹 Clean browser handling using `@BeforeMethod` and `@AfterMethod

