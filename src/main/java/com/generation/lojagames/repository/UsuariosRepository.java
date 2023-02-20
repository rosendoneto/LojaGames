package com.generation.lojagames.repository;

import com.generation.lojagames.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {

    public List<Usuarios> findAllByUsuarioContainingIgnoreCase(@Param("usuarios") String usuarios);

}
