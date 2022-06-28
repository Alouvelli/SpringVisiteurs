package sn.isi.springvisiteurs.web;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sn.isi.springvisiteurs.entities.Filiere;
import sn.isi.springvisiteurs.repositories.FiliereRepository;

import java.util.List;

@Controller
@AllArgsConstructor
public class FiliereController {

    private FiliereRepository filiereRepository;

    @GetMapping(path = "/filieres")
    public String filieres(Model model){
        List<Filiere> filieres = filiereRepository.findAll();
        model.addAttribute("filieres", filieres);

        return "filieres";
    }
}
