package com.example.cardealershipproject.repository;

import com.example.cardealershipproject.pojo.entity.Sale;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SaleRepository extends CrudRepository<Sale, Integer> {
    List<Sale> findAll();
    Sale findSaleByInvoicenr(Integer invoicenr);
}
