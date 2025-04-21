package com.giaccento.registro_presenca.service;


import com.giaccento.registro_presenca.entity.Usuario;
import com.giaccento.registro_presenca.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class UsuarioService {

    public final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario resgistrarPresenca(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> buscarPresencas(){
        return usuarioRepository.findAll();
    }
}


