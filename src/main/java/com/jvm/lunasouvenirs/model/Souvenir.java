package com.jvm.lunasouvenirs.model;

import com.jvm.lunasouvenirs.utils.Category;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Souvenir {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String description;
    private String price;
    @Enumerated(EnumType.STRING)
    private Category category;
}