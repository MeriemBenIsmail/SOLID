package com.directi.training.ocp.exercise_refactored;

public class ResourceAllocator {

    public int allocateResource(Resource resource) {
        int resourceId;

        resourceId = resource.findFreeResource();
        resource.markResourceBusy(resourceId);

        return resourceId;
    }

    public void freeResource(Resource resource, int resourceId) {
        resource.markResourceFree(resourceId);
    }
}
