package sn.isi.springvisiteurs.web;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sn.isi.springvisiteurs.entities.Departement;
import sn.isi.springvisiteurs.repositories.DepartementRepository;

import java.util.List;

@Controller
@AllArgsConstructor
public class DepartementController {

    private DepartementRepository departementRepository;

    @GetMapping(path = "/departements")
    public String departements(Model model){
        List<Departement> departements = departementRepository.findAll();
        model.addAttribute("departements", departements);

        return "departements";
    }
}
