package Tests;

import Pages.OKLoginPage;
import Pages.OKPersonalPage;
import Tests.Data.TestsData;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class MakeNoteTest
{
  private final TestsData data = new TestsData();

  @Test
  public void publishNote()
  {
    Selenide.open(data.LogInUrl);
    new OKLoginPage().logIn(data.ValidUsername, data.ValidPassword);
    OKPersonalPage personalPage = new OKPersonalPage();

    personalPage.publishNote(data.noteText);
    personalPage.getNote().shouldHave(Condition.text(data.noteText));

    personalPage.logOut();
  }
}
