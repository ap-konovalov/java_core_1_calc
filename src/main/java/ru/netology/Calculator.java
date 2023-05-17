package main.java.ru.netology;

import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    // Ошибка в примере кода BinaryOperator<Integer> devide = (x, y) -> x / y; возникала при попытке деления на 0.
    // На ноль нельзя делить. Для исправления была добавлен проверка.
    BinaryOperator<Integer> devide = (x, y) -> y == 0 ? 0 : x / y;
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
}
