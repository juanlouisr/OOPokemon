package OOPokemon.Skill;

public class StaticStorm extends Skill {
    private String species;
    
    public StaticStorm() {
        super("Static Storm", "Electric", 14, 1);
        this.species = "Raichu";
    }
    public StaticStorm(String species, int masteryLevel) {
        super("Static Storm", "Electric", 14, masteryLevel);
        this.species = species;
    }
}