package Data.service;

/**
 * Здесь реализован принцип Interface Segregation Principle
 * В интерфейсе не описаны методы, которые не используются в UserMethods
 */
public interface MethodsService {
    String toSend(String text);
}
