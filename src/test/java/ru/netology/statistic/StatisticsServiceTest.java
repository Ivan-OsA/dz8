package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class StatisticsServiceTest {

        @Test
        void findMaxNew() {
            StatisticsService service = new StatisticsService();

            long[] incomesInBillions = {12, 5, 18, 4, 5, 3, 8, 6, 11, 11, 12};
            long expected = 18;

            long actual = service.findMax(incomesInBillions);

            assertEquals(expected, actual);
        }
    }
