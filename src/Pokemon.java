public abstract class Pokemon {

    // private variabelen

    private String name;
    private int level;
    private String food;



    // constructor
    public Pokemon(String name, int level, String food) {
        this.name = name;
        this.level = level;
        this.food = food;
    }

    // getters en setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }


    // 2 methoden die algemeen zijn voor alle pokemon
    public void eats() {
        System.out.println(getName() + " eats " + getFood());
    }

    public void speaks() {
        System.out.println();
    }

}