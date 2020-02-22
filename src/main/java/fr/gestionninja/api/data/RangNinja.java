package fr.gestionninja.api.data;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "rang_ninja")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
class RangNinja extends Parametre {
    
}