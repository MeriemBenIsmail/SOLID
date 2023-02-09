package com.directi.training.ocp.exercise_refactored;

public abstract class Resource {

    public abstract int allocate();

    public abstract void free(int resourceId);

    public abstract void markResourceFree(int resourceId);

    public abstract int findFreeResource();

    public abstract void markResourceBusy(int resourceId);

}
