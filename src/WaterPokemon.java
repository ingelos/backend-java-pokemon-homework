public class WaterPokemon extends Pokemon {

    // private variabelen

    private int defence;
    private int attack;


    // constructor
    public WaterPokemon(String name, int level, String food, int defence, int attack){
        super(name, level, food);
        this.defence = defence;
        this.attack = attack;
    }

    // getters en setters
    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    // 2 methoden specifiek voor WaterPokemon
    public void surf() {
        System.out.println(getName() + " used Surf!");
    }

    public void hydroPump() {
        System.out.println(getName() + " used Hydropump!");
    }

    @Override
    public void speaks() {
        System.out.println("Hi, I'm " + getName() + " and my attack is " + getAttack() + "!");
    }



}