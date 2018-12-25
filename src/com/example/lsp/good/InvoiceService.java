package com.example.lsp.good;

import com.example.Invoice;

public class InvoiceService {

    private Invoice invoice;

    public InvoiceService(Invoice invoice) {
        this.invoice = invoice;
    }

    public String generateInvoice() {
        return invoice.createInvoice();
    }
}
