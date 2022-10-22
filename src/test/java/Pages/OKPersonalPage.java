package Pages;

import Pages.Data.OKPersonalPageData;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;


public class OKPersonalPage
{
  public SelenideElement getUserNickname()
  {
    return $(byXpath(OKPersonalPageData.nicknameLoc));
  }

  public String getUrl()
  {
    return WebDriverRunner.getWebDriver().getCurrentUrl();
  }

  public void publishNote(String text)
  {
    $(byXpath(OKPersonalPageData.writeNoteBoxLoc)).click();
    $(byXpath(OKPersonalPageData.noteBoxPopUpLoc)).sendKeys(text);
    $(byXpath(OKPersonalPageData.shareButtonLoc)).click();
  }

  public SelenideElement getNote()
  {
    return $(byXpath(OKPersonalPageData.noteLoc));
  }

  public void logOut()
  {
    $(byXpath(OKPersonalPageData.actionButtonLoc)).click();
    $(byXpath(OKPersonalPageData.exitButtonLoc)).click();
    $(byXpath(OKPersonalPageData.exitButtonPopUpLoc)).click();
  }

}
