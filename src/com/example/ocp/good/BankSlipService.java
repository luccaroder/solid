package com.example.ocp.good;

import com.example.BankSlip;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BankSlipService {

    private BigDecimal ONE_HUNDRED = new BigDecimal("100");
    private Client client;

    public BankSlipService(Client client) {
        this.client = client;
    }

    public void bankSlip(BigDecimal value, BigDecimal discount) {
        BankSlip bankSlip = new BankSlip();
        bankSlip.setDiscountPercent(discount);
        BigDecimal discountValues = discount.divide(ONE_HUNDRED, 2, RoundingMode.HALF_DOWN);
        bankSlip.setTotal(discountValues.multiply(value));
        bankSlip.setMessage(client.verifyMessage());
    }
}
