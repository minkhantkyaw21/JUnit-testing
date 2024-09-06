package org.example;

import static org.junit.Assert.*;
import org.junit.Test;
public class TestCalculationLogic {

@Test
public void testFindMax(){
    assertEquals("Wrong MaxPos", 4, Calculation.findMax(new int[]{1,3,4,2}));
    assertEquals("Wrong MaxNeg", -1, Calculation.findMax(new int[]{-12, -1, -3, -4, -2}));
}
}
