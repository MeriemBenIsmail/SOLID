package com.directi.training.ocp.exercise_refactored;

public class SpaceSlot extends Resource {

    @Override
    public int allocate() {
        return 0;
    }

    @Override
    public void free(int resourceId) {

    }

    @Override
    public void markResourceFree(int resourceId) {

    }

    @Override
    public int findFreeResource() {

        return 0;
    }

    @Override
    public void markResourceBusy(int resourceId) {

    }

}