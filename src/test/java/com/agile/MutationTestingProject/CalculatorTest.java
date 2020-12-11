package com.agile.MutationTestingProject;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest{

    @Test
    public void shouldPassWhenAddOfTwoNumbersIsRight(){
        Calculator calc = new Calculator();
        int result = calc.getAddition(2,0);
        assertEquals(2, result);

    }

    
}
