package net.amykang.catfacts;

import java.util.Random;

/**
 * Created by amy on 07/11/15.
 */
public class FactBook {
    // Member variable (properties about the object)
    public String[] mFacts = {
            "There are cats who have survived falls from over 32 stories (320 meters) onto concrete.",
            "Cats have over 20 muscles that control their ears.",
            "Cats can't taste sweetness.",
            "Cats and humans have nearly identical sections of the brain that control emotion."
    };

    // Method (abilities: things the object can do)
    public String getFact() {

        String fact = " ";
        // Randomly select a fact
        Random randomGenerator = new Random(); // Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        // Convert the randomNumber to a text fact
        fact = mFacts[randomNumber];
        return fact;
    }
}
