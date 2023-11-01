package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class CurrencyTest {
    @ParameterizedTest
    @CsvSource({
            "10, NT, 20, US, 610, NT",
            "30, US, 5, NT, 30.16, US",
            "50, US, 30, US, 80, US",
            "20, NT, 15, NT, 35, NT"
    })
    public void testAdd(double amount1, String currencyType1, double amount2, String currencyType2, double expectedAmount, String expectedCurrencyType) {
        Currency currency1 = new Currency(amount1, currencyType1);
        Currency currency2 = new Currency(amount2, currencyType2);
        Currency result = currency1.add(currency2);
        assertEquals(expectedAmount, result.getAmount(), 0.01); // 使用0.01的误差范围
        assertEquals(expectedCurrencyType, result.getCurrencyType());
    }
}