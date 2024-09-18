package com.codigo.ms_gestion_usuario.repository;

import com.codigo.ms_gestion_usuario.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
