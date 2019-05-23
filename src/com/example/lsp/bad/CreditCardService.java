package com.example.lsp.bad;

import com.example.CreditCard;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CreditCardService extends CreateInvoice {

    private BigDecimal ONE_HUNDRED = new BigDecimal("100");

    public void creditCard(BigDecimal value, BigDecimal discount, int partial) {
        CreditCard creditCard = new CreditCard();
        creditCard.setDiscountPercent(discount);
        BigDecimal discountValues = discount.divide(ONE_HUNDRED, 2, RoundingMode.HALF_DOWN);
        creditCard.setTotal(discountValues.multiply(value));
        creditCard.setPartialValue(discount.divide(new BigDecimal(partial), 2, RoundingMode.HALF_DOWN));
    }

    @Override
    public String invoiceCreditCard() {
        return "Gerar fatura cartão de crédito";
    }

    @Override
    public String invoiceBankSlip() {
        return null;
    }
}
