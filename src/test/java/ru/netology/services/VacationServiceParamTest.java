package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class VacationServiceParamTest {


    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Vacation.csv")
    public void testVacationInYear(int expected, int income, int expence, int thresold) {
        VacationService service = new VacationService();
        int actual = service.calculate(income, expence, thresold);
        Assertions.assertEquals(expected, actual);
    }
}