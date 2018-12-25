package com.example;

import java.math.BigDecimal;

public class CreditCard {

    private BigDecimal total;
    private BigDecimal partialValue;
    private int plan;
    private BigDecimal discountPercent;
    private ClientType clientType;
    private String message;

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getPartialValue() {
        return partialValue;
    }

    public void setPartialValue(BigDecimal partialValue) {
        this.partialValue = partialValue;
    }

    public int getPlan() {
        return plan;
    }

    public void setPlan(int plan) {
        this.plan = plan;
    }

    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(BigDecimal discountPercent) {
        this.discountPercent = discountPercent;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
