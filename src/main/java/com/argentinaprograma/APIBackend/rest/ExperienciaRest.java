package com.argentinaprograma.APIBackend.rest;

import com.argentinaprograma.APIBackend.controller.ExperienciaController;
import com.argentinaprograma.APIBackend.model.Experiencia;
import java.util.List;
import java.util.Optional;
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
@RequestMapping("api/experiencia")
public class ExperienciaRest {

    @Autowired
    private ExperienciaController experienciaController;
// VER TODOS
    @GetMapping("/listar")
    public List<Experiencia> listar(){
        return experienciaController.findAll();
    } 
//GUARDAR
    @PostMapping("/nueva")
    public Experiencia saveExperiencia(@RequestBody Experiencia experiencia){
        return experienciaController.save(experiencia);
    }
//BUSCAR POR ID
    @GetMapping("/buscar/{id}")
    public Optional<Experiencia> findById(@PathVariable("id") Long id){
        return experienciaController.findById(id);
    }
//BORRAR POR ID
    @DeleteMapping("/borrar/{id}")
    public String deleteById(@PathVariable("id") Long id){
        experienciaController.deleteById(id);
        return "Se eliminó la experiencia con ID:"+" "+id+" "+"corractamente.";
    }
}
