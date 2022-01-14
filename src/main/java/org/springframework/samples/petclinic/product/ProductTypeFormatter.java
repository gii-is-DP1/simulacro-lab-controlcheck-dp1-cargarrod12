package org.springframework.samples.petclinic.product;

import java.text.ParseException;
import java.util.Collection;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

@Component
public class ProductTypeFormatter implements Formatter<ProductType>{
    @Autowired
    ProductService productServ;

    @Override
    public String print(ProductType object, Locale locale) {
        // TODO Auto-generated method stub
        return object.name;
    }

    @Override
    public ProductType parse(String text, Locale locale) throws ParseException {
        ProductType p = this.productServ.getProductType(text);
        if(p != null && p.name.equals(text)){
        return p;
        } throw new ParseException("type not found: " + text, 0);}
    
}
