package DataObject;

import com.github.javafaker.Faker;

public interface RegistrationData {
    Faker faker = new Faker();

    String
        firstName = faker.name().firstName(),
        lastName = "baratashvili",
        Email = faker.internet().emailAddress(),
        password = "Paroli123",
        confpassword = "Paroli123";

}
