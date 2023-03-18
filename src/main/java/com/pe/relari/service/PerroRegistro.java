package com.pe.relari.service;


import com.pe.relari.model.Perro;

import java.util.List;

public interface PerroRegistro {

    List<Perro> listar();

    void agregar(Perro perro);

    void eliminarPorId(Integer idPerro);

    Perro buscarPorId(Integer idPerro);

}
