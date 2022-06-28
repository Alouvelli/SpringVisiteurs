package sn.isi.springvisiteurs.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sexe {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String sexe;
}
