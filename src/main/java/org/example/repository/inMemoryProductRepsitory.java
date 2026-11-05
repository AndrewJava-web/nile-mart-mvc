package org.example.repository;

import jakarta.annotation.PostConstruct;
import org.example.model.Product;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
@Repository
public class inMemoryProductRepsitory implements ProductRepository {
List<Product>myProducts=new ArrayList<>();
@PostConstruct
void init()
{
myProducts.add(Product.builder()
                .sku("p001")
        .name("charger")
                .category("electronics")
                .price(BigDecimal.valueOf(151))
                .inStockQty(4)
        .build());
myProducts.add(Product.builder()
                .sku("p002")
        .name("iphone")
                .category("electronics")
        .price(BigDecimal.valueOf(152))
        .inStockQty(2)
        .build());
myProducts.add(Product.builder()
                .sku("p003")
        .name("iphone")
        .category("electronics")
        .price(BigDecimal.valueOf(153))
                .inStockQty(0)
        .build());
}
    @Override
    public List<Product> findAll() {
        return myProducts;
    }

    @Override
    public Product findById(String sku) {
        for (Product p : myProducts) {
            if (p.getSku().equals(sku)) {
                return p;
            }
        }
        return null;
    }
}
