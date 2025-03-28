package org.Niccolo.oop.shape;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Setter
@Getter
public class Circle extends AbstractShape{
    Point center;
    double radius;

    protected Circle(String id, String color, Point center, double radius) {
        super(id, color);
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void move(Point movement) {
        center.translate(movement.x, movement.y);
    }

    @Override
    public double resize(double scale) {
        radius *= 2;
        return radius;
    }

    @Override
    public String toString(){
        return "Circle{center=" + center + ", radius=" + radius + ", id='" + id + "', color=" + color + "}";
    }
}
