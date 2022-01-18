import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class App {

    public static void main(String[] args) {

        List<Squirrel> squirrels = Arrays.asList(
                new Squirrel("Piff"),
                new Squirrel("Puff")
        );

        Owl ulla = new Owl(80, true, 10, 150);

        PineTree pineTree = new PineTree(100, squirrels, ulla);

        boolean ullaHasEaten = ulla.eat(pineTree);

        owlPrint(ullaHasEaten, pineTree);

        System.out.println(ulla);

        System.out.println(pineTree); //@FIXME: create a @Override toString for PineTree class

        boolean hasEaten = squirrels.get(0).eat(new PineTree.PineCone());

        System.out.println("Ekorren har ätit: " + hasEaten);
    }

    private static void owlPrint(boolean ullaHasEaten, PineTree pineTree ){
        if(ullaHasEaten){
            System.out.println("Owl says num num num");
        }
        else if (pineTree.getSquirrels().size() > 10){
            System.out.println("Owl is overrun by squirrels");
        }else{
            System.out.println("No food for owl today");
        }

        if(!ullaHasEaten){
            System.out.println("No food for Ulla today!");
        }
    }

}
