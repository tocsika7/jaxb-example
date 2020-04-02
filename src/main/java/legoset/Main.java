package legoset;

import jaxb.JAXBHelper;

import java.io.FileOutputStream;
import java.time.Year;
import java.util.ArrayList;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {
        LegoSet legoSet = new LegoSet("75211");
        legoSet.setName("Imperial TIE Fighter");
        legoSet.setTheme("Star Wars");
        legoSet.setSubtheme("Solo");
        legoSet.setYear(Year.of(2018));

        legoSet.setTags(Set.of("Starfighter","Stormtrooper","Star Wars","Solo"));

        ArrayList<Minifig> minifigs = new ArrayList<>();
        minifigs.add(new Minifig(2,"Imperial Mudtrooper"));
        minifigs.add(new Minifig(1,"Imperial pilot"));
        minifigs.add(new Minifig(1,"Mimban Stormtrooper"));
        legoSet.setMinifigs(minifigs);

        legoSet.setWeight(new Weight("kg",0.89));

        legoSet.setUrl("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");
        legoSet.setPieces(519);

        JAXBHelper.toXML(legoSet, System.out);
        JAXBHelper.toXML(legoSet, new FileOutputStream("legoset.xml"));


    }
}
