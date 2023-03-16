import java.util.List;

public interface PokemonGym {

    void enteredTheGym(PokemonTrainer pokemonTrainer);
    Pokemon selectPokemon(String pokemon, PokemonTrainer pokemonTrainer);
    void printPokemon(List<Pokemon> pokemons);
    void fightRound(PokemonTrainer trainer, PokemonGymOwner owner, Pokemon pokemon, Pokemon gymPokemon);
    Pokemon chooseGymPokemon(PokemonGymOwner gymOwner);
    Pokemon choosePokemon(PokemonTrainer trainer);
    int randomAttackByGymOwner();
    String chooseAttackPlayer(Pokemon p);


}
