package com.saas.Sales.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer rowId;
    private String product;
    private Double sales;

}
