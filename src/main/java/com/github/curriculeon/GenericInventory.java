package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 12/16/2019.
 */
public class GenericInventory<SomeType> implements InventoryInterface<SomeType> {
    ArrayList<SomeType> genericInventory = new ArrayList<SomeType>();

    public GenericInventory() {
    }

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
        System.out.println("removing item "+indexOfElement);
        System.out.println(genericInventory.remove(indexOfElement));
        System.out.println("actual length = "+genericInventory.size());
        return genericInventory.get(0);
    }

    @Override
    public SomeType[] toArray(SomeType[] objectsToBeAdded) {
        return genericInventory.toArray(objectsToBeAdded);
    }


}
