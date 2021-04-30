package com.example.osalgorithms;

public class OPTIMAL {
    int  pointer2 = 0, hit2 = 0, fault2 = 0;
    boolean isFull = false;
    int buffer2[];
    int mem_layout2[][];
    float hit_ratio2;
    public OPTIMAL optoperation(int frames2, int reference2[], int ref_len2) {
        OPTIMAL opt1 = new OPTIMAL();

        reference2 = new int[ref_len2];
        opt1.mem_layout2 = new int[ref_len2][frames2];
        opt1.buffer2 = new int[frames2];
        for (int j = 0; j < frames2; j++)
            opt1.buffer2[j] = -1;


        for (int i = 0; i < ref_len2; i++) {
            int search = -1;
            for (int j = 0; j < frames2; j++) {
                if (opt1.buffer2[j] == reference2[i]) {
                    search = j;
                    opt1.hit2++;
                    break;
                }
            }
            if (search == -1) {
                if (opt1.isFull) {
                    int index[] = new int[frames2];
                    boolean index_flag[] = new boolean[frames2];
                    for (int j = i + 1; j < ref_len2; j++) {
                        for (int k = 0; k < frames2; k++) {
                            if ((reference2[j] == opt1.buffer2[k]) && (index_flag[k] == false)) {
                                index[k] = j;
                                index_flag[k] = true;
                                break;
                            }
                        }
                    }
                    int max = index[0];
                    opt1.pointer2 = 0;
                    if (max == 0)
                        max = 200;
                    for (int j = 0; j < frames2; j++) {
                        if (index[j] == 0)
                            index[j] = 200;
                        if (index[j] > max) {
                            max = index[j];
                            opt1.pointer2 = j;
                        }
                    }
                }
                opt1.buffer2[opt1.pointer2] = reference2[i];
                opt1.fault2++;
                if (!opt1.isFull) {
                    opt1.pointer2++;
                    if (opt1.pointer2 == frames2) {
                        opt1.pointer2 = 0;
                        isFull = true;
                    }
                }
            }
            for (int j = 0; j < frames2; j++)
                opt1.mem_layout2[i][j] = opt1.buffer2[j];
        }
        opt1.hit_ratio2=(float)((float)opt1.hit2/ref_len2);
        return opt1;
    }
}
