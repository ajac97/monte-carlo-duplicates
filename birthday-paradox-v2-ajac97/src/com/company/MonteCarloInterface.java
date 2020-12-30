package com.company;

import java.util.List;

public interface MonteCarloInterface {
    /**
     * Number of duplicates in the list
     */
    int numberOfDuplicates(List<Integer> list);

    /**
     * the probability of at least 2 people sharing a birthday with the specified group size
     */
    double birthdayCollisionProbability(int groupSize);

    /**
     * Given a probablity for a collision, return the lower group size needed to attain the probability
     * e.g. birthdayCollisionProbability(1.0) will return 367
     */
    int minimumGroupSizeBirthdayCollision(double probability);

    /**
     * the most general version of this problem. e.g. Given 3 people what is the probability that at least 2 were born on the same day of the week
     * generalCollisionProbability(7, 3)
     */
    double generalCollisionProbability(int optionsSize, int groupSize);

}

