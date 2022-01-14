package org.springframework.samples.petclinic.product;

import lombok.Getter;
import lombok.Setter;
import org.springframework.samples.petclinic.model.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
public class Product extends BaseEntity {
    @Size(max = 50, min = 3)
    @NotNull
    String name;
    @NotNull
    @Min(0)
    double price;

    @NotNull
    @ManyToOne
    @JoinColumn(name="productTypeId", referencedColumnName = "id")
    ProductType productType;
}
