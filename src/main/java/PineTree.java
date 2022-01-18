import java.util.List;

public class PineTree {

    /*
    fields/attributes
    constructor
    instansmetoder
     */

    private int numOfCones;

    private List<Squirrel> squirrels;

    private Owl ulla;

    private int age;

    private int weight;

    //constructor 1
    public PineTree(int numOfCones, List<Squirrel> squirrels) {
        this.numOfCones = numOfCones;
        this.squirrels = squirrels;
    }

    //constructor 2
    public PineTree(int numOfCones, List<Squirrel> squirrels, Owl ulla) {
        this.numOfCones = numOfCones;
        this.squirrels = squirrels;
        this.ulla = ulla;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumOfCones() {
        return numOfCones;
    }

    public void setNumOfCones(int numOfCones) {
        this.numOfCones = numOfCones;
    }

    public List<Squirrel> getSquirrels() {
        return squirrels;
    }

    public int getNumOfSquirrelsInNest(){
        return squirrels.size();
    }

    public void setSquirrels(List<Squirrel> squirrels) {
        this.squirrels = squirrels;
    }

    public Owl getUlla() {
        return ulla;
    }

    public void setUlla(Owl ulla) {
        this.ulla = ulla;
    }

    public boolean fall(int age, int height, int windSpeed){
        return true;
    }
}
