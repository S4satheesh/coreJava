package org.example;

import java.util.HashSet;
import java.util.Set;

public class HashSetStringExample {

    public static void main (String[] args)
    {
        Set<String> sampleSet = new HashSet<>();
        sampleSet.add("Pandu");
        sampleSet.add("Pandu");
        sampleSet.add("Veni");
        sampleSet.add("Tony");
        sampleSet.add("PK");
        sampleSet.add("Chiru");

        System.out.println(sampleSet);
        System.out.println("Size of the Set is.."+ sampleSet.size());
        boolean setContains = sampleSet.contains("Pandu");
        System.out.println("Testing Contains inBuild function.."+ setContains);
        boolean setEmpty = sampleSet.isEmpty();
        System.out.println("Testing isEmpty inBuild function.."+ setEmpty);
    }
}
