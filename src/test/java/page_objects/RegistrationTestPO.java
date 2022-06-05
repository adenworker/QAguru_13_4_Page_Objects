package page_objects;

import TestData.RegistrationTestData;
import page_objects.components.CalendarComponent;
import page_objects.components.DropMenuComponent;
import page_objects.components.ResultsTableComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationTestPO {
    /* This class contains all page objects for Registration Form testing*/

    //SelenideElement firstNameInput = $("#firstName");
    //Doing this we create a special Selenide variable and can use it many times later.
    //We won't use it here because it's redundant, but it can be very handy later.

    public CalendarComponent calenderComponent = new CalendarComponent();
    public DropMenuComponent dropMenuComponent = new DropMenuComponent();
    public ResultsTableComponent resultsTableComponent = new ResultsTableComponent();

    public RegistrationTestPO openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        return this;
    }

    public RegistrationTestPO setFirstName() {
        $("#firstName").setValue(RegistrationTestData.user1.firstname);

        return this;
    }

    public RegistrationTestPO setLastName() {
        $("#lastName").setValue(RegistrationTestData.user1.lastname);

        return this;
    }


    public RegistrationTestPO setEmail() {
        $("#userEmail").setValue(RegistrationTestData.user1.email);

        return this;
    }

    public RegistrationTestPO setGender() {
        $("#genterWrapper").$(byText(RegistrationTestData.user1.gender)).click();

        return this;
    }

    public RegistrationTestPO setMobile() {
        $("#userNumber").setValue(RegistrationTestData.user1.mobile);

        return this;
    }

    public RegistrationTestPO setDateOfBirth() {
        $("#dateOfBirthInput").click();
        String dateSacrifice = RegistrationTestData.user1.birthDate;
        String[] dareParts = dateSacrifice.split( "[\\s,]+" );
        calenderComponent.setDate(dareParts[0], dareParts[1], dareParts[2]);

        return this;
    }

    public RegistrationTestPO setSubjects() {
        String subjectsSacrifice = RegistrationTestData.user1.subjects;
        String[] subjectsParts = subjectsSacrifice.split( "[\\s,]+" );
        for (String i: subjectsParts){
            $("#subjectsInput").sendKeys(i);
            $("#subjectsInput").pressEnter();
        }

        return this;
    }

    public RegistrationTestPO setHobbies() {
        String hobbiesSacrifice = RegistrationTestData.user1.hobbies;
        String[] hobbiesParts = hobbiesSacrifice.split( "[\\s,]+" );
        for (String i: hobbiesParts){
            $("#hobbiesWrapper").$(byText(i)).click();
        }

        return this;
    }

    public RegistrationTestPO setPicture() {
            $("#uploadPicture").uploadFromClasspath(RegistrationTestData.user1.picture);

        return this;
    }

    public RegistrationTestPO setAddress() {
        $("#currentAddress").setValue(RegistrationTestData.user1.address);

        return this;
    }

    public RegistrationTestPO setState() {
        dropMenuComponent.setDropMenu("state", RegistrationTestData.user1.state);

        return this;
    }

    public RegistrationTestPO setCity() {
        dropMenuComponent.setDropMenu("city", RegistrationTestData.user1.city);

        return this;
    }

    public RegistrationTestPO submit() {
        $("#submit").click();

        return this;
    }

    public void checkResult() {
        resultsTableComponent.checkResult(RegistrationTestData.user1);
    }
}
