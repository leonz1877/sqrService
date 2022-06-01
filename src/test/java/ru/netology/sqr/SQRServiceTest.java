package ru.netology.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/sqrCount.csv")
    public void testSqrCount(int bottomBorder, int upperBorder, int expected) {
        SQRService count = new SQRService();

        int actual = count.sqrCount(bottomBorder, upperBorder);

        Assertions.assertEquals(expected, actual);

    }
}
