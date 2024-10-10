package com.sajid.springboot.app.repositories;

import com.sajid.springboot.app.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
