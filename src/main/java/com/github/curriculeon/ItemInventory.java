package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by leon on 12/16/2019.
 */
public class ItemInventory implements InventoryInterface<Item> {

    GenericInventory<Item> inventoryList = new GenericInventory<>();

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
        System.out.println("removed item " + indexOfElement);
        return inventoryList.remove(indexOfElement);
    }

    @Override
    public Item[] toArray(Item[] array) {
        Item[] arrayToBePopulated = new Item[0];
        arrayToBePopulated =  inventoryList.toArray(arrayToBePopulated);
        return arrayToBePopulated;

    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Item> action) {

    }

    @Override
    public Spliterator<Item> spliterator() {
        return null;
    }
}
