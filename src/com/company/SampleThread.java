package com.company;

/**
 * Created by Zakk on 4/12/2016.
 */
public class SampleThread extends Thread {

    private Dfrm myDfrm;
    private int id;

    SampleThread(Dfrm myDfrm, int id){
        this.myDfrm=myDfrm;
        this.id=id;
    }

    public void run(){

        int[] numIns0={5,5,5};
        int[] numIns1={3,4,2};
        int[] numIns2={2,1,3};

        try{
            myDfrm.declare(id,numIns0);
            System.out.printf("Thread %d has made a declare\n", id);

            System.out.printf("Thread %d raises the 1st request\n", id);
            if(myDfrm.request(id,numIns1))
                System.out.printf("Thread %d has been granted with the 1st request\n",id);
            else
                System.out.printf("thread %d fails in the request\n",id);

            Thread.sleep(5000);

            System.out.printf("thread %d raises the 2nd request\n",id);
            if(myDfrm.request(id,numIns2))
                System.out.printf("Thread %d has been granted with the 2nd request\n",id);
            else
                System.out.printf("Thread %d fails in the request\n",id);

            Thread.sleep(5000);

            if(myDfrm.release(id,numIns1)) {
                System.out.printf("Thread %d releases resources of its 1st request\n", id);
            }
            Thread.sleep(5000);

            myDfrm.finish(id);
            System.out.printf("Thread %d has finished\n",id);
        }
        catch(Exception ignored){
        }


    }

}
