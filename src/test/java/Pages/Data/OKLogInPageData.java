package Pages.Data;

public record OKLogInPageData()
{
  public static final String usernameBoxLoc = "//*[@name='st.email']";
  public static final String passwordBoxLoc = "//*[@name='st.password']";
  public static final String signInButtonLoc = "//*[@class='button-pro __wide']";
  public static final String errorMessageLoc = "//*[@class='input-e login_error']";
}
