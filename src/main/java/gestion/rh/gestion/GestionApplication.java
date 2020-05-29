package gestion.rh.gestion;

import
        gestion.rh.gestion.dao.EmployeRepository;
import gestion.rh.gestion.dao.IncsalaryRepository;
import gestion.rh.gestion.entities.Employe;
import gestion.rh.gestion.entities.Incsalary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class GestionApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(GestionApplication.class, args);
    }
    @Autowired
    private IncsalaryRepository incsalaryRepository;
    @Autowired
    private EmployeRepository employeRepository;
    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Incsalary.class);

//        repositoryRestConfiguration.exposeIdsFor(Employe.class);
//        DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
//        Employe e= employeRepository.save(new Employe(null,"zoubeir","assia", "developpement",
//                "0622600249","soubeirassia@gmail.com" ,5515,df.parse("12/6/1998"),"W4578"));
//        Employe e1= employeRepository.save(new Employe(null,"zoubeir","myrieme", "production",
//                "0622600249","zoubeirassia@gmail.com" ,5515,df.parse("12/6/1998"),"W4578"));
//        Employe e2= employeRepository.save(new Employe(null,"zoubeir","assia", "developpement",
//                "0622600249","soubeirassia@gmail.com" ,5515,df.parse("12/6/1998"),"W4578"));
//        Employe e3= employeRepository.save(new Employe(null,"zoubeir","assia", "developpement",
//                "0622600249","soubeirassia@gmail.com" ,5515,df.parse("12/6/1998"),"W4578"));
//        Employe e4= employeRepository.save(new Employe(null,"zoubeir","assia", "developpement",
//                "0622600249","soubeirassia@gmail.com" ,5515,df.parse("12/6/1998"),"W4578"));
//        Employe e5= employeRepository.save(new Employe(null,"STIRI","Aasmae", "info",
//                "0622611149","stirias@gmail.com" ,11000,df.parse("12/3/2002"),"I736578"));
//        Incsalary i = incsalaryRepository.save(new Incsalary(null,"asss","eee", 0,0,0,0,0));

    }


}
