package org.Niccolo.oop.basic;

import java.awt.geom.Point2D;
import java.util.Arrays;

public class Polygon {
    final Point2D.Double[] vertices;

    public Polygon(Point2D.Double[] vertices) {
        if (vertices.length < 3) {
            throw new IllegalArgumentException("At least three vertices are required");
        }
        this.vertices = vertices;
    }

    int getVerticesCount(){
        return vertices.length;
    }

    double getPerimeter() {
        double perimeter = 0;
        for (int i = 0; i<vertices.length; i++){
            int next = (i+1) % vertices.length;
            perimeter += Math.hypot(vertices[i].x - vertices[next].x, vertices[i].y - vertices[next].y);
        }

        return perimeter;
    }

    double getArea(){
        double Area = 0;

        for (int i = 0; i < vertices.length; i++)
        {
            int next = (i + 1) % vertices.length;
            /*
                |x_0    x_1|
            A +=|          | ==> A += x_0 * y_1 - (y_0 * x_1)
                |y_0    y_1|
             */
            Area += (vertices[i].x * vertices[next].y) - (vertices[i].y * vertices[next].x);
        }

        return Math.abs(Area * 1/2);
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "vertices=" + Arrays.toString(vertices) +
                '}';
    }
}
