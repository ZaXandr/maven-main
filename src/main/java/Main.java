import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> zoo = new ArrayList<Animal>();
        zoo.add(new Dog("Charlie",2));
        zoo.add(new Cat("Myrchik", 4));
        zoo.add(new Parrot("Kesha", 1));

        zoo.stream().forEach(x-> System.out.println(x.getClass()+x.toString()));
    }
}
