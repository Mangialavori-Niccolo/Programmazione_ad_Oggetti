package org.Niccolo.oop.shape;


public abstract class AbstractShape implements Computable, Movable, Resizable{
    protected String id;
    protected String color;

    protected AbstractShape (String id, String color){
        this.id = id;
        setColor(color);
    }

    public String getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setColor(String color) {
        if (!color.matches("^#[0-9a-fA-F]{6}")){
            throw new IllegalArgumentException("Parameter color must be in the #RRGGBB form");
        }
        this.color = color;
    }


    //a color (String) for coloring the shape (RGB Web Standard #RRGGBB, see https://en.wikipedia.org/wiki/Web_colors)
}
