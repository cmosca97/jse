package com.example.jse.m06.s15.expoke;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
// Evolution names        
// Charmeleon - Charizard
// Zweilous - Hydreigon
// Kadabra - Alakazam
// Haunter - Gengar
// Pikachu - Raichu
// Milotic

        Pokemon[] myTeam = { new Pokemon("Charmander", 3), new Pokemon("Deino", 3), new Pokemon("Abra", 3),
                new Pokemon("Gastly", 3), new Pokemon("Pichu", 3), new Pokemon("Feebas", 2) };

        System.out.println(Arrays.toString(myTeam));
        
        myTeam[0].objectUse(10);
        System.out.println(myTeam[0].getExperience());
        myTeam[0].levelIncrease(myTeam[0].getExperience());
        System.out.println(myTeam[0].getLevel());
        for(int i = 0; i < myTeam.length; i++) {
            myTeam[i].fightResult(true);
            System.out.println(myTeam[i].getExperience());
        }
        myTeam[0].levelIncrease(myTeam[0].getExperience());
        System.out.println(myTeam[0].getLevel());
        myTeam[0].evolution(myTeam[0].getLevel());
        System.out.println(myTeam[0].getName());
    }

}
