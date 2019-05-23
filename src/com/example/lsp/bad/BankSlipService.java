package com.example.lsp.bad;

import com.example.BankSlip;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BankSlipService extends CreateInvoice {

    private BigDecimal ONE_HUNDRED = new BigDecimal("100");

    public void bankSlip(BigDecimal value, BigDecimal discount) {
        BankSlip bankSlip = new BankSlip();
        bankSlip.setDiscountPercent(discount);
        BigDecimal discountValues = discount.divide(ONE_HUNDRED, 2, RoundingMode.HALF_DOWN);
        bankSlip.setTotal(discountValues.multiply(value));
    }

    @Override
    public String invoiceCreditCard() {
        return null;
    }

    @Override
    public String invoiceBankSlip() {
        return "Fatura Boleto";
    }
}
