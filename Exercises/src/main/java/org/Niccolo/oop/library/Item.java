package org.Niccolo.oop.library;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public abstract class Item {
    protected String title;
    protected int year;
}
