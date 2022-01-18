public class Squirrel {

    private int weight;

    private int numOfConesInNest;

    private int age;

    private boolean hasPartner;

    //constructor 1
    public Squirrel(int weight) {
        this.weight = weight;
    }

    //constructor 2
    public Squirrel(int weight, int numOfConesInNest, int age) {
        this.weight = weight;
        this.numOfConesInNest = numOfConesInNest;
        this.age = age;
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
