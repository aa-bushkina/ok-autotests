package Tests;

import Pages.OKLoginPage;
import Pages.OKPersonalPage;
import Tests.Data.LogInData;
import Tests.Data.MakeNoteData;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class MakeNoteTest
{
  @Test
  public void publishNote()
  {
    Selenide.open(LogInData.LogInUrl);
    new OKLoginPage().logIn(LogInData.ValidUsername, LogInData.ValidPassword);
    OKPersonalPage personalPage = new OKPersonalPage();

    personalPage.publishNote(MakeNoteData.noteText);
    personalPage.getNote().shouldHave(Condition.text(MakeNoteData.noteText));

    personalPage.logOut();
  }
}
