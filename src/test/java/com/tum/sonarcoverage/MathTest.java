package com.tum.sonarcoverage;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MathTest {

    @InjectMocks
    private MathService mathService;

    @Test
    public void testMathService() {
        int sum = mathService.sum(3, 9);
        assert sum == 12;
        int diff = mathService.diff(5, 2);
        assert diff == 3;
    }

}
