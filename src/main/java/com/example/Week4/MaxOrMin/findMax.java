package com.example.Week4.MaxOrMin;

public class findMax implements MaxOrMin{
    @Override
    public boolean myComparator(int compVal, int cand) {
        if(compVal < cand) return true;
        else return false;
    }

}

