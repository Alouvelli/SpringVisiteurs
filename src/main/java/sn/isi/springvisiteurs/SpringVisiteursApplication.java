package sn.isi.springvisiteurs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.dialect.springdata.SpringDataDialect;
import sn.isi.springvisiteurs.entities.Visiteur;
import sn.isi.springvisiteurs.repositories.VisiteurRepository;

import java.util.Date;

@SpringBootApplication
public class SpringVisiteursApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringVisiteursApplication.class, args);
    }


    /*@Bean
    CommandLineRunner commandLineRunner(VisiteurRepository visiteurRepository){
      return args -> {
          /*visiteurRepository.save(new Visiteur(null, "Seck", "Alassane", "771159427", "alouvelli19@gmail.com", new Date(), "GL", "Forum"));
          visiteurRepository.save(new Visiteur(null, "Diop", "Gnagna", "779259596", "gnagnadiop0@gmail.com", new Date(), "GDA", "Parent"));
          visiteurRepository.save(new Visiteur(null, "Ndiaye", "Samba", "772564850", "kroumah14@gmail.com", new Date(), "GL", "Ami"));
          visiteurRepository.save(new Visiteur(null, "Fall", "Djily", "771355260", "bayedjilybagdad@gmail.com", new Date(), "IAGE", "Site Web"));
          visiteurRepository.save(new Visiteur(null, "Diéye", "Moussa", "774875612", "mdieye@groupeisi.sn", new Date(), "RT", "Réseaux sociaux"));

          visiteurRepository.findAll().forEach(visiteur ->
                System.out.println(visiteur.getNom())
                  );


          }
      };
    }*/
}
