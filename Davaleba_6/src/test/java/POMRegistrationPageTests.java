import StepObject.POMRegistrationPageStep;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.chromerunner;

import static DataObject.POMRegistrationPageData.*;
import static com.codeborne.selenide.Selenide.*;


public class POMRegistrationPageTests extends chromerunner {

    POMRegistrationPageStep pomregistrationpagestep = new POMRegistrationPageStep();

    @Test
    public void myhome_Registration_POM() {

        pomregistrationpagestep

                .clearcokiePOMRegistrationPage()
                .enterPOMRegistrationPage()
                .clearPOMRegistrationPage()
                .createAccountPOMRegistrationPage()
                .fillemail(email)
                .fillpassword(password)
                .fillconfirmPassword(confirmPassword)
                .selectgender()
                .birtyearPOMRegistrationPage()
                .fillbirtyear(birthyear)
                .fillphoneNum(phone)
                .fillPhoneCode(PhoneCode)
                .fillagreem1()
                .fillagreem2()
                .clickonregBtn();
        Assert.assertTrue(pomregistrationpagestep.regBtn.is(Condition.visible));


    }

}