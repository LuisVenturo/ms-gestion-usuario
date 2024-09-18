package com.codigo.ms_gestion_usuario.repository;

import com.codigo.ms_gestion_usuario.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}
