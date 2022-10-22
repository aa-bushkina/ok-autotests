package Pages;

import Pages.Data.OKLogInPageData;
import Pages.Data.OKPersonalPageData;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;


public class OKPersonalPage
{
  private final OKPersonalPageData data = new OKPersonalPageData();

  public SelenideElement getUserNickname()
  {
    return $(byXpath(data.nicknameLoc));
  }

  public String getUrl()
  {
    return WebDriverRunner.getWebDriver().getCurrentUrl();
  }

  public void publishNote(String text)
  {
    $(byXpath(data.writeNoteBoxLoc)).click();
    $(byXpath(data.noteBoxPopUpLoc)).sendKeys(text);
    $(byXpath(data.shareButtonLoc)).click();
  }

  public SelenideElement getNote()
  {
    return $(byXpath(data.noteLoc));
  }

  public void logOut()
  {
    $(byXpath(data.actionButtonLoc)).click();
    $(byXpath(data.exitButtonLoc)).click();
    $(byXpath(data.exitButtonPopUpLoc)).click();
  }

}
