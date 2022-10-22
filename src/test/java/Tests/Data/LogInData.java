package Tests.Data;

public record LogInData()
{
  static final public String LogInUrl = "https://ok.ru/";
  static final public String InvalidUsername = "InvalidUsername";
  static final public String ValidUsername = "technoPol5";
  static final public String InvalidPassword = "InvalidPasssword";
  static final public String ValidPassword = "technoPolis2022";
  static final public String FIO = "technoPol5 technoPol5";
  static final public String usernameRequestMessage = "Введите логин";
  static final public String passwordRequestMessage = "Введите пароль";
  static final public String errorLogInMessage = "Неправильно указан логин и/или пароль";
  static final public String logInButtonText = "Войти в Одноклассники";
}
