import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Squirrel> squirrels = Arrays.asList(new Squirrel("Piff"), new Squirrel("Puff"));

        Owl ulla = new Owl(80, true, 10);

        PineTree pineTree = new PineTree(100, squirrels, ulla);

        boolean ullaHasEaten = ulla.eat(pineTree);

        System.out.println("Has Ulla eaten?: "+ ullaHasEaten);

    }

}
