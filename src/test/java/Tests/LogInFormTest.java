package Tests;

import Pages.OKPersonalPage;
import Tests.Data.LogInData;
import Pages.OKLoginPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LogInFormTest
{
  @Test
  public void logInWithoutData()
  {
    Selenide.open(LogInData.LogInUrl);
    OKLoginPage logInPage = new OKLoginPage();
    logInPage.logIn("", "");

    logInPage.getLogInErrorMessage().shouldHave(Condition.text(LogInData.usernameRequestMessage));
  }

  @Test
  public void logInWithoutUsername()
  {
    Selenide.open(LogInData.LogInUrl);
    OKLoginPage logInPage = new OKLoginPage();
    logInPage.logIn("", LogInData.ValidPassword);

    logInPage.getLogInErrorMessage().shouldHave(Condition.text(LogInData.passwordRequestMessage));
  }

  @Test
  public void logInWithoutPassword()
  {
    Selenide.open(LogInData.LogInUrl);
    OKLoginPage logInPage = new OKLoginPage();
    logInPage.logIn(LogInData.ValidUsername, "");

    logInPage.getLogInErrorMessage().shouldHave(Condition.text(LogInData.passwordRequestMessage));
  }

  @Test
  public void logInWithInvalidData()
  {
    Selenide.open(LogInData.LogInUrl);
    OKLoginPage logInPage = new OKLoginPage();
    logInPage.logIn(LogInData.InvalidUsername, LogInData.InvalidPassword);

    logInPage.getLogInErrorMessage().shouldHave(Condition.text(LogInData.errorLogInMessage));
  }

  @Test
  public void logInWithCorrectData()
  {
    Selenide.open(LogInData.LogInUrl);
    new OKLoginPage().logIn(LogInData.ValidUsername, LogInData.ValidPassword);

    OKPersonalPage personalPage = new OKPersonalPage();
    Assertions.assertEquals(LogInData.LogInUrl, personalPage.getUrl());
    personalPage.getUserNickname().shouldHave(Condition.text(LogInData.FIO));

    personalPage.logOut();
  }
}
