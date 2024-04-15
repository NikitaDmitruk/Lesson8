package TaskOne;

public class Rabbit extends Animal {
    @Override
    public void eat(String food) {
        if (food.equals("Зелень") || food.equals("зелень")) {
            System.out.println("Кролик любит есть " + food);
        } else {
            System.out.println("Кролик не любит есть " + food);
            voice();
        }
        System.out.println("Кролик пищит!");
    }
}

