
package com.argentinaprograma.APIBackend.rest;

import com.argentinaprograma.APIBackend.controller.AcercaDeController;
import com.argentinaprograma.APIBackend.model.AcercaDe;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@CrossOrigin (origins = "http://localhost:4200")
@RequestMapping("/api/acercaDe/")
public class AcercaDeRest {
    
 @Autowired
    private AcercaDeController acercaDeController; 
    
    
    //GUARDAR
    @PostMapping("/nueva")
    public AcercaDe saveAcercaDe(@RequestBody AcercaDe acercaDe){
        return acercaDeController.save(acercaDe);
    }
    
    
    // VER TODOS
    @GetMapping("/listar")
    public List<AcercaDe> listar(){
        return acercaDeController.findAll();
    } 
    
    
    
    
    //BORRAR POR ID
    @DeleteMapping("/borrar/{id}")
    public String deleteById(@PathVariable("id") Long id){
        acercaDeController.deleteById(id);
        return "Se eliminó la educacion con ID:"+" "+id+" "+"corractamente.";
    }
    
    
    
    
}
