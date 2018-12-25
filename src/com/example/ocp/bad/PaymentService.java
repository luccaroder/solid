package com.example.ocp.bad;

import com.example.BankSlip;
import com.example.ClientType;
import com.example.CreditCard;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PaymentService {

    private BigDecimal ONE_HUNDRED = new BigDecimal("100");

    public void bankSlip(BigDecimal value, BigDecimal discount, ClientType clientType) {
        BankSlip bankSlip = new BankSlip();
        bankSlip.setDiscountPercent(discount);
        BigDecimal discountValues = discount.divide(ONE_HUNDRED, 2, RoundingMode.HALF_DOWN);
        bankSlip.setTotal(discountValues.multiply(value));
        bankSlip.setClientType(clientType);
    }


    public void creditCard(BigDecimal value, BigDecimal discount, int partial, ClientType clientType) {
        CreditCard creditCard = new CreditCard();
        creditCard.setDiscountPercent(discount);
        BigDecimal discountValues = discount.divide(ONE_HUNDRED, 2, RoundingMode.HALF_DOWN);
        creditCard.setTotal(discountValues.multiply(value));
        creditCard.setPartialValue(discount.divide(new BigDecimal(partial), 2, RoundingMode.HALF_DOWN));
        creditCard.setClientType(clientType);
    }

    private String verivyClientType(ClientType clientType) {
        if (ClientType.SPECIAL.equals(clientType)) {
            return "Você possui mais benefícios para sua próxima compra";
        } else if (ClientType.NORMAL.equals(clientType)) {
            return "Faça nosso seguro e se torne especial para nós!";
        } else {
            return "Parabéns por fazer parte da nossa família";
        }
    }
}
