package org.example.service;

import org.example.model.Product;
import org.example.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository ;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
  public  List<Product>getAvilableProducts(){
        List<Product>avilableProducts = new ArrayList<Product>();
       for(Product p:productRepository.findAll()){
           if(p.getInStockQty()>0){
               avilableProducts.add(p);

           }
       }
       return avilableProducts;
   }
}


