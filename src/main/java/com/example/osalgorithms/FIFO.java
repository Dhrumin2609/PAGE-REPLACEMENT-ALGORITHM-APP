package com.example.osalgorithms;

public class FIFO  {
    int pointer = 0, hit = 0, fault = 0;
    int buffer[];
    int mem_layout[][];
    float hit_ratio;
    public FIFO fifooperation(int frames, int reference[], int ref_len){
        FIFO fifo1 = new FIFO();


        reference = new int[ref_len];
        fifo1.mem_layout  = new int[ref_len][frames];
        fifo1.buffer = new int[frames];
        for (int j = 0; j < frames; j++)
            fifo1.buffer[j] = -1;
        for (int i = 0; i < ref_len; i++) {
            int search = -1;
            for (int j = 0; j < frames; j++) {
                if (fifo1.buffer[j] == reference[i]) {
                    search = j;
                    fifo1.hit++;
                    break;
                }
            }
            if (search == -1) {
                fifo1.buffer[fifo1.pointer] = reference[i];
                fifo1.fault++;
                fifo1.pointer++;
                if (fifo1.pointer == frames)
                    fifo1.pointer = 0;
            }
            for (int j = 0; j < frames; j++)
                fifo1.mem_layout[i][j] = fifo1.buffer[j];
        }
            fifo1.hit_ratio=(float)((float)fifo1.hit/ref_len);
        return fifo1;


    }
}

