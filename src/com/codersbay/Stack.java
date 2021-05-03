package com.codersbay;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    private List<Integer> elements = new ArrayList<>();

    public void push(int newElement) {
        elements.add(newElement);
    }

    public int size() {
        return elements.size();
    }

    public int pop() {
        int popElements = elements.get(elements.size() - 1);
        elements.remove(elements.size() - 1);
        return popElements;
    }

    public int peek() {
        int peekElements = elements.get(elements.size() - 1);
        return peekElements;
    }

    public int[] pop2(int n) {

        int[] returnStack = new int[elements.size()];
        for (int i = 0; i < n ; i++) {
            returnStack[i] = pop();
        }
        return returnStack;

    }


}
