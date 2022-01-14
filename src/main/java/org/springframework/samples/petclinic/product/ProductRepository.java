package org.springframework.samples.petclinic.product;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface ProductRepository extends CrudRepository<Product, Integer>{

    List<Product> findAll();

    @Query("SELECT productType FROM Product product")
    List<ProductType> findAllProductTypes();
    Optional<Product> findById(int id);
    Product findByName(String name);
    Product save(Product p);

    @Query("SELECT p.productType FROM Product p where p.productType.name like ?1")
    ProductType findProductTypeByName(String name);

    @Query("Select p FROM Product p where price < ?1")
    List<Product> findByPriceLessThan(Double price);
}
