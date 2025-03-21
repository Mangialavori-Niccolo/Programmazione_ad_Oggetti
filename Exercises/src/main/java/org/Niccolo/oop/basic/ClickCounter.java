package org.Niccolo.oop.basic;

/*
basic.ClickCounter.java] Write a class named ClickCounter representing a simple device to keep track of how many
times a button (in this case a method) is clicked. Internally, the class represents the number of clicks with
an int value (starting from 0). The class provides the following methods:

- int value
+ public int getValue() returning the current number of clicks.
+ public void click() increasing the number of clicks of 1 unit.
+ public void undo() decreasing the number of clicks of 1 unit (but preventing negative click values).
+ public void reset() setting the number of clicks to 0.

Refer to the UML diagram, JavaDoc documentation, and unit tests for further inspiration.
 */
public class ClickCounter {
    private int value = 0;

    public int getValue() {
        return value;
    }

    public void click() {
        value++;
    }

    public void undo() {
        if (value > 0) value--;
    }

    public void reset() {
        value = 0;
    }


}
