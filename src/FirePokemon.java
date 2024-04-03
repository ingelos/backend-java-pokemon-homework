public class FirePokemon extends Pokemon {

    // private variabelen

    private double height;
    private double weight;


    // constructor

    public FirePokemon(String name, int level, String food, double height, double weight){
        super(name, level, food);
        this.height = height;
        this.weight = weight;
    }

    // getters en setters

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    // 2 methoden specifiek voor FirePokemon

    public void inferno() {
        System.out.println(getName() + " used Inferno!");
    }

    public void fireLash() {
        System.out.println(getName() + " used Firelash!");
    }


    // override

    @Override
    public void speaks() {
        System.out.println("Hi, I'm " + getName() + " and I weigh " + getWeight() + "kg!");
    }


}