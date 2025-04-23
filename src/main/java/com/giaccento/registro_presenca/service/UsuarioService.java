package com.giaccento.registro_presenca.service;


import com.giaccento.registro_presenca.entity.Usuario;
import com.giaccento.registro_presenca.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class UsuarioService {

    @Autowired
    public UsuarioRepository usuarioRepository;


    public Usuario resgistrarPresenca(Usuario usuario){
        if(isCpfValido(usuario)) {
             return usuarioRepository.save(usuario);
        }else {
            throw new IllegalArgumentException("Erro, CPF no formato inválido!");
        }
    }

    public boolean isCpfValido(Usuario usuario){
        String cpf = usuario.getCpf();
        return cpf != null  && cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");
    }

    public List<Usuario> buscarPresencas(){
        return usuarioRepository.findAll();
    }
}


