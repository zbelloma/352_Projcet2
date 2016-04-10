package com.company;

/**
 * Created by Zakk on 4/10/2016.
 */
public class Dfrm {

    public int numResourceTypes;
    private int[] numInstances;

    public int Dfrm(int numResourceTypes, int[] numInstances) {
        if(numResourceTypes > 20){//resource types cannot be greater than 20
            return -1;
        }

        this.numResourceTypes = numResourceTypes;
        this.numInstances = numInstances;
        return 0;
    }

    public boolean declare(int threadID, int[] numInstances){



        return true;
    }

    public boolean request(int threadID, int numInstances){


        return true;
    }

}
