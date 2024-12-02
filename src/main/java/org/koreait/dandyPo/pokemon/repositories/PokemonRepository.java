package org.koreait.dandyPo.pokemon.repositories;

import org.koreait.dandyPo.pokemon.entities.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
}
