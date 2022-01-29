package exercises.interfacespolymorphism;

import org.launchcode.java.demos.lsn7interfaces.Ingredient;

import java.util.ArrayList;

public class Cone extends Ingredient {

    public Cone(String aName, double aCost, ArrayList<String> someAllergens){
        super (aName, aCost, someAllergens);
    }


}
