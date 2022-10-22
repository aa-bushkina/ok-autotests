package Tests;

import Pages.OKLoginPage;
import Pages.OKPersonalPage;
import Tests.Data.TestsData;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class LogOutTest
{
  private final TestsData data = new TestsData();
  @Test
  public void logOut()
  {
    Selenide.open(data.LogInUrl);
    new OKLoginPage().logIn(data.ValidUsername, data.ValidPassword);
    OKPersonalPage personalPage = new OKPersonalPage();
    personalPage.logOut();

    OKLoginPage loginPage = new OKLoginPage();
    loginPage.getEnterButton().shouldHave(Condition.value(data.logInButtonText));
  }
}
