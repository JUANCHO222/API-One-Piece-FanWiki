package com.onepiece.One.Piece.FanWiki.repositorio;

import com.onepiece.One.Piece.FanWiki.modelo.OnePieceModelo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnePieceRepositorio extends CrudRepository<OnePieceModelo, Long> {
}
