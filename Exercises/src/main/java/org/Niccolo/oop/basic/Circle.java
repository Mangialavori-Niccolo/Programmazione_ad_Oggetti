package org.Niccolo.oop.basic;

import java.awt.*;

/*
Write a class named Circle representing a Circle on a 2D plane.
Internally, the class uses a Point object and an int value for representing the center and the radius of the Circle,
respectively.
The class provides the following methods:

+public Circle(Point center, int radius) creating the circle.
+getters and setters.
+public double getPerimeter() returning the perimeter of the circle.
+public double getArea() returning the area of the circle.
+public boolean contains(Point point) returning true if point is contained within the circle.
+public void translate(int dx, int dy) moving the circle on the 2D plane. dx and dy are the x and y
    components of the translation vector.
+public String toString().
 */
public class Circle {
    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public boolean contains (Point point){
        return center.distance(point) < radius;
    }

    public void translate (int dx, int dy){
        //center.move(center.x + dx, center.y + dy);
        center.x += dx;
        center.y += dy;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}