public class GrassPokemon extends Pokemon {

    // private variabelen

    private int special;
    private int accuracy;


    // constructor
    public GrassPokemon(String name, int level, String food, int special, int accuracy){
        super(name, level, food);
        this.special = special;
        this.accuracy = accuracy;
    }

    // getters en setters
    public int getSpecial() {
        return special;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    // 2 methoden specifiek voor GrassPokemon
    public void leachSeed() {
        System.out.println(getName() + " used Leachseed!");
    }

    public void leaveBlade() {
        System.out.println(getName() + " used LeaveBlade!");
    }


    @Override
    public void speaks() {
        System.out.println("Hi, I'm " + getName() + " and my accuracy is " + getAccuracy() + "!");
    }


}