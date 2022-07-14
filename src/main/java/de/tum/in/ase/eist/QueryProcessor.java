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
//            return "keine ahnung";
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
        } else if (query.contains("plus")) {
            String aufgabe = query.split("what is ")[1];
            String[] eachNumber = aufgabe.split(" plus ");
            int[] zahlen = new int[eachNumber.length];
            int max = 0;
            for (int i = 0; i < zahlen.length; i++) {
                try {
                    zahlen[i] = Integer.parseInt(eachNumber[i]);
                } catch(Exception ex){
                }
            }
            int number = zahlen[0] + zahlen[1];
            return "" + number;
        } else if (query.contains("square and a cube")) {
            String aufgabe = query.split(": ")[1];
            String[] eachNumber = aufgabe.split(", ");
            int[] zahlen = new int[eachNumber.length];
            int max = 0;
            for (int i = 0; i < zahlen.length; i++) {
                try {
                    int a = Integer.parseInt(eachNumber[i]);
                    if ( (int)Math.sqrt(a) * (int)Math.sqrt(a) == a && (int)Math.pow(a, 1.0/3) * (int)Math.pow(a, 1.0/3) * (int)Math.pow(a, 1.0/3) == a) {
                        return "";
                    }
                } catch(Exception ex){
                }
            }
            int number = zahlen[0] + zahlen[1];
            return "" + number;
        } else {
            return "";
        }
    }
}
