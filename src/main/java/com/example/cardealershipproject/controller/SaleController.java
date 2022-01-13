package com.example.cardealershipproject.controller;

import com.example.cardealershipproject.pojo.entity.Sale;
import com.example.cardealershipproject.pojo.input.SaleInput;
import com.example.cardealershipproject.services.defaultservices.DefaultSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class SaleController {
    @Autowired
    private DefaultSaleService defaultSaleService;

    @GetMapping("/sales")
    public List<Sale> getAllSales() {
        return defaultSaleService.getAllSales();
    }

    @GetMapping("/sales/{invoicenr}")
    public Sale findSaleByInvoicenr(@PathVariable Integer invoicenr) {
        return defaultSaleService.findSaleByInvoicenr(invoicenr);
    }

    @PostMapping("/sales")
    public Sale insertSale(@RequestBody SaleInput saleInput) {
        return defaultSaleService.insertSale(saleInput);
    }

    @PutMapping("/sales/{invoicenr}")
    public Sale updateSale(@RequestBody SaleInput saleInput, @PathVariable Integer invoicenr) {
        return defaultSaleService.updateSale(saleInput, invoicenr);
    }

    @DeleteMapping("/sales/{invoicenr}")
    public Boolean deleteSale(@PathVariable Integer invoicenr) {
        return defaultSaleService.deleteSale(invoicenr);
    }
}
