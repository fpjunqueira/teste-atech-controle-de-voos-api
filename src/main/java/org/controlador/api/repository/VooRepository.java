package org.controlador.api.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.controlador.api.domain.Voo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VooRepository extends JpaRepository<Voo, Long> {

	public Voo findById(Long id);

	@Query("select v from Voo v where v.partida >= :partida and v.partida <= :chegada")
	public List<Voo> findByHorarios(@Param("partida") LocalDateTime partida, @Param("chegada") LocalDateTime chegada);

}
