package gestion.rh.gestion.web;

import gestion.rh.gestion.dao.EmployeRepository;
import gestion.rh.gestion.entities.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class EmployeRestService {
    @Autowired
    private EmployeRepository employeRepository;
    @RequestMapping(value = "/employes",method = RequestMethod.GET)
    public List<Employe> getAllEployes(){
        List<Employe> employes = new ArrayList<>();
        employeRepository.findAll().forEach(employes::add);
        return employes;
    }
    @RequestMapping(value = "/employes/{id}",method = RequestMethod.GET)
    public Optional<Employe> getEmploye(@PathVariable Long id){
        Optional<Employe> e = employeRepository.findById(id);
        return e;
    }
    @RequestMapping(value = "/employes",method = RequestMethod.POST)
        public void addEmploye(@RequestBody Employe e){
        employeRepository.save(e);
    }
    @RequestMapping(value = "/employes/{id}",method = RequestMethod.DELETE)
        public boolean deleteEmploye(@PathVariable Long id){
        employeRepository.deleteById(id);
        return true;
    }
    @RequestMapping(value = "/employes/{id}",method = RequestMethod.PUT)
    public Employe updateEmploye(@PathVariable Long id,@RequestBody Employe e){
        e.setId(id);
        return employeRepository.save(e);
    }
}
