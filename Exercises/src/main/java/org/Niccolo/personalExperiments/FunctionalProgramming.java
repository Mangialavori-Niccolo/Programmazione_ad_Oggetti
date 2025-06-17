package org.Niccolo.personalExperiments;

import java.util.Arrays;
import java.util.function.Consumer;

public class FunctionalProgramming {
    public static void main(String[] args) {
        var persone = Arrays.asList("Pinco Pallo", "mario rossi", "Luca Miglio");

        Consumer<String> iniziali = (String s) -> {
            var nomeCognome = s.split(" ");
            System.out.println(String.valueOf(nomeCognome[0].toUpperCase().charAt(0)) + nomeCognome[1].toUpperCase().charAt(0));
        };

        persone.forEach(iniziali);
        persone.forEach(iniziali::accept);
        persone.forEach(persona -> iniziali.accept(persona));
    }
}
