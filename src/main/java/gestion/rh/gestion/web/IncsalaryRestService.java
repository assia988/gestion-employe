package gestion.rh.gestion.web;

import gestion.rh.gestion.entities.Employe;
import gestion.rh.gestion.entities.Incsalary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import gestion.rh.gestion.dao.IncsalaryRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
//@CrossOrigin("*")
@CrossOrigin(origins = "*")
public class IncsalaryRestService {
    @Autowired
    private IncsalaryRepository incsalaryRepository;
    @RequestMapping(value = "/incsalaries",method = RequestMethod.GET)
    public List<Incsalary> getAllIncsalary(){
        List<Incsalary> incsalaries = new ArrayList<>();
        incsalaryRepository.findAll().forEach(incsalaries::add);
        return incsalaries;
    }

    @RequestMapping(value = "/incsalaries/{id}",method = RequestMethod.GET)
    public Optional<Incsalary> getIncSalary(@PathVariable Long id){
        Optional<Incsalary> e = incsalaryRepository.findById(id);
        if(e == null){
            return null;
        }
        else
            return e;
    }

    @RequestMapping(value = "/incsalaries",method = RequestMethod.POST)
    public void addIncsalary(@RequestBody Incsalary inc){
        incsalaryRepository.save(inc);
    }

    @RequestMapping(value = "/incsalaries/{id}",method = RequestMethod.PUT)
    public Incsalary updateIncsalary( @PathVariable Long id,@RequestBody Incsalary inc){
        inc.setId(id);
        return incsalaryRepository.save(inc);
    }
    @RequestMapping(value = "/incsalaries/{id}",method = RequestMethod.DELETE)
    public boolean deleteInc(@PathVariable Long id){
        incsalaryRepository.deleteById(id);
        return true;
    }

}
