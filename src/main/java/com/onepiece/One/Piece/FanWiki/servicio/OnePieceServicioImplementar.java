package com.onepiece.One.Piece.FanWiki.servicio;

import com.onepiece.One.Piece.FanWiki.modelo.OnePieceModelo;
import com.onepiece.One.Piece.FanWiki.repositorio.OnePieceRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class OnePieceServicioImplementar implements OnePieceServicio{
    @Autowired
    OnePieceRepositorio personajesRepositorio;

    @Override
    public ArrayList<OnePieceModelo> devolverPersonajes() {
        return (ArrayList<OnePieceModelo>) personajesRepositorio.findAll();
    }

    @Override
    public Optional<OnePieceModelo> devolverPersonaje(long id) {
        return personajesRepositorio.findById(id);
    }

    @Override
    public OnePieceModelo insertarPersonaje(OnePieceModelo personaje) {
        return personajesRepositorio.save(personaje);
    }


}
