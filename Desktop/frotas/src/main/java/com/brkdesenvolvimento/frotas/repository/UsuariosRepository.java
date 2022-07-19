package com.brkdesenvolvimento.frotas.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brkdesenvolvimento.frotas.model.Usuario;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuario, Long> {
	public Optional<Usuario> findByUsuario(String usuarios);

}
