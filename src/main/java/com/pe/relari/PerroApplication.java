package com.pe.relari;



import com.pe.relari.model.Perro;
import com.pe.relari.service.PerroRegistro;
import com.pe.relari.service.impl.PerroRegistroImpl;

import java.util.ArrayList;
import java.util.List;

public class PerroApplication {

    private static final String MACHO_TEXT = "Macho";
    private static final String HEMBRA_TEXT = "Hembra";

    public static void main(String[] args) {

        // Declarando la variable con sus valores mediante el contrustor con parametros
        Perro zeus = new Perro(1, "Zeus", MACHO_TEXT);

        System.out.println(zeus);

        // Declarando e inicializado la variable o objeto
        Perro princesa = new Perro();
        // Ingresando informacion de los datos con los metodos SET
        princesa.setId(2);
        princesa.setName("Princesa");
        princesa.setGender(HEMBRA_TEXT);

        Perro capitan = new Perro();
        capitan.setId(3);
        capitan.setName("Capitan");
        capitan.setGender(MACHO_TEXT);

        // Obtener el valor con el metodo GET
        System.out.println("EL perro tiene el ID " + princesa.getId()
                + " y su nombre es " + princesa.getName());

        List<Perro> perros = new ArrayList<>();
        perros.add(zeus);
        perros.add(princesa);
        perros.add(capitan);

        System.out.println(perros);

        for (Perro perro : perros) {
            if (perro.getGender().equals(HEMBRA_TEXT)) {
                System.out.println(perro);
            }
        }

        PerroRegistro perroRegistro = new PerroRegistroImpl();
//        PerroRegistro perroRegistro = PerroRegistroImpl.getInstance();

        // Agregando a los perros
        perroRegistro.agregar(zeus);
        perroRegistro.agregar(princesa);
        perroRegistro.agregar(capitan);

        // Listando a los perros guardados
        System.out.println(perroRegistro.listar());

        System.out.println(perroRegistro.buscarPorId(2));

        perroRegistro.eliminarPorId(3);

        System.out.println(perroRegistro.listar());
    }

}
