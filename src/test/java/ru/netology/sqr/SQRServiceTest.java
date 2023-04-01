package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void testReturnAllSquaresFound() {

        SQRService service = new SQRService();

        int actual = service.calc(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testReturnOneSquare() {

        SQRService service = new SQRService();

        int actual = service.calc(50, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testReturnZeroSquares() {
        SQRService service = new SQRService();

        int actual = service.calc(1, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testZeroForNegativeRanges() {
        SQRService service = new SQRService();

        int actual = service.calc(-100, -50);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnAllSquaresForSameRange() {
        SQRService service = new SQRService();

        int actual = service.calc(121, 120);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
}

