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
    return $(byAttribute(OKPersonalPageData.attributeLoc, OKPersonalPageData.nicknameLoc));
  }

  public String getUrl()
  {
    return WebDriverRunner.getWebDriver().getCurrentUrl();
  }

  public void publishNote(String text)
  {
    $(byAttribute(OKPersonalPageData.classLoc, OKPersonalPageData.writeSmthBoxLoc)).click();
    $(byAttribute(OKPersonalPageData.classLoc, OKPersonalPageData.noteBoxLoc)).sendKeys(text);
    $(byAttribute(OKPersonalPageData.classLoc, OKPersonalPageData.shareButtonLoc)).click();
  }

  public SelenideElement getNote()
  {
    return $(byAttribute(OKPersonalPageData.classLoc, OKPersonalPageData.noteLoc));
  }

  public void logOut()
  {
    $(byAttribute(OKPersonalPageData.classLoc, OKPersonalPageData.actionButtonLoc)).click();
    $(byAttribute(OKPersonalPageData.attributeLoc, OKPersonalPageData.exitButtonLoc)).click();
    $(byName(OKPersonalPageData.exitButtonPopUpLoc)).click();
  }

}
