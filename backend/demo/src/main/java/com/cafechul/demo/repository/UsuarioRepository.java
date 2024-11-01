package com.cafechul.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cafechul.demo.entity.Usuario;



@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long>{

}
