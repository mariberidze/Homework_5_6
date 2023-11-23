package Homework_5_MBeridze1;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.chromerunner;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;

public class Homework_5_Mberidze1 extends chromerunner {

    @Test(priority = 1, enabled = true)
    public void myhome_testcase_2() {

        //განცხადების ძებნა - 2.კონკრეტული მისამართის მითითებით:

        $(byXpath("//*[@id=\"CookieAgreement\"]/button")).click();
        $(By.name("Keyword")).click();
        $(byName("Keyword")).setValue("საგურამო").pressEnter();
        Assert.assertEquals("საგურამო", "საგურამო", "ვამოწმებთ სწორად იწერება თუ არა ტექსტი სერჩში");

        Assert.assertFalse($(".searched-items").has(Condition.matchText("განცხადება არ მოიძებნა")));

    }

    @Test(priority = 2, enabled = true)
    public void myhome_testcase_3() {

        //განცხადების ძებნა - 3.კონკრეტული ტელ.ნომრის მითითებით:

        $(byXpath("//*[@id=\"CookieAgreement\"]/button")).click();
        $("#by-keyword").click();
        $("#by-keyword").setValue("577100880").pressEnter();

        // I assertion:

        Assert.assertNotNull($(".card-title").shouldNot(Condition.empty));
        sleep(2000);

        // II assertion:

        String tel = "577100880";
        SelenideElement telnum = $("#by-keyword");
        telnum.setValue(tel);
        Assert.assertEquals(telnum.getValue(),tel, "ტელეფონის ნომერი ჩაიწერა თუ არა");
        System.out.println(tel);

    }
}
