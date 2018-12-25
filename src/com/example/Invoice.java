package com.example;

public enum Invoice {

    BANK_SLIP {
        @Override
        public String createInvoice() {
            return "Gerar fatura do Boleto";
        }
    }, CREDIT_CARD {
        @Override
        public String createInvoice() {
            return "Gerar fatura cartão de crédito";
        }
    };

    public abstract String createInvoice();
}
