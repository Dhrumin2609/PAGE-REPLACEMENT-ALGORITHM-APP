package com.example.osalgorithms;

import java.util.ArrayList;

public class LRU {
    int pointer1 = 0, hit1 = 0, fault1 = 0;
    Boolean isFull = false;
    int buffer1[];
    ArrayList<Integer> stack = new ArrayList<Integer>();
    int mem_layout1[][];
    float hit_ratio1;
    public LRU lruoperation(int frames1, int reference1[], int ref_len1){
      LRU lru1 = new LRU();
        reference1 = new int[ref_len1];
        lru1.mem_layout1 = new int[ref_len1][frames1];
        lru1.buffer1 = new int[frames1];
        for(int j = 0; j < frames1; j++)
            lru1.buffer1[j] = -1;


        for(int i = 0; i < ref_len1; i++)
        {
            int search = -1;
            for(int j = 0; j < frames1; j++)
            {
                if(lru1.buffer1[j] == reference1[i])
                {
                    search = j;
                    lru1.hit1++;
                    break;
                }
            }
            if(search == -1)
            {
                lru1.buffer1[lru1.pointer1] = reference1[i];
                lru1.fault1++;
                lru1.pointer1++;
                if(lru1.pointer1 == frames1)
                    lru1.pointer1 = 0;
            }
            for(int j = 0; j < frames1; j++)
                lru1.mem_layout1[i][j] = lru1.buffer1[j];
        }
        lru1.hit_ratio1=(float)((float)lru1.hit1/ref_len1);
        return lru1;



    }
}
