package org.springframework.samples.petclinic.product;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface ProductRepository extends CrudRepository<Product, Integer>{
    List<Product> findAll();

    @Query("Select productType FROM Product product")
    List<ProductType> findAllProductTypes();
    Optional<Product> findById(int id);
    Product findByName(String name);
    Product save(Product p);

    @Query("Select productType FROM ProductTypes where productType.name=name")
    ProductType findProductTypeByName(@Param("name")String name);
}
