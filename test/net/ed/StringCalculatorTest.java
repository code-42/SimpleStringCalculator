package net.ed;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

    @Test(expected = RuntimeException.class)
    public final void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() {
        StringCalculator.add("1,2,xx");
    }

}
