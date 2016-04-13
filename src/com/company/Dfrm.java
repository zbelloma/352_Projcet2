package com.company;

/**
 * Created by Zakk on 4/10/2016.
 */
public class Dfrm {

    public int numResourceTypes;
    public int[] numInstancesForThread;

    public Dfrm(int numResourceTypes, int[] numInstances) {
        if(numResourceTypes > 20){//resource types cannot be greater than 20
            //add Error as resourcetypes cannont be greater than 20
        }

        this.numResourceTypes = numResourceTypes;
        this.numInstancesForThread = numInstances;
        //return 0;
    }

    public boolean declare(int threadID, int[] numInstances){
        for(int i = 0; i < numInstances.length; i++){
            numInstancesForThread[i] = numInstances[i];  //sets max instances //need to test;
        }
        // need to add fail cases

        return true;
    }

    public boolean request(int threadID, int[] numInstances){


        return true;
    }

    public boolean release(int threadID, int[] numInstances){

        return false;
    }

    public void finish(int id) {
    }
}
