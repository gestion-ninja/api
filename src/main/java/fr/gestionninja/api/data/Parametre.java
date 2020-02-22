package fr.gestionninja.api.data;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Parametre {

    @Id
    String code;

    String libelle;

}
