package Data.service;

import javax.xml.crypto.Data;

/**
 * Здесь реализовани принцип Single Responsibility Principle
 * Класс UserMethods отвечает только за действия между юзерами
 * так же здесь реализован принцип Interface Segregation Principle
 */
public class UserMethods implements MethodsService{
    @Override
    public String toSend(String text) {
        return text;
    }
}
