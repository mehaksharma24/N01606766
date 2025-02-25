package com.example.midterm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Product {


    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    @Table(name = "product")
    public class product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", updatable = false, nullable = false)
        private Long id;

        @Column(name = "prodname", nullable = false, length = 50)
        private String prod;

        @Column(name = "description", nullable = false, unique = true, length = 50)
        private String description;

        @Column(name = "price", nullable = false, unique = true, length = 50)
        private String price;

        @Column(name = "stock", nullable = false, unique = true, length = 50)
        private String stock;

    }
}









