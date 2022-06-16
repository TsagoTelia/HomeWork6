package StepObj;

import PageObj.RegistrationPage;

public class RegistraionSteps extends RegistrationPage {
    public RegistraionSteps GotoRegPage(){
        RegistrationBtn.click();
        return this;
    }

    public RegistraionSteps UsarName(String username){
        UserNameInput.setValue(username);
        return this;
    }
    public RegistraionSteps LastName(String lastname){
        LastNameInput.setValue(lastname);
        return this;
    }
    public RegistraionSteps Mobile(String mobile){
        MobileInput.setValue(mobile);
        return this;
    }

    public RegistraionSteps Email(String email){
        EmailInput.setValue(email);
        return this;
    }
    public RegistraionSteps TermsCheckbox(){
       TermsCheckbox.click();
        return this;
    }

}
