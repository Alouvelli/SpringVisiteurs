package sn.isi.springvisiteurs.entities;

import groovy.cli.Option;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Date;


@Entity
//@Table(name="tbl_visiteurs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Visiteur {
     @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @NotEmpty
    public String nom;
    @NotEmpty
    public String prenom;
    public String telephone;
    @Email
    public String mail;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date date;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sexe_id")
    public Sexe sexe;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "departement_id")
    public Departement departement;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "filiere_id")
    public Filiere  filiere;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "connaissance_id")
    public Connaissance connaissance;
}
