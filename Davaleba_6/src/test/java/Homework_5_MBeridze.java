import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.chromerunner;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;


public class Homework_5_MBeridze extends chromerunner {

    @Test(priority = 0, enabled = true)
    public void myhome_testcase_1() {

        //განცხადების ძებნა - სხვადასხვა ოფშენების არჩევით:

        $(byXpath("//*[@id=\"CookieAgreement\"]/button")).click();
        $("#homeTypes").click();
        $(byLinkText("ქირავდება დღიურად")).click();
        $(byText("ბინები")).click();
        $(".next_input").click();
        $(byText("ბათუმი")).click();
        $(byText("აეროპორტის უბანი")).click();
        $(byText("ხიმშიაშვილის უბანი")).click();
        $(byText("ძებნა")).click();
        $(byText("სტატუსი")).click();
        $(byText("ახალი აშენებული")).click();
        $(byClassName("name")).click();
        $(byName("FPriceFrom")).setValue("100");
        $("#price-to").setValue("500").pressEnter();

        //assertions:

        $(byText("მესაკუთრე")).click();
        Assert.assertTrue($("#izzd36").is(Condition.selected));

        $("#MaklerTitle2").click();
        Assert.assertTrue($("#iddd").isSelected());

        $(".searched-items").shouldBe(Condition.visible);
        Assert.assertFalse($(".searched-items").has(Condition.matchText("განცხადება არ მოიძებნა")));
        Assert.assertFalse($(".searched-items").has(Condition.matchText("მოიძებნა 6000 განცხადება")));


    }
}
