public class ElectricPokemon extends Pokemon {

    // private variabelen

    private String habitat;
    private String shape;


    // constructor
    public ElectricPokemon(String name, int level, String food, String habitat, String shape){
        super(name, level, food);
        this.habitat = habitat;
        this.shape = shape;
    }

    // getters en setters
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    // 2 methoden specifiek voor ElectricPokemon
    public void electroBall() {
        System.out.println(getName() + " used Electroball!");
    }

    public void voltTackle() {
        System.out.println(getName() + " used voltTackle");
    }

    // 1 override

    @Override
    public void speaks() {
        System.out.println("Hi, I'm " + getName() + " and I'm " + getShape() + " shaped!");
    }




}