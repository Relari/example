package com.pe.relari.service.impl;


import com.pe.relari.model.Perro;
import com.pe.relari.service.PerroRegistro;

import java.util.ArrayList;
import java.util.List;

public class PerroRegistroImpl implements PerroRegistro {

    /**
     * Patron Singleton
     */
    private static PerroRegistro perroRegistro = null;

    public static PerroRegistro getInstance() {
        if (perroRegistro == null) {
            System.out.println("Creando instancia.");
            perroRegistro = new PerroRegistroImpl();
        }
        System.out.println("Retornando instancia existente.");
        return perroRegistro;
    }

    private final List<Perro> perros = new ArrayList<>();

    @Override
    public List<Perro> listar() {
        return perros;
    }

    @Override
    public void agregar(Perro perro) {
        perros.add(perro);
        System.out.println("El perro ha sido agregado bajo el ID -> " + perro.getId());
    }

    @Override
    public void eliminarPorId(Integer idPerro) {
        perros.removeIf(perro -> perro.getId().equals(idPerro));
//        for (Perro perro : perros) {
//            if (perro.getId().equals(idPerro)) {
//                perros.remove(idPerro);
//            }
//        }
    }

    @Override
    public Perro buscarPorId(Integer idPerro) {
        for (Perro perro : perros) {
            if (perro.getId().equals(idPerro)) {
                return perro;
            }
        }
        return null;
    }

}
