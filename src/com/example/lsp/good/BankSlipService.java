package com.example.lsp.good;

import com.example.BankSlip;
import com.example.Invoice;
import com.example.lsp.bad.CreateInvoice;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BankSlipService {

    private BigDecimal ONE_HUNDRED = new BigDecimal("100");

    public void bankSlip(BigDecimal value, BigDecimal discount) {
        BankSlip bankSlip = new BankSlip();
        bankSlip.setDiscountPercent(discount);
        BigDecimal discountValues = discount.divide(ONE_HUNDRED, 2, RoundingMode.HALF_DOWN);
        bankSlip.setTotal(discountValues.multiply(value));
        String invoice = Invoice.BANK_SLIP.createInvoice();
        System.out.println(invoice);
    }
}
