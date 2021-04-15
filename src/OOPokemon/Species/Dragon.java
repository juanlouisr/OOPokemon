package OOPokemon.Species;

import OOPokemon.Skill.Sunstrike;
import javafx.scene.image.Image;

import static OOPokemon.Element.ElementType.Fire;

public class Dragon extends Engimon {
    private void InitComp() {
        namaSpecies = "Dragon";
        monElements[0].setElementType(Fire);
        monSkills[0] = new Sunstrike();
        image = new Image("assets/dragon.png");

    }

    public Dragon() {
        super();
        InitComp();
    }

    public Dragon(String name) {
        super(name);
        InitComp();
    }
}