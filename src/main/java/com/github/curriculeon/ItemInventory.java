package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 12/16/2019.
 */
public class ItemInventory implements InventoryInterface<Item> {

    ArrayList<Item> inventoryList = new ArrayList<Item>();

    @Override
    public void add(Item someObject) {
        inventoryList.add(someObject);
    }

    @Override
    public Boolean contains(Item someObject) {
        return inventoryList.contains(someObject);
    }

    @Override
    public Item get(int indexOfElement) {
        return inventoryList.get(indexOfElement);
    }

    @Override
    public Item remove(int indexOfElement) {
        return inventoryList.remove(indexOfElement);
    }

    @Override
    public Item[] toArray(Item[] array) {
        Item[] arrayToBePopulated = new Item[0];
        arrayToBePopulated =  inventoryList.toArray(arrayToBePopulated);
        return arrayToBePopulated;

    }
}
