package org.Niccolo.oop.basic;

import java.awt.geom.Point2D;

public class Main {
    public static void main(String[] args) {
        Point2D.Double[] vett = {
                new Point2D.Double(1, 2),
                new Point2D.Double(15, 4),
                new Point2D.Double(2, 6),
                new Point2D.Double(0, 0)
        };

        Polygon p = new Polygon(vett);

        System.out.printf(p.toString());
    }
}
