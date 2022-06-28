package sn.isi.springvisiteurs.web;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sn.isi.springvisiteurs.entities.Connaissance;
import sn.isi.springvisiteurs.repositories.ConnaissanceRepository;

import java.util.List;

@Controller
@AllArgsConstructor
public class ConnaissanceController {

    private ConnaissanceRepository connaissanceRepository;

    @GetMapping(path = "/connaissances")
    public String connaissances(Model model){
        List<Connaissance> connaissances = connaissanceRepository.findAll();
        model.addAttribute("connaissances", connaissances);

        return "connaissances";
    }
}
