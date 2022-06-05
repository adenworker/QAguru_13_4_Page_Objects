package page_objects.components;

import TestData.RegistrationTestUserData;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ResultsTableComponent {
    public void checkResult(RegistrationTestUserData user) {
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").$(byText("Student Name")).parent()
                .shouldHave(text(user.firstname + " " + user.lastname));
        $(".table-responsive").$(byText("Student Email")).parent().shouldHave(text(user.email));
        $(".table-responsive").$(byText("Gender")).parent().shouldHave(text(user.gender));
        $(".table-responsive").$(byText("Mobile")).parent().shouldHave(text(user.mobile));
        $(".table-responsive").$(byText("Date of Birth")).parent().shouldHave(text(user.birthDate));
        $(".table-responsive").$(byText("Subjects")).parent().shouldHave(text(user.subjects));
        $(".table-responsive").$(byText("Hobbies")).parent().shouldHave(text(user.hobbies));
        $(".table-responsive").$(byText("Picture")).parent().shouldHave(text(user.picture));
        $(".table-responsive").$(byText("Address")).parent().shouldHave(text(user.address));
        $(".table-responsive").$(byText("State and City"))
                .parent().shouldHave(text(user.state + " " + user.city));
    }
}