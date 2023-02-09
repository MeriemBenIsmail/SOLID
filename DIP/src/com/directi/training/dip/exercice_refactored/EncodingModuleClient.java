package com.directi.training.dip.exercice_refactored;
import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        EncodingInterface encodingMethod= new EncodingModule();
        encodingMethod.encodeWithFiles();
        encodingMethod.encodeBasedOnNetworkAndDatabase();
    }
}

