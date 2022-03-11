package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        HashSet<City> city = new HashSet<>();
        city.add(new City(1,"Bishkek","Kyrgyzstan",265122));
        city.add(new City(2,"Rim","Italy",326515));
        city.add(new City(3,"Osh","Kyrgyzstan",9512));
        city.add(new City(4,"Tashkent","Uzbekistan",326562));
        city.add(new City(5,"Almaty","Kazakstan",74565));
        city.add(new City(6,"Califrnia","USA",656565));
        TreeSet<City> cities = new TreeSet<City>(city);
        for (City i : cities) {
            if(i.getCode()%2!=0){
                System.out.println(i);
            }


        }



    }
}
