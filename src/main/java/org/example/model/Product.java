package org.example.model;


import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
@Data
@Builder
public class Product {
    private String sku;
    private String name;
    private String category;
    private BigDecimal price;
    private int inStockQty;

}
