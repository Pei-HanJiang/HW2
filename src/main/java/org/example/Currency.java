package org.example;

public class Currency {
    private double amount;
    private String currencyType;

    public Currency(double amount, String currencyType) {
        this.amount = amount;
        this.currencyType = currencyType;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public Currency add(Currency other) {
        if (this.currencyType.equals("NT") && other.currencyType.equals("US")) {
            double convertedAmount = other.amount * 30;
            double newAmount = this.amount + convertedAmount;
            return new Currency(newAmount, "NT");
        } else if (this.currencyType.equals("US") && other.currencyType.equals("NT")) {
            double convertedAmount = other.amount / 30;
            double newAmount = this.amount + convertedAmount;
            return new Currency(newAmount, "US");
        } else {

            double newAmount = this.amount + other.amount;
            return new Currency(newAmount, this.currencyType);
        }
    }
}
