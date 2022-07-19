package com.brkdesenvolvimento.frotas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brkdesenvolvimento.frotas.model.Automovel;

@Repository
public interface AutomovelRepository extends JpaRepository<Automovel, Long> {
	public List<Automovel> findAllByPlacaContainingIgnoreCase(String placa);

}
