package zxh.demo.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzNumTest {

    @Test
    public void validate_isFizz() {
        assertTrue(new FizzBuzzNum(3).isFizz());
        assertTrue(new FizzBuzzNum(18).isFizz());
        assertTrue(new FizzBuzzNum(23).isFizz());
        assertFalse(new FizzBuzzNum(4).isFizz());
        assertFalse(new FizzBuzzNum(47).isFizz());
    }

    @Test
    public void validate_isBuzz() {
        assertTrue(new FizzBuzzNum(5).isBuzz());
        assertTrue(new FizzBuzzNum(20).isBuzz());
        assertTrue(new FizzBuzzNum(51).isBuzz());
        assertFalse(new FizzBuzzNum(4).isBuzz());
        assertFalse(new FizzBuzzNum(47).isBuzz());
    }

    @Test
    public void validate_isFizzBuzz() {
        assertTrue(new FizzBuzzNum(15).isFizzBuzz());
        assertTrue(new FizzBuzzNum(35).isFizzBuzz());
        assertTrue(new FizzBuzzNum(53).isFizzBuzz());
        assertFalse(new FizzBuzzNum(4).isFizzBuzz());
        assertFalse(new FizzBuzzNum(47).isFizzBuzz());
    }

    @Test
    public void validate_Say() {
        assertEquals("Fizz", new FizzBuzzNum(23).say());
        assertEquals("Fizz", new FizzBuzzNum(18).say());
        assertEquals("Buzz", new FizzBuzzNum(20).say());
        assertEquals("Buzz", new FizzBuzzNum(52).say());
        assertEquals("FizzBuzz", new FizzBuzzNum(35).say());
        assertEquals("FizzBuzz", new FizzBuzzNum(51).say());
        assertEquals("FizzBuzz", new FizzBuzzNum(53).say());
    }

}