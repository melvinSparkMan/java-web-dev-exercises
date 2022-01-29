package exercises.interfacespolymorphism;

import org.launchcode.java.demos.lsn7interfaces.Ingredient;

import java.util.ArrayList;

public class Flavor extends Ingredient {


    public Flavor(String aName, double aCost, ArrayList<String> someAllergens){
        super (aName, aCost, someAllergens);
    }


}
