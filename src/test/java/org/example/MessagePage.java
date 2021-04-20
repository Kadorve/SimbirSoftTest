package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MessagePage {
    private WebDriver driver;
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public MessagePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    /**
     * определение локатора "Написать сообщение"
     */
    @FindBy(xpath = "//*[contains(@class, 'mail-ComposeButton js-main-action-compose')]")
    private WebElement writeMsgBtn;
    /**
     * определение локатора поля "Кому"
     */
    @FindBy(xpath = "//*[contains(@class, 'composeYabbles')]")
    private WebElement forWhomField;
    /**
     * определение локатора темы сообщения
     */
    @FindBy(xpath = "//*[contains(@class, 'composeTextField ComposeSubject-TextField')]")
    private WebElement subjectBtn;
    /**
     * определение локатора тела письма
     */
    @FindBy(xpath = "//*[contains(@class, 'cke_contents_ltr')]")
    private WebElement textField;
    /**
     * определение локатора для отправки сообщения
     */
    @FindBy(xpath = "//*[contains(@class, 'ComposeSendButton')]")
    private WebElement sendMsgBtn;
    /**
     * метод для подсчёта входящих сообщений с темой "Simbirsoft Тестовое задание"
     */
    public int amountSameSubject() {
        List<WebElement> subjectCount = driver.findElements(By.xpath("//*[contains(@title, 'Simbirsoft Тестовое задание')]"));
        return subjectCount.size();
    }
    /**
     * метод для нажатия кнопки "Написать сообщение"
     */
    public void writeMsg() {
        writeMsgBtn.click();
    }
    /**
     * метод для нажатия кнопки "Написать сообщение"
     */
    public void toWhom() {
        forWhomField.click();
    }
    /**
     * метод для ввода адреса электронной почты получателя
     */
    public void inputEmail(String login) {
        forWhomField.sendKeys(login + "\n");
    }
    /**
     * метод для нажатия кнопки на поле "тема сообщения"
     */
    public void subjectField() {
        subjectBtn.click();
    }
    /**
     * метод для ввода содержимого в поле темы сообщения
     */
    public void inputSubject(String subject) {
        subjectBtn.sendKeys(subject);
    }
    /**
     * метод для нажатия кнопки на поле тела письма
     */
    public void textField() {
        textField.click();
    }
    /**
     * метод, вводящий в тело письма сообщение о количестве найденных писем
     */
    public void inputAmountSubject(String amount) {
        textField.sendKeys(amount + amountSameSubject());
    }
    /**
     * метод для отправки письма
     */
    public void sendMsg() {
        sendMsgBtn.click();
    }
}
