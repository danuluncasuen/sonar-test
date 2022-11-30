package com.tum.sonarcoverage;

import org.springframework.stereotype.Service;

@Service
public class MathService {

    public int sum(int a, int b) {
        return a+b;
    }

    public int diff(int a, int b) {
        return a-b;
    }

}
