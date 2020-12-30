package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class MonteCarlo implements MonteCarloInterface {

    @Override
    public int numberOfDuplicates(List<Integer> list) {
        return list.size() - new HashSet<>(list).size();
    }

    @Override
    public double birthdayCollisionProbability(int groupSize) {
        return generalCollisionProbability(366, groupSize);
    }

    @Override
    public int minimumGroupSizeBirthdayCollision(double probability) {
        int people = 0;
        double duplicates = generalCollisionProbability(366, people);
        while (duplicates < probability) {
            people++;
            duplicates = generalCollisionProbability(366, people);
        }
        return people;
    }

    @Override
    public double generalCollisionProbability(int optionsSize, int groupSize) {
        double duplicates = 0;
        Random rand = new Random();
        for (int i = 0; i < 10000; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < groupSize; j++) {
                int item = 1 + rand.nextInt(optionsSize);
                list.add(item);
            }

            if (numberOfDuplicates(list) > 0) {
                duplicates++;
            }
        }
        return duplicates / 10000;
    }
}