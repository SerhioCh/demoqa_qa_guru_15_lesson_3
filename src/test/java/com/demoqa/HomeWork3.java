package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;

public class HomeWork3 {

    @BeforeAll
    static void  setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = true;
    }
    @Test
    void  fillFormTest (){

    open("/text-box");
    //("[id=userName]").setValue("Egor");
    $("#userName").setValue("Serhio");
    $("#userEmail").setValue("Egor@egor.com");
    $("#currentAddress").setValue("Some adress 1");
    $("#permanentAddress").setValue("Another adress 1");
    $("#submit").click();

    $("#output #name").shouldHave(text("Serhio"));
    $("#output #email").shouldHave(text("Egor@egor.com"));
    $("#output #currentAddress").shouldHave(text("Some adress 1"));
    $("#output #permanentAddress").shouldHave(text("Another adress 1"));
    }
    @Test
    void checkRegistrationFormDemoqa () {
        open("/automation-practice-form");
        $("#firstName").setValue("Serhio");
        $("#lastName").setValue("Ramos");
        $("#userEmail").setValue("serhio@Ramos.com");
        $(byText("Male")).click();
        $("#userNumber").setValue("12345678910");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").click();
        $(byText("December")).click();
        $(byText("1997")).click();
        $(byText("17")).click();
        $("#subjectsInput").setValue("about");;
        $(byText("Sports")).click();
        $(byText("Select picture")).click();
        $("#uploadPicture").uploadFile(new File("src/test/data/img.png"));
        $("#currentAddress").setValue("My adress");
        $("#state").click();
        $("#stateCity-wrapper"). $(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper"). $(byText("Delhi")).click();
        $("#submit").click();


        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $$(".table-responsive").findBy(text("Student Name")).shouldHave(text("Serhio"+ " " +"Ramos"));
        $$(".table-responsive").findBy(text("Student Email")).shouldHave(text("serhio@Ramos.com"));
        $$(".table-responsive").findBy(text("Gender")).shouldHave(text("Male"));
        $$(".table-responsive").findBy(text("Mobile")).shouldHave(text("1234567891"));
        $$(".table-responsive").findBy(text("Date of Birth")).shouldHave(text("17"+" "+"December,1997"));
        $$(".table-responsive").findBy(text("Subjects")).shouldHave(text(" ")); //Здесь должено быть значение не валю тест специально
        $$(".table-responsive").findBy(text("Hobbies")).shouldHave(text("Sports"));
        $$(".table-responsive").findBy(text("Picture")).shouldHave(text("img.png"));
        $$(".table-responsive").findBy(text("Address")).shouldHave(text("My adress"));
        $$(".table-responsive").findBy(text("State and City")).shouldHave(text("NCR"+" "+"Delhi"));



    }
}
