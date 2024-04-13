package org.iCET.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.iCET.entity.CategoryEntity;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Product {
    private Long id;
    private String productName;
    private String description;
    private Double price;
    private Integer qty;


}
