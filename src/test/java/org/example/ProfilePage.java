package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
    private WebDriver driver;
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */

    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    /**
     * определение локатора меню пользователя
     */
    @FindBy(xpath = "//*[contains(@class, 'user-account__name')]")
    private WebElement userMenu;
    /**
     * определение локатора кнопки перехода к окну входящих сообщений
     */
    @FindBy(xpath = "//*[contains(@class, 'menu__text')]")
    private WebElement mailBtn;
    /**
     * метод для нажатия кнопки меню пользователя
     */
    public void entryMenu() {
        userMenu.click();
    }
    /**
     * метод для нажатия кнопки перехода в меню входящих сообщений
     */
    public void goToIncomMsg() {
        mailBtn.click();
    }












}