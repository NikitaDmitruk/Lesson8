package TaskOne;

public class Tiger extends Animal {
    @Override
    public void eat(String food) {
        if (food.equals("Мясо") || food.equals("мясо")) {
            System.out.println("Тигр любит есть " + food);
        } else {
            System.out.println("Тигр не любит есть " + food);
            voice();
        }
    }

    @Override
    public void voice() {
        System.out.println("Тигр рычит!");
    }
}
