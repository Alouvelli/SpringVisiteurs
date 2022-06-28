package sn.isi.springvisiteurs.web;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sn.isi.springvisiteurs.entities.Sexe;
import sn.isi.springvisiteurs.repositories.SexeRepository;


import java.util.ArrayList;
import java.util.List;

@Controller
@AllArgsConstructor
public class SexeController {

    private SexeRepository sexeRepository;

    @GetMapping(path = "/sexes")
    public String sexes(Model model){
        List<Sexe> sexes = sexeRepository.findAll();
        model.addAttribute("sexes", sexes);

        return "sexes";
    }

}
