package utils;

import com.github.javafaker.Faker;

public class RandomUtils {

    Faker faker = new Faker();

    public String getRandomFirstName() {
        return faker.name().firstName();
    }

    public String getRandomFullName() {
        return faker.name().fullName();
    }

    public String getRandomLastName() {
        return faker.name().lastName();
    }

    public String getRandomStreetAddress() {
        return faker.address().streetAddress();
    }

    public String getRandomCurrentAddress() {
        return faker.address().fullAddress();
    }

    public String getRandomPermanentAddress() {
        return faker.address().fullAddress();
    }

    public String getRandomEmailAddress() {
        return faker.internet().emailAddress();
    }

    public String getRandomPhoneNumber() {
        return faker.phoneNumber().subscriberNumber(10);
    }

    public String getRandomGender() {
        return faker.options().option("Male", "Female", "Other");
    }

    public String getRandomHobby() {
        return faker.options().option("Sports", "Reading", "Music");
    }

    public String getRandomSubject() {
        return faker.options().option("English", "Chemistry", "Computer Science", "Commerce", "Economics", "Social Studies");
    }

    public String getRandomPicture() {
        return faker.options().option("test.jpg");
    }

    public String getRandomState() {
        return faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
    }

    public String getRandomCity(String stateValue) {
        switch (stateValue) {
            case "NCR":
                return faker.options().option("Delhi", "Gurgaon", "Noida");
            case "Uttar Pradesh":
                return faker.options().option("Agra", "Lucknow", "Merrut");
            case "Haryana":
                return faker.options().option("Karnal", "Panipat");
            default:
                return faker.options().option("Jaipur", "Jaiselmer");
        }
    }

    public String getRandomDay() {
        int day = faker.number().numberBetween(1, 30);
        if (day < 10) {
            return "0" + day;
        } else {
            return Integer.toString(day);
        }
    }

    public String getRandomMonth() {
        return faker.options().option("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
    }

    public String getRandomYear() {
        int year = faker.number().numberBetween(1930, 2020);
        return Integer.toString(year);
    }
}