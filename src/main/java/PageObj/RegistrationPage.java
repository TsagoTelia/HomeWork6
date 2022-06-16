package PageObj;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    public SelenideElement
            RegistrationBtn = $(byText("რეგისტრაცია")),
            UserNameInput = $("#userName"),
            LastNameInput = $("#lastName"),
            MobileInput = $("#mobileNumber"),
            EmailInput = $("#email"),
            TermsCheckbox = $("#terms"),
            SubmintBtn = $("#user-registration-button");
}
