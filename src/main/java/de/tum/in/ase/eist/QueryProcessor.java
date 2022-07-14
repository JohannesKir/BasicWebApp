package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "EIST ist Spitze";
        } else if (query.contains("largest")) {
            String numbers = query.split(": ")[1];
            String[] eachNumber = numbers.split(", ");
            int[] zahlen = new int[eachNumber.length];
            int max = 0;
            for (int i = 0; i < zahlen.length; i++) {
                try {
                    if (Integer.parseInt(eachNumber[i]) > max) {
                        max = Integer.parseInt(eachNumber[i]);
                    }
                } catch(Exception ex){

                }
            }
            return "" + max;
//        } else if (query.contains("plus")) {
//            String aufgabe = query.split("what is ")[1];
//            String[] eachNumber = aufgabe.split(", ");
//            int[] zahlen = new int[eachNumber.length];
//            int max = 0;
//            for (int i = 0; i < zahlen.length; i++) {
//                try {
//                    if (Integer.parseInt(eachNumber[i]) > max) {
//                        max = Integer.parseInt(eachNumber[i]);
//                    }
//                } catch(Exception ex){
//
//                }
//            }
//            return "" + max;
        } else {
            return "";
        }
    }
}
