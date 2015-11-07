package net.amykang.catfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by amy on 07/11/15.
 */
public class ColorWheel {

    public String[] mColors = {
            "#3079ab", "#e15258", "#838cc7", "#51b46d"
    };

    public int getColor() {

        String color = "";

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    };
}
