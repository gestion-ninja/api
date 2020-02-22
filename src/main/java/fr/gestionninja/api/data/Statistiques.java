package fr.gestionninja.api.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "statistiques")
class Statistiques {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int ninjutsu;

    private int taijutsu;

    private int genjutsu;

    private int intelligence;

    private int force;

    private int vitesse;

    private int endurance;

    private int sceau;

}