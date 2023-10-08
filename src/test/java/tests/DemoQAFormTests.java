package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static io.qameta.allure.Allure.step;

public class DemoQAFormTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    TestData testData = new TestData();

    @Test
    void fillFormTest() {

        step("Open registrations form", () -> {
            registrationPage.openPage();
        });

        step("Fill form", () -> {
            registrationPage.setFirstName(testData.userFirstName)
                    .setLastName(testData.userLastName)
                    .setUserEmail(testData.userEmailAddress)
                    .setGender(testData.userGender)
                    .setUserNumber(testData.userPhoneNumber)
                    .setBirthDate(testData.userBirthdayYear, testData.userBirthdayMonth, testData.userBirthdayDay)
                    .setSubject(testData.userSubject)
                    .setHobby(testData.userHobby)
                    .setPicture(testData.userPicture)
                    .setUserAddress(testData.userStreetAddress)
                    .setState(testData.userState)
                    .setCity(testData.userCity);
        });

        step("Submit form", () -> {
            registrationPage.submitForm();
        });

        step("Check form results", () -> {
            registrationPage.checkTableTitle("Thanks for submitting the form")
                    .checkResult(testData.userFirstName + " " + testData.userLastName)
                    .checkResult(testData.userEmailAddress)
                    .checkResult(testData.userGender)
                    .checkResult(testData.userPhoneNumber)
                    .checkResult(testData.userBirthdayDay + " " + testData.userBirthdayMonth + "," + testData.userBirthdayYear)
                    .checkResult(testData.userSubject)
                    .checkResult(testData.userHobby)
                    .checkResult(testData.userPicture)
                    .checkResult(testData.userStreetAddress)
                    .checkResult(testData.userState + " " + testData.userCity);
        });
    }
}