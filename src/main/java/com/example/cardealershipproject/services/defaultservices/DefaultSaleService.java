package com.example.cardealershipproject.services.defaultservices;

import com.example.cardealershipproject.pojo.entity.Sale;
import com.example.cardealershipproject.pojo.input.SaleInput;
import com.example.cardealershipproject.repository.SaleRepository;
import com.example.cardealershipproject.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class DefaultSaleService implements SaleService {
    @Autowired
    private SaleRepository saleRepository;

    @Override
    public List<Sale> getAllSales() {
        return saleRepository.findAll();
    }

    @Override
    public Sale findSaleByInvoicenr(Integer invoicenr) {
        return saleRepository.findSaleByInvoicenr(invoicenr);
    }

    @Override
    public Sale insertSale(SaleInput saleInput) {
        Sale sale = new Sale(saleInput.getInvoicenr(), saleInput.getCustomer(), saleInput.getCar());
        return saleRepository.save(sale);
    }

    @Override
    public Sale updateSale(SaleInput saleInput, Integer invoicenr) {
        Sale sale = saleRepository.findSaleByInvoicenr(invoicenr);
        if (sale == null) { return null; }
        sale.setInvoicenr(saleInput.getInvoicenr());
        sale.setCustomer(saleInput.getCustomer());
        sale.setCar(saleInput.getCar());
        return saleRepository.save(sale);
    }

    @Override
    public Boolean deleteSale(Integer invoicenr) {
        Sale sale = saleRepository.findSaleByInvoicenr(invoicenr);
        if (sale != null) { saleRepository.delete(sale); }
        return true;
    }
}
