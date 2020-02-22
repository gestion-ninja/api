package fr.gestionninja.api.data;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;
import lombok.NoArgsConstructor;

@MappedSuperclass
@Data
@NoArgsConstructor
public abstract class Parametre {

    @Id
    String code;

    String libelle;

}
