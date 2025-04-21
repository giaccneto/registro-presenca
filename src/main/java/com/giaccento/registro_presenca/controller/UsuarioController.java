package com.giaccento.registro_presenca.controller;

import com.giaccento.registro_presenca.entity.Usuario;
import com.giaccento.registro_presenca.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/presencas")
public class UsuarioController {

    public  UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<Usuario> resgistrarPresenca(@RequestBody Usuario usuario){
        return ResponseEntity.ok(usuarioService.resgistrarPresenca(usuario));
    }
    @GetMapping
    public ResponseEntity<List<Usuario>> buscarPresencas() {
        List<Usuario> usuarios = usuarioService.buscarPresencas();
        return ResponseEntity.ok(usuarios);
    }
}
