package fr.gestionninja.api.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "statistiques")
@Data
@NoArgsConstructor
class Statistiques {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int ninjutsu;

    private int taijutsu;

    private int genjutsu;

    private int intelligence;

    @Column(name = "_force", nullable = false)
    private int force;

    private int vitesse;

    private int endurance;

    private int sceau;

}