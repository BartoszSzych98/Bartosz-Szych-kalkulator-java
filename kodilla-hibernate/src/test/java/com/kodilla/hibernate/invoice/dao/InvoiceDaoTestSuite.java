package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Bleach");
        Product product2 = new Product("PC");

        List<Item> items = new ArrayList<>();
        Item item1 = new Item(product1, BigDecimal.valueOf(125.45), 5, BigDecimal.valueOf(15458.46));
        Item item2 = new Item(product2, BigDecimal.valueOf(55.5), 8, BigDecimal.valueOf(5888.51));
        Item item3 = new Item(product1, BigDecimal.valueOf(0.01), 10000000, BigDecimal.valueOf(1));
        items.add(item1);
        items.add(item2);
        items.add(item3);

        Invoice invoice = new Invoice("1254", items);

        //When

        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);

    }
}
