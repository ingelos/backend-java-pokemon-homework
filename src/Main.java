public class Main {

    public static void main(String[] args) {

    FirePokemon charmander = new FirePokemon("Charmander", 4, "grass",  0.6, 8.5);
    WaterPokemon squirtle = new WaterPokemon("Squirtle", 7, "water",  65, 48);
    GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", 1, "grass",  65, 65);
    ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 25, "lightning", "clouds", "round");
    
    charmander.inferno();
    charmander.eats();
    charmander.speaks();

    squirtle.hydroPump();
    squirtle.eats();
    squirtle.speaks();

    bulbasaur.leachSeed();
    bulbasaur.eats();
    bulbasaur.speaks();

    pikachu.electroBall();
    pikachu.eats();
    pikachu.speaks();

    }
}