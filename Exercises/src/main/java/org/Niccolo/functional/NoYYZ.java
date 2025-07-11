package org.Niccolo.functional;

import java.util.List;
import java.util.stream.Collectors;

public class NoYYZ {
    public static List<String> noYYZ(List<String> strings) {
        return strings.stream().map(s -> s + "y")
                .filter(s -> !s.contains("yy"))
                .peek(s -> {
                    if (s.startsWith("z")) {
                        System.out.println(s);
                    }
                })
                .collect(Collectors.toList());
    }


    public static List<String> noYYZProf(List<String> strings) {
        return strings.stream()
                .map(s -> s + "y")
                .filter(s -> !s.contains("yy"))
                .peek(s -> {
                    if (s.startsWith("z")) {
                        System.out.println(s);
                    }
                })
                .collect(Collectors.toList());
    }
}