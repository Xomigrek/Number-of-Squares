package ru.netilogy.sqr.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource({
            "2,100,130",
            "90,100,1000000",
            "29,70,1500"
    })
    public void testSqrService(int expected, int min, int max) {
        SQRService service = new SQRService();
        int actual = service.numSqr(min, max);
        Assertions.assertEquals(expected, actual);
    }

}
