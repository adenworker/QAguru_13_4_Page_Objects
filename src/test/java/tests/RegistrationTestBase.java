package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import page_objects.RegistrationTestPO;

public class RegistrationTestBase {

    RegistrationTestPO registrationTestPO = new RegistrationTestPO();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }
}