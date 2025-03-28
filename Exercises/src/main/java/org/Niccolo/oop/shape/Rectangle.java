package org.Niccolo.oop.shape;

import lombok.Getter;

import java.awt.*;

@Getter
public class Rectangle extends AbstractShape{
    Point upperLeft, bottomRight;

    public Rectangle(String id, String color, Point upperLeft, Point bottomRight) {
        super(id, color);
        this.upperLeft = upperLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public double getArea() {
        return Math.abs(upperLeft.x - bottomRight.x) * Math.abs(upperLeft.y - bottomRight.y);
    }

    @Override
    public double getPerimeter() {
        return 2*(Math.abs(upperLeft.x - bottomRight.x) + Math.abs(upperLeft.y - bottomRight.y));
    }

    @Override
    public void move(Point movement) {
        upperLeft.translate(movement.x, movement.y);
        bottomRight.translate(movement.x, movement.y);
    }

    @Override
    public double resize(double scale) {
        return 0; //DA FINIREEEEEEEEEEE
    }
}
