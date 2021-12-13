

public class Cat extends Animal{
    private static final Habitat HABITAT = Habitat.Earth;
    private static final Food FOOD = Food.Meat;

    public Cat(String name, int age) {
        super(name, age, FOOD, HABITAT);
    }

    @Override
    public String voice() {
        return "Meav";
    }
}
