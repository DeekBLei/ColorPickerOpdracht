// Created by Deek
// Creation date 12/30/2021

package model;


import java.util.HashSet;
import java.util.Set;

public class Palette {

    private static Set<Color> colorMap = new HashSet<>();

    static {
        getColorsFromDataBase();
    }

    public static Color getColor(ColorName colorName) {
        //Todo return een kleur met de clone methode
        return null;
    }

    private static void getColorsFromDataBase() {
        /** This simulates a dataBase call*/
        colorMap.add(new Color(ColorName.PURPLE, "#FF00FF"));
        colorMap.add(new Color(ColorName.GREEN, "#00FF00"));
        colorMap.add(new Color(ColorName.ORANGE, "#FF8800"));
        colorMap.add(new Color(ColorName.RED, "#FF0000"));
        colorMap.add(new Color(ColorName.BLUE, "#0000FF"));
        colorMap.add(new Color(ColorName.YELLOW, "#FFFF00"));
    }
}