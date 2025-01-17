package com.github.curriculeon;

import java.util.Collection;
import java.util.List;

public interface InventoryInterface<SomeType> extends Iterable<SomeType> {
    void add(SomeType someObject);

    Boolean contains(SomeType someObject);

    SomeType get(int indexOfElement);

    SomeType remove(int indexOfElement);

    SomeType[] toArray(SomeType[] objectsToBeAdded);
}
