public class Owl {

    private int wingSpan;

    private boolean hungry;

    private int age;

    private int weight;

    public Owl(int wingSpan, boolean hungry, int age) {
        this.wingSpan = wingSpan;
        this.hungry = hungry;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public boolean eat(PineTree pineTree) {
        int numOfSquirrels = pineTree.getNumOfSquirrelsInNest();
        if (isHungry()) {
            return numOfSquirrels < 10;
        }
        return false;
    }

    @Override
    public String toString(){
        return "Wingspan: "+ wingSpan + ", hungry: " + hungry + ", age: " + age;
    }

}
