package com.soplab.lecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@EnableAutoConfiguration
public class Minimart {
    public static void main(String[] args) {
        SpringApplication.run(Minimart.class, args);
        }
    @RequestMapping(value = "/product/stickyRice", method = RequestMethod.GET,
            produces = { "application/json", "application/xml" })
    public Product firstPage() {
        GetProductType productType = new GetProductType();
        Food stickyRice = (Food) productType.getType("Food");
        stickyRice.setName("Sticky rice");
        stickyRice.setAmount(25);
        stickyRice.setPrice(10.0);
        stickyRice.setProductId("001");
        stickyRice.setExpiredDate("13-09-2019");
        stickyRice.setVolume(1500.99);
        return stickyRice;
    }
    @RequestMapping(value = "/product/ovaltin", method = RequestMethod.GET,
            produces = { "application/json", "application/xml" })
    public Product secondPage() {
        GetProductType productType = new GetProductType();
        Drink ovaltin = (Drink) productType.getType("Drink");
        ovaltin.setName("Ovaltin");
        ovaltin.setAmount(20);
        ovaltin.setPrice(15.0);
        ovaltin.setProductId("002");
        ovaltin.setVolume(125.87);
        return ovaltin;
    }
    @RequestMapping(value = "/product/tissue", method = RequestMethod.GET,
            produces = { "application/json", "application/xml" })
    public Product thirdPage() {
        GetProductType productType = new GetProductType();
        Product tissue = (Product) productType.getType("Product");
        tissue.setProductId("003");
        tissue.setPrice(37);
        tissue.setAmount(999);
        tissue.setName("Tissue");
        return tissue;
    }
}
