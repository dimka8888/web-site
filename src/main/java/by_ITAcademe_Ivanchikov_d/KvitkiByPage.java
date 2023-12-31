package by_ITAcademe_Ivanchikov_d;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KvitkiByPage {
    private String buttonAcceptCookieLocator = "//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]";
    //кнопка Принять локатор файлов cookie
    private String linkEnterLocator = "/html/body/div[3]/div[2]/div/app-user-account-link/app-profile-link/svg-icon";
    //ссылка Введите локатор
    private String textEnterLoginFormLocator = "//*[@id=\"mat-tab-label-0-0\"]/span[2]/span[1]";
    //текст Введите форму входа в систему
    private String inputEmailLocator = "/html/body/div[8]/div[2]/div/mat-dialog-container/div/div/app-user-auth-form/div[2]/mat-tab-group/div/mat-tab-body[1]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[1]/app-email-input/div/input";
//введите адрес электронной почты

    private String inputPasswordLocator = "/html/body/div[8]/div[2]/div/mat-dialog-container/div/div/app-user-auth-form/div[2]/mat-tab-group/div/mat-tab-body[1]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[2]/app-password-input/div/input";
//Локатор входного пароля
    private String buttonEnterLoginFormLocator = "//*[@id=\"mat-tab-content-0-0\"]/div/app-user-login-form/app-collapsible/div/app-ui-button/button";
//кнопка Войти Локатор формы входа
    private String errorMessageEmailLocator = "/html/body/div[8]/div[2]/div/mat-dialog-container/div/div/app-user-auth-form/div[2]/mat-tab-group/div/mat-tab-body[1]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[1]/app-email-input/app-field-error/app-collapsible";
//Поиск сообщения об ошибке
    private String errorMessagePasswordLocator = "/html/body/div[8]/div[2]/div/mat-dialog-container/div/div/app-user-auth-form/div[2]/mat-tab-group/div/mat-tab-body[1]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[2]/app-password-input/app-field-error/app-collapsible";
//Локатор пароля сообщения об ошибке
    private String textEmailSuggestionLocator = "/html/body/div[8]/div[2]/div/mat-dialog-container/div/div/app-user-auth-form/div[2]/mat-tab-group/div/mat-tab-body[1]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[1]/app-email-input/app-collapsible";
//Поиск предложений по электронной почте
    private String textWrongCredentialsLocator = "/html/body/div[8]/div[4]/div/mat-dialog-container/div/div/app-info-dialog-content/div[3]";
    //текст Неверные учетные данные
    private WebDriver driver;

    public KvitkiByPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonAcceptCookie() {
        driver.findElement(By.xpath(buttonAcceptCookieLocator)).click();
    }

    public void clickLinkEnter() {
        driver.findElement(By.xpath(linkEnterLocator)).click();
    }

    public String getTextEnterLoginForm() {
        return driver.findElement(By.xpath(textEnterLoginFormLocator)).getText();
    }

    public void clickInputEmail() {
        driver.findElement(By.xpath(inputEmailLocator)).click();
    }

    public void sendKeysInputEmail(String newEmail) {
        driver.findElement(By.xpath(inputEmailLocator)).sendKeys(newEmail);
    }

    public void clickInputPassword() {
        driver.findElement(By.xpath(inputPasswordLocator)).click();
    }

    public void sendKeysInputPassword(String NewPassword){
        driver.findElement(By.xpath(inputPasswordLocator)).sendKeys(NewPassword);
    }

    public String getTextErrorMessageEmail() {
        return driver.findElement(By.xpath(errorMessageEmailLocator)).getText();
    }

    public String getTextErrorMessagePassword() {
        return driver.findElement(By.xpath(errorMessagePasswordLocator)).getText();
    }

    public String getTextEmailSuggestion() {
        return driver.findElement(By.xpath(textEmailSuggestionLocator)).getText();
    }

    public String getTextWrongCredentials(){
        return driver.findElement(By.xpath(textWrongCredentialsLocator)).getText();
    }

    public void clickButtonEnterLoginForm(){
        driver.findElement(By.xpath(buttonEnterLoginFormLocator)).click();
    }
}

