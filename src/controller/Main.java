package controller;

import model.Color;
import model.ColorName;
import model.Palette;

public class Main {

    public static void main(String[] args) {
        //ToDo Maak eigen palette aan kleuren (min 2)
        // en zorg dat de main methode runt

        Color myBlue =null;
        myBlue.setHexValue("#0806DD");

        Color myBluish = null;
        myBluish.setHexValue("#4b6a94");


        printKleuren(myBlue,myBluish);
    }

    private static void printKleuren(Color myBlue, Color myBluish){
        System.out.println("presetBLue"+ Palette.getColor(ColorName.BLUE) + " myBlue: "+ myBlue );
        System.out.println("presetBLue"+ Palette.getColor(ColorName.BLUE) + " myBluish: "+ myBluish );
    }


}
