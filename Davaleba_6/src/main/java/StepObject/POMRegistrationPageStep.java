package StepObject;

import PageObject.POMRegistrationPage;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.sleep;

public class POMRegistrationPageStep extends POMRegistrationPage {


    public POMRegistrationPageStep clearcokiePOMRegistrationPage() {
        cookieBtn.click();
        return this;
    }

    public POMRegistrationPageStep enterPOMRegistrationPage() {
        enterBtn.click();
        return this;
    }

    public POMRegistrationPageStep clearPOMRegistrationPage() {
        clearBtn.click();
        return this;
    }

    public POMRegistrationPageStep createAccountPOMRegistrationPage() {
        createAccount.click();
        return this;
    }


    public POMRegistrationPageStep fillemail(String email) {
        emailInput.setValue(email);
        emailInput.shouldNotBe(Condition.empty);
        return this;
    }


    public POMRegistrationPageStep fillpassword(String password) {
        passwordInput.setValue(password);
        passwordInput.shouldNotBe(Condition.empty);
        return this;
    }

    public POMRegistrationPageStep fillconfirmPassword(String confirmPassword) {
        confirmPasswordInput.setValue(confirmPassword);
        confirmPasswordInput.shouldNotBe(Condition.empty);
        sleep(300);
        return this;
    }

    public POMRegistrationPageStep selectgender() {
        genderSelect.click();
        return this;
    }

    public POMRegistrationPageStep birtyearPOMRegistrationPage() {
        birtyear.click();
        sleep(400);
        return this;
    }

    public POMRegistrationPageStep fillbirtyear(String birthyear) {
        birtyearinput.setValue(birthyear);
        sleep(400);
        birtyearinput.shouldNotBe(Condition.empty);
        return this;

    }


    public POMRegistrationPageStep fillphoneNum(String phone) {
        phoneNum.setValue(phone);
        phoneNum.shouldNotBe(Condition.empty);
        return this;
    }

    public POMRegistrationPageStep fillPhoneCode(String PhoneCode) {
        phoneCodeInput.setValue(PhoneCode);
        phoneCodeInput.shouldNotBe(Condition.empty);
        return this;
    }

    public POMRegistrationPageStep fillagreem1() {
        agreem1.click();
        return this;
    }

    public POMRegistrationPageStep fillagreem2() {
        agrem2.click();
        return this;
    }

    public POMRegistrationPageStep clickonregBtn() {
        regBtn.click();
        return this;
    }

}
