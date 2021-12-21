package org.springframework.samples.petclinic.product;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @NotEmpty
    @Size(min=3,max=50)
    String name;


    @Min(0)
    double price;


    @JoinColumn(name="productTypeId", referencedColumnName="id")
    @ManyToOne(cascade=CascadeType.ALL)
    ProductType productType;

}
