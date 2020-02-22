package fr.gestionninja.api.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "mission")
class Mission {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String titre;

    private String description;

    private int recompenses;

    @ManyToOne
    private RangMission rang;

    private Date dateButoir;

    @ManyToMany
    private List<Ninja> ninjas;
}