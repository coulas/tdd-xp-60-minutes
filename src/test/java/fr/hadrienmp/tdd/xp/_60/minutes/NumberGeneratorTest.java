package fr.hadrienmp.tdd.xp._60.minutes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberGeneratorTest {

    @Test
    void should_generate_an_even_number() {
        NumberGenerator numberGenerator = new NumberGenerator();

        int number = numberGenerator.generate();

        assertThat(number % 2).isEqualTo(0);
    }

    @Test
    void should_generate_a_number_ending_with_2() {
        NumberGenerator numberGenerator = new NumberGenerator();

        int number = numberGenerator.generate();

        assertThat(number % 10).isEqualTo(2);
    }
}
