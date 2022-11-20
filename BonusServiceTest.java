// package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.javaqa.javaqamvn.services.BonusService;

public class BonusServiceTest {

    @Test
    public void testUnregisteredUnderLimit() {
        BonusService service = new BonusService();
        int expected = 50;
        int actual = service.calcBonus(5_000, false);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRegisteredUnderLimit() {
        BonusService service = new BonusService();
        int expected = 150;
        int actual = service.calcBonus(5_000, true);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRegisteredOffLimit() {
        BonusService service = new BonusService();
        int expected = 150;
        int actual = service.calcBonus(40_000, true);
        Assertions.assertEquals(expected, actual);
    }
}
