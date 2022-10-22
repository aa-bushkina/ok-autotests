package Tests;

import Pages.OKPersonalPage;
import Tests.Data.TestsData;
import Pages.OKLoginPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LogInFormTest
{
  private final TestsData data = new TestsData();

  @Test
  public void logInWithoutData()
  {
    Selenide.open(data.LogInUrl);
    OKLoginPage logInPage = new OKLoginPage();
    logInPage.logIn("", "");

    logInPage.getLogInErrorMessage().shouldHave(Condition.text(data.usernameRequestMessage));
  }

  @Test
  public void logInWithoutUsername()
  {
    Selenide.open(data.LogInUrl);
    OKLoginPage logInPage = new OKLoginPage();
    logInPage.logIn("", data.ValidPassword);

    logInPage.getLogInErrorMessage().shouldHave(Condition.text(data.usernameRequestMessage));
  }

  @Test
  public void logInWithoutPassword()
  {
    Selenide.open(data.LogInUrl);
    OKLoginPage logInPage = new OKLoginPage();
    logInPage.logIn(data.ValidUsername, "");

    logInPage.getLogInErrorMessage().shouldHave(Condition.text(data.passwordRequestMessage));
  }

  @Test
  public void logInWithInvalidData()
  {
    Selenide.open(data.LogInUrl);
    OKLoginPage logInPage = new OKLoginPage();
    logInPage.logIn(data.InvalidUsername, data.InvalidPassword);

    logInPage.getLogInErrorMessage().shouldHave(Condition.text(data.errorLogInMessage));
  }

  @Test
  public void logInWithCorrectData()
  {
    Selenide.open(data.LogInUrl);
    new OKLoginPage().logIn(data.ValidUsername, data.ValidPassword);

    OKPersonalPage personalPage = new OKPersonalPage();
    Assertions.assertEquals(data.LogInUrl, personalPage.getUrl());
    personalPage.getUserNickname().shouldHave(Condition.text(data.FIO));

    personalPage.logOut();
  }
}
