package com.example.srp.bad;

import com.example.BankSlip;
import com.example.CreditCard;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PaymentService {

    private BigDecimal ONE_HUNDRED = new BigDecimal("100");

    public void bankSlip(BigDecimal value, BigDecimal discount) {
        BankSlip bankSlip = new BankSlip();
        bankSlip.setDiscountPercent(discount);
        BigDecimal discountValues = discount.divide(ONE_HUNDRED, 2, RoundingMode.HALF_DOWN);
        bankSlip.setTotal(discountValues.multiply(value));
    }


    public void creditCard(BigDecimal value, BigDecimal discount, int partial) {
        CreditCard creditCard = new CreditCard();
        creditCard.setDiscountPercent(discount);
        BigDecimal discountValues = discount.divide(ONE_HUNDRED, 2, RoundingMode.HALF_DOWN);
        creditCard.setTotal(discountValues.multiply(value));
        creditCard.setPartialValue(discount.divide(new BigDecimal(partial), 2, RoundingMode.HALF_DOWN));
    }
}
