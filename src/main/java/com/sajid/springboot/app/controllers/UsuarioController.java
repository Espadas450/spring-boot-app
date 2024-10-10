package com.sajid.springboot.app.controllers;

import com.sajid.springboot.app.models.Usuario;
import com.sajid.springboot.app.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping List<Usuario> listaUsuarios(){
        return usuarioRepository.findAll();
    }

    @PostMapping
    public Usuario agregarUsuario(@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}
