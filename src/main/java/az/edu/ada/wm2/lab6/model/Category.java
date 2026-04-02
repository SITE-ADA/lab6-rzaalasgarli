package main.java.az.edu.ada.wm2.lab6.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    @ManyToMany(mappedBy = "categories")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @Builder.Default
    private Set<Product> products = new HashSet<>();
}