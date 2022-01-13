package com.example.cardealershipproject.services;

import com.example.cardealershipproject.pojo.entity.Sale;
import com.example.cardealershipproject.pojo.input.SaleInput;
import java.util.List;

public interface SaleService {
    List<Sale> getAllSales();
    Sale findSaleByInvoicenr(Integer invoicenr);
    Sale insertSale(SaleInput saleInput);
    Sale updateSale(SaleInput saleInput, Integer invoicenr);
    Boolean deleteSale(Integer invoicenr);
}
