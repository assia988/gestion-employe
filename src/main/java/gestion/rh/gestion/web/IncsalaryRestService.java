package gestion.rh.gestion.web;

import gestion.rh.gestion.entities.Incsalary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import gestion.rh.gestion.dao.IncsalaryRepository;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping(value = "/incsalary",method = RequestMethod.POST)
    public void addIncsalary(@RequestBody Incsalary inc){
        incsalaryRepository.save(inc);
    }

    @RequestMapping(value = "/incsalaries/{id}",method = RequestMethod.PUT)
    public Incsalary updateIncsalary(@PathVariable Long id,@RequestBody Incsalary inc){
        inc.setId(id);
        return incsalaryRepository.save(inc);
    }

}
