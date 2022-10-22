package Tests;

import Pages.OKLoginPage;
import Pages.OKPersonalPage;
import Tests.Data.LogInData;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class LogOutTest
{
  @Test
  public void logOut()
  {
    Selenide.open(LogInData.LogInUrl);
    new OKLoginPage().logIn(LogInData.ValidUsername, LogInData.ValidPassword);
    OKPersonalPage personalPage = new OKPersonalPage();
    personalPage.logOut();

    OKLoginPage loginPage = new OKLoginPage();
    loginPage.getEnterButton().shouldHave(Condition.value(LogInData.logInButtonText));
  }
}
