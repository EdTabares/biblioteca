package com.example.biblioteca.repositories;

import com.example.biblioteca.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByCedula(String cedula);
    List<Usuario> findByEstado(String estado);

    Usuario findByEmail(String email);

}
