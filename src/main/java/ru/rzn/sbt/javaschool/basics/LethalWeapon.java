package ru.rzn.sbt.javaschool.basics;

import ru.rzn.sbt.javaschool.basics.utils.Logger;
import ru.rzn.sbt.javaschool.basics.utils.StringSupplier;


public class LethalWeapon {

    public String color;
    private  int roundsLeft;
    private Double power;
    private static long nextSerial=0;
    private  final long serial=nextSerial++;

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
    public long getSerial() {
        return serial;
    }


    public boolean equals(Object other) {
        if (other == this)
            return true;
        if (other == null)
            return false;
        if (getClass() != other.getClass()) return false;

        /*if (!(other instanceof LethalWeapon)) {
        return false;
    }  */
        LethalWeapon obj = (LethalWeapon) other; //преобразование к родительскому классу

        return (obj.color.equals(this.color) && obj.power.equals(this.power) && obj.roundsLeft == this.roundsLeft);

    }
    @Override
    public int hashCode(){
        int result;
        return result = color.hashCode() * power.hashCode() * roundsLeft ;
    }



}
