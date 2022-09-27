package com.demoqa;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;

public class CssXPathExamples {
    void cssXpatchExamples () {
        $("[data-testid=email]").setValue("a@a.com");
        $(by("data-testid","email")).setValue("a@a.com");
        $(byAttribute("data-testid","email")).setValue("a@a.com");


        $("[id=email]").setValue("a@a.com");
        $("#email").setValue("a@a.com");
        $(byId("email")).setValue("a@a.com");

        $x("//*[@id='email']").setValue("a@a.com");
        $(By.xpath("//*[@id='email']")).setValue("a@a.com");

        $("[name=email]").setValue("a@a.com");
        $(byName("email")).setValue("a@a.com");

        $("[class=login_form_input_box]").setValue("a@a.com");
        $(".login_form_input_box").setValue("a@a.com");
        $(".login_form_input_box.inputtext").setValue("a@a.com");


        $x("//input[@class='login_form_input_box']").setValue("a@a.com");
        $x("//input[@class='login_form_input_box'][@class='inputtext']").setValue("a@a.com");

        $(".login_form_input_box .inputtext").setValue("a@a.com"); // либо с пробелом
        $(".login_form_input_box").$("inputtext").setValue("a@a.com"); // либо через ещё один селектор, так ищем вложенные файлы


        $x("//div[text()='Hello qa.guru']");
        $x("//div[contains(text()='ello qa.gur']");
        $x("//div[text()[contains(., 'ello qa.gur']");

    $(byText("Hello qa.guru"));
    $(withText("lli qa.gur"));

    }

}
