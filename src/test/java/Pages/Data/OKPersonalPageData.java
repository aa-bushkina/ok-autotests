package Pages.Data;

public record OKPersonalPageData()
{
  public static final String nicknameLoc = "//*[@class='tico ellip']";
  public static final String actionButtonLoc = "//*[@class='svg-ic svg-ico_down_12 svg-ic12']";
  public static final String exitButtonLoc = "//*[@class='lp']";
  public static final String exitButtonPopUpLoc = "//*[@id='hook_FormButton_logoff.confirm_not_decorate']";
  public static final String writeNoteBoxLoc = "//*[@class='pf-head_itx_a']";
  public static final String noteBoxPopUpLoc =
    "//*[@class='posting_itx emoji-tx h-mod js-ok-e js-posting-itx ok-posting-handler']";
  public static final String noteLoc = "//*[@class='media-text_cnt_tx emoji-tx textWrap']";
  public static final String shareButtonLoc = "//*[@class='posting_submit button-pro']";
}
