package com.directi.training.isp.exercice_refactored;

import java.util.Random;

public class Sensor
{
    public void register(Proximity prox)
    {
        while (true) {
            if (isPersonClose()) {
                prox.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}
