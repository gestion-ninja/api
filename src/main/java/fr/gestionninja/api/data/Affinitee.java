package fr.gestionninja.api.data;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@Entity
@Table(name = "affinitee")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@NoArgsConstructor
public class Affinitee extends Parametre {

}