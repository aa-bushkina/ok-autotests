package Pages;

import Pages.Data.OKLogInPageData;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class OKLoginPage
{
  public void logIn(String username, String password)
  {
    $(byName(OKLogInPageData.usernameBoxLoc)).val(username);
    $(byName(OKLogInPageData.passwordBoxLoc)).val(password);
    $(byAttribute(OKLogInPageData.attributeLoc, OKLogInPageData.signInButtonLoc)).click();
  }

  public SelenideElement getLogInErrorMessage()
  {
    return $(byAttribute(OKLogInPageData.classLoc, OKLogInPageData.errorMessageLoc));
  }

  public SelenideElement getEnterButton()
  {
    return $(byAttribute(OKLogInPageData.attributeLoc, OKLogInPageData.signInButtonLoc));
  }
}
