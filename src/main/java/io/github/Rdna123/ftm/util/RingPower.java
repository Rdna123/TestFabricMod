package io.github.Rdna123.ftm.util;

public class RingPower {

   public int levelSys(int x){
       int y;
       if (x == 0){
           y = 1;
       } else if (x == 1){
           y =4;
       } else if (x == 2){
           y = 8;
       } else {
           y = 12;
       }

       return y;
   }

}
