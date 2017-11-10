package fr.hadrienmp.tdd.xp._60.minutes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MyTest {

    private MySuperGenerator SUT = new MySuperGenerator();

    @Test
    public void givenAnEvenNumber() {
        assertNumberIsEven(SUT.givenEvenNumber());
    }

    private void assertNumberIsEven(int number) {
        assertTrue(number % 2 == 0);
    }
}
