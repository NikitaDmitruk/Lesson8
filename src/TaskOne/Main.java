package TaskOne;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите какое животное хотите покормить. Введите 1 - тигр, 2 - кролик, 3 - собака: ");
        switch (scanner.nextInt()) {
            case 1 -> {
                Tiger tiger = new Tiger();
                System.out.println("Чем Вы хотите покормить тигра? Варианты: мясо, зелень или другое. Введите:");
                tiger.eat(scanner.next());
            }
            case 2 -> {
                Rabbit rabbit = new Rabbit();
                System.out.println("Чем Вы хотите покормить кролика? Варианты: мясо, зелень или другое. Введите:");
                rabbit.eat(scanner.next());
            }
            case 3 -> {
                Dog dog = new Dog();
                System.out.println("Чем Вы хотите покормить собаку? Варианты: мясо, зелень или другое. Введите:");
                dog.eat(scanner.next());
            }
        }
    }
}