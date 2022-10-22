package Pages;

import Pages.Data.OKLogInPageData;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class OKLoginPage
{
  public void logIn(String username, String password)
  {
    $(byXpath(OKLogInPageData.usernameBoxLoc)).val(username);
    $(byXpath(OKLogInPageData.passwordBoxLoc)).val(password);
    $(byXpath(OKLogInPageData.signInButtonLoc)).click();
  }

  public SelenideElement getLogInErrorMessage()
  {
    return $(byXpath(OKLogInPageData.errorMessageLoc));
  }

  public SelenideElement getEnterButton()
  {
    return $(byXpath(OKLogInPageData.signInButtonLoc));
  }
}
