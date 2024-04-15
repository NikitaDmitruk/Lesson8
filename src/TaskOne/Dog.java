package TaskOne;

public class Dog extends Animal {
    @Override
    public void eat(String food) {
        if (food.equals("Мясо") || food.equals("мясо")) {
            System.out.println("Собака любит есть " + food);
        } else {
            System.out.println("Собака не любит есть " + food);
            voice();
        }
    }

    @Override
    public void voice() {
        System.out.println("Собака лает!");
    }
}

