package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;

public class TextBoxTests {

    @BeforeAll
    static void  setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x980";
        Configuration.holdBrowserOpen = true;
    }
    @Test
    void  fillFormTest (){
        String name = "Егор";
    open("/text-box");
    //("[id=userName]").setValue("Egor");
    $("#userName").setValue(name);
    $("#userEmail").setValue("Egor@egor.com");
    $("#currentAddress").setValue("Some adress 1");
    $("#permanentAddress").setValue("Another adress 1");
    $("#submit").click();

    $("#output #name").shouldHave(text(name));
    $("#output #email").shouldHave(text("Egor@egor.com"));
    $("#output #currentAddress").shouldHave(text("Some adress 1"));
    $("#output #permanentAddress").shouldHave(text("Another adress 1"));
    }
}
