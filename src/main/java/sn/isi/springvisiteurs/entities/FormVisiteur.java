package sn.isi.springvisiteurs.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
public class FormVisiteur {
    public Long id;
    public String nom;
    public String prenom;
    public String telephone;
    public String mail;
    public Date date;
    public int sexe;
    public int departement;
    public int  filiere;
    public int connaissance;
}
