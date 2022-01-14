package org.springframework.samples.petclinic.product;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.pet.exceptions.DuplicatedPetNameException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class ProductController {

    private static final String VIEWS_PRODUCTS_CREATE_OR_UPDATE_FORM = "products/createOrUpdateProductForm";
    @Autowired
    private ProductService productService;
    @Autowired
    ProductController productController;

    @GetMapping(value = "/product/create")
    public String createProduct(ModelMap mp){
        List<ProductType> pt = productService.getAllProductsTypes();
        Product p = new Product();
        mp.put("producTypes", pt);
        mp.put("product",p);
        return VIEWS_PRODUCTS_CREATE_OR_UPDATE_FORM;
    }




    }

}
