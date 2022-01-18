public class Squirrel {

    private int weight;

    private int numOfConesInNest;

    private String name;

    private boolean hasPartner;

    //constructor 1
    public Squirrel(int weight) {
        this.weight = weight;
    }

    //constructor 2
    public Squirrel(int weight, int numOfConesInNest, String name) {
        this.weight = weight;
        this.numOfConesInNest = numOfConesInNest;
        this.name = name;
    }

    public Squirrel(String name){
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumOfConesInNest() {
        return numOfConesInNest;
    }

    public void setNumOfConesInNest(int numOfConesInNest) {
        this.numOfConesInNest = numOfConesInNest;
    }

    public boolean eat(PineTree pineTree){
        return pineTree.getNumOfCones() > 0;
    }
}
