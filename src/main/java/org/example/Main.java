package org.example;
import org.example.TimeUtils;
public class Main {
    public static void main(String[] args) {
        int aika = 3665;
        String tulos = TimeUtils.secToTime(aika);
        System.out.println("Aika: " + tulos);
    }
}