package fr.gestionninja.api.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.List;

@Entity
@Table(name = "ninja")
public class Ninja {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nom;

    private String prenom;

    @ManyToOne
    private RangNinja rang;

    @OneToMany
    private List<Affinitee> affinitees;

    @ManyToMany
    private List<Mission> missions;

    @ManyToOne
    private Statistiques statistiques;

}
