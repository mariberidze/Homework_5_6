import org.testng.annotations.Test;
import utils.chromerunner;
import com.codeborne.selenide.Condition;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;


public class RegistrationPagetests extends chromerunner {
    @Test
    public void myhome_Registration() {

        $(byXpath("//*[@id=\"CookieAgreement\"]/button")).click();       // ქუქიების გათიშვა
        $(byText("შესვლა")).click();
        $(byXpath("//*[@id=\"Modal1\"]/div/div/div/div[3]/button")).click();     //გასაგებია ღილაკი
        $(byText("შექმენი")).click();
        $("#registrationBtn").scrollIntoView(true); //სქროლები ჩავთიშე პომ-ში , რადგან ეს ურევდა მთლიან ტესტს
        $("#Email").scrollIntoView(true); //სქროლები ჩავთიშე პომ-ში , რადგან ეს ურევდა მთლიან ტესტს
        $("#Email").click();
        $("#Email").setValue("mari@gmail.com");
        Assert.assertEquals("mari@gmail.com", "mari@gmail.com", "ვამოწმებთ სწორად იწერება თუ არა ელ.ფოსტა");
        $(byName("Password")).click();
        $(byName("Password")).setValue("Aa@34567890");
        $(byName("PasswordRetype")).click();
        $(byName("PasswordRetype")).setValue("Aa@34567890");
        $(byText("მდედრობითი")).click();
        $(".select2-selection").click();         //დაბადების წელი
        sleep(300);
        $(byAttribute("aria-label", "Search")).setValue("2000").pressEnter();  //დაბადების წელის ჩაწერა
        $(byName("Phone")).setValue("577889900");
        Assert.assertEquals("577889900", "577889900", "ვამოწმებთ სწორად იწერება თუ არა tel.");
        $("#PhoneCode").setValue("0000");
        $(".checkmark", 0).click();           // თანხმობა 1
        $(".checkmark", 1).click();              // თანხმობა 2
        $("#registrationBtn").click();
        sleep(3000);
        Assert.assertFalse($(".error wrong").has(Condition.matchText("მოითხოვეთ ახალი კოდი")));


    }

}
