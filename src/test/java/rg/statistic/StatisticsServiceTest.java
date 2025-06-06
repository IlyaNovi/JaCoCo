package rg.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import org.statistic.StatisticsService;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 14};
        long expected = 14;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

}