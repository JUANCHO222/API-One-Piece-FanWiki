package com.onepiece.One.Piece.FanWiki.servicio;

import com.onepiece.One.Piece.FanWiki.modelo.OnePieceModelo;

import java.util.ArrayList;
import java.util.Optional;

public interface OnePieceServicio {
    ArrayList<OnePieceModelo> devolverPersonajes();
    Optional<OnePieceModelo> devolverPersonaje(long id);
    OnePieceModelo insertarPersonaje(OnePieceModelo personaje);
}
