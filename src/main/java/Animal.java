public abstract class Animal {

    protected int weight;

    protected boolean hungry;

    //default counstructor
    public Animal(){}

    //constructor 2
    public Animal(int weight, boolean hungry){
        this.hungry = hungry;
        this.weight = weight;
    }

    //constructor 3
    public Animal(int weight){
        this.weight = weight;
    }

    public abstract boolean eat(Object food);

}
