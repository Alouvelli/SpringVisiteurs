package sn.isi.springvisiteurs.web;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import sn.isi.springvisiteurs.entities.*;
import sn.isi.springvisiteurs.repositories.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@AllArgsConstructor
public class VisiteurController {
    private VisiteurRepository visiteurRepository;

    @GetMapping(path = "/index")
    public String visiteurs(Model model){

        List<Visiteur> visiteurs = visiteurRepository.findAll();
        model.addAttribute("listVisiteurs", visiteurs);
        return "visiteurs";
    }

    @GetMapping("/delete")
    public String delete(Long id){
        visiteurRepository.deleteById(id);
        return "redirect:/index";
    }

    @GetMapping("/editVisiteur")
    public String editVisiteur(Model model, Long id){
        Visiteur visiteur = visiteurRepository.findById(id).orElse(null);
        List<Departement> departements = departementRepository.findAll();
        List<Filiere> filieres = filiereRepository.findAll();
        List<Connaissance> connaissances = connaissanceRepository.findAll();
        List<Sexe> sexes = sexeRepository.findAll();
        if (visiteur == null) throw new RuntimeException("Visiteur introuvable");
        model.addAttribute("visiteur", visiteur);
        model.addAttribute("sexes", sexes);
        model.addAttribute("filieres", filieres);
        model.addAttribute("connaissances", connaissances);
        model.addAttribute("departements", departements);
                return "editVisiteur";
    }

    @GetMapping("/")
    public String home(){
        return "/home";
    }

    @GetMapping("/datatable")
    @ResponseBody
    public List<Visiteur>visiteurList(){
        return visiteurRepository.findAll();
    }

    private DepartementRepository departementRepository;
    private FiliereRepository filiereRepository;
    private ConnaissanceRepository connaissanceRepository;
    private SexeRepository sexeRepository;
    @GetMapping("/formVisiteurs")
    public String formVisiteurs(Model model){
        model.addAttribute("visiteur", new Visiteur());
        List<Departement> departements = departementRepository.findAll();
        model.addAttribute("departements", departements);
        List<Filiere> filieres = filiereRepository.findAll();
        model.addAttribute("filieres", filieres);
        List<Connaissance> connaissances = connaissanceRepository.findAll();
        model.addAttribute("connaissances", connaissances);
        List<Sexe> sexes = sexeRepository.findAll();
        model.addAttribute("sexes", sexes);
        return "formVisiteurs";

    }

    @PostMapping(path = "/save")
    public String save(@Valid FormVisiteur visiteur, Departement departement, Filiere filiere, Sexe sexe , Connaissance connaissance, BindingResult bindingResult){
        if (bindingResult.hasErrors()) return "formVisiteurs";
       int id= visiteur.connaissance;
    // visiteur.setSexe(sexe);
       // visiteur.setDepartement(departement);
        //visiteur.setConnaissance(connaissance);
        //visiteur.setFiliere(filiere);
        //visiteurRepository.save(visiteur);
        return "redirect:/index";
    }
}
