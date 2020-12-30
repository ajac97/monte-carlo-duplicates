package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MonteCarlo myMonteCarlo = new MonteCarlo();
        System.out.println(myMonteCarlo.birthdayCollisionProbability(23));
        System.out.println(myMonteCarlo.minimumGroupSizeBirthdayCollision(.5));
        System.out.println(myMonteCarlo.generalCollisionProbability(7, 3));
        System.out.println(myMonteCarlo.numberOfDuplicates(Arrays.asList(4, 7, 5, 7, 7, 7)));

    }
}
