package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un contacto con un nombre y una lista de números de teléfono.
 */

public class Persona {

    /** Nombre del contacto. */
    private String name;

    /** Lista de números de teléfono asociados al contacto. */
    private List<String> phones;

    /**
     * Constructor de la clase Persona.
     *
     * @param name Nombre del contacto.
     * @param phone Número de teléfono del contacto.
     */
    public Persona(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Obtiene el nombre del contacto.
     *
     * @return El nombre del contacto.
     */
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene la lista de números de teléfono del contacto.
     *
     * @return Lista de números de teléfono.
     */
    public List<String> getPhones() {
        return this.phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}




