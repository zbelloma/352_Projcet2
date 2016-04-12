package com.company;

/**
 * Created by Zakk on 4/12/2016.
 */
public class DfrmDemo {
    public static void main(String[] args) {
        int[] numRes={10,10,10};
        Dfrm myDfrm=new Dfrm(3,numRes);

        for(int i=0;i<3;i++){
            SampleThread st=new SampleThread(myDfrm,i);
            st.start();
            try{
                Thread.sleep(1000);
            }catch(Exception e){
            }
        }
    }
}
