package equipment;

import java.util.HashMap;

import equipment.subcategories.armors.*;
import equipment.subcategories.artefacts.*;

public class EquipManager {
    private static final HashMap<String, Armor> armors = new HashMap<>();
    private static final HashMap<String, Artefact> artefacts = new HashMap<>();

    static {                                                    // Flyweight design pattern
        armors.put(Chainmail.getName(), new Chainmail());       // Every character has the same armor / artefact objects
        armors.put(Fleece.getName(), new Chainmail());
        armors.put(Regalia.getName(), new Chainmail());
        artefacts.put(Amulet.getName(), new Amulet()); 
        artefacts.put(Crystal.getName(), new Crystal());
        artefacts.put(Excalibur.getName(), new Excalibur());
    }
}
