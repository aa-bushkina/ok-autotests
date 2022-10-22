package Pages;

import Pages.Data.OKLogInPageData;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class OKLoginPage
{
  private final OKLogInPageData data = new OKLogInPageData();

  public void logIn(String username, String password)
  {
    $(byXpath(data.usernameBoxLoc)).val(username);
    $(byXpath(data.passwordBoxLoc)).val(password);
    $(byXpath(data.signInButtonLoc)).click();
  }

  public SelenideElement getLogInErrorMessage()
  {
    return $(byXpath(data.errorMessageLoc));
  }

  public SelenideElement getEnterButton()
  {
    return $(byXpath(data.signInButtonLoc));
  }
}
