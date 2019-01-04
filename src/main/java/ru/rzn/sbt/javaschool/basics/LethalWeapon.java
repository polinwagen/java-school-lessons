package ru.rzn.sbt.javaschool.basics;

import ru.rzn.sbt.javaschool.basics.utils.Logger;
import ru.rzn.sbt.javaschool.basics.utils.StringSupplier;


public class LethalWeapon {

    public String color;
    private  int roundsLeft;
    private Double power;
    private static long nextSerial=0;
    private  final long serial=0;

    public void reload (int spell){ this.roundsLeft=+spell; }
    public void pewPew (){
        this.roundsLeft-=2;
    }


    public LethalWeapon(){ };


    public LethalWeapon(String color, Double power, int roundsLeft){
       this.color = color;
       this.power = power;
       this.roundsLeft = roundsLeft;
    }




}
