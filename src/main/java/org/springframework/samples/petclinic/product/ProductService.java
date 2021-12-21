package org.springframework.samples.petclinic.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {

    @Autowired
    ProductRepository productRepo;
    public List<Product> getAllProducts(){return productRepo.findAll();}

    public List<Product> getProductsCheaperThan(double price) {
        return null;
    }

    public ProductType getProductType(String typeName) {
        return productRepo.findProductTypeByName(typeName);
    }

    public Product save(Product p){
        return null;       
    }

    
}
