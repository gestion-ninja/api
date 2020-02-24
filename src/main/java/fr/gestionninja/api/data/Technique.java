package fr.gestionninja.api.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "technique")
@Data
@NoArgsConstructor
public class Technique {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true, nullable = false)
    private String nom;

}