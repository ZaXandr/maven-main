public class Parrot extends  Animal{

    private static final Habitat HABITAT = Habitat.Air;
    private static final Food FOOD = Food.Cheese;

    public Parrot(String name, int age) {
        super(name, age, FOOD, HABITAT);
    }

    @Override
    public String voice(){
    return "Arr!";
    }
}
