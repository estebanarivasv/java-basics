package com.erivas.OOP.Enumerations;

public class EnumImp {

    public static void main(String[] args) {
        Days today = Days.SATURDAY;

        System.out.println(today.name() + " " + today.getPosition() + " " + Days.getDayName(today.getPosition()));
    }
}
