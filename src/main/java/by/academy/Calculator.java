package by.academy;

//1) создаем 3 класса-теста, каждый из которых будет тестировать одну функцию калькулятора
//2) протестировать методы 3 наборами данных (используем Parametrize)
//3) написать 2 класса, в которых вы напишите тесты на Math библиотеку( любую функцию), объеденить их в Test Suite.
//4) добавить CalculatorTestListener, переопределить, метод который вызывается на успешное завершение теста
// и выводит на экран название нашего метода.

public class Calculator {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int substract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

//    public static int divide(int a, int b) {
//        return a / b;
//    }
}

