package com.onepiece.One.Piece.FanWiki.controlador;

import com.onepiece.One.Piece.FanWiki.modelo.OnePieceModelo;
import com.onepiece.One.Piece.FanWiki.servicio.OnePieceServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("api-onepiece")
public class APIOnePiece {
    @Autowired
    OnePieceServicio personajesServicio;
    @CrossOrigin(origins = {"http://localhost:4200"}) //La ruta que este especificada puede acceder al controlador
    @GetMapping("/mostrar-personajes")
    public ArrayList<OnePieceModelo> getMostrarPerosnajes(){
        return personajesServicio.devolverPersonajes();
    }
    @CrossOrigin(origins = {"http://localhost:4200"}) //La ruta que este especificada puede acceder al controlador
    @PostMapping("/guardar-personaje")
    public OnePieceModelo postGuardarPersonaje(@RequestBody OnePieceModelo personaje){
        return personajesServicio.insertarPersonaje(personaje);
    }
    //Requestbody evnia una peticion
    @GetMapping("/mostrar-personaje-{id}")
    public Optional<OnePieceModelo> getMostrarPersonaje(@PathVariable("id") long id){
        return personajesServicio.devolverPersonaje(id);
    }
}
