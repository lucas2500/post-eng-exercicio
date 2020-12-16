package com.company;
import java.lang.reflect.Array;

public class Valores implements ValoresITF {

    private int array[] = new int[10];

    @Override
    public boolean ins(int v) {

        if (v > 0){

          for (int i = 0; i < array.length; i++){
              array[i] = v;
          }

          return true;

        } else {
            return false;
        }
    }

    @Override
    public int del(int i) {
        for(int j = 0; j < array.length; j++){
            if (array[j] == i){
                array[j] = 0;
            }
        }
        return 0;
    }

    @Override
    public int size() {
        return array.length;
    }
}
