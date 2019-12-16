package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 12/16/2019.
 */
public class GenericInventory<SomeType> implements InventoryInterface<SomeType> {
    ArrayList<SomeType> genericInventory = new ArrayList<SomeType>();

    @Override
    public void add(SomeType someObject) {
        genericInventory.add(someObject);
    }

    @Override
    public Boolean contains(SomeType someObject) {

        return genericInventory.contains(someObject);
    }

    @Override
    public SomeType get(int indexOfElement) {

        return genericInventory.get(indexOfElement);
    }

    @Override
    public SomeType remove(int indexOfElement) {
        return genericInventory.remove(indexOfElement);
    }

    @Override
    public SomeType[] toArray(SomeType[] objectsToBeAdded) {
        return null;
    }


}
