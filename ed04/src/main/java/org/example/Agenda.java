package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Representa una agenda que almacena y gestiona contactos.
 */
public class Agenda {

    /** Lista de contactos almacenados en la agenda. */
    private List<Contacto> contacts; // Lista de Contacto

    /**
     * Constructor de la clase Agenda.
     * Inicializa una lista vacía de contactos.
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Agrega un contacto a la agenda. Si el contacto ya existe, se añade el nuevo número
     * a su lista de teléfonos.
     *
     * @param name Nombre del contacto.
     * @param phone Número de teléfono a agregar.
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Elimina un contacto de la agenda por su nombre.
     *
     * @param name Nombre del contacto a eliminar.
     */
    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Modifica un número de teléfono de un contacto.
     * Si el número antiguo existe en la lista, se reemplaza con el nuevo número.
     *
     * @param name Nombre del contacto a modificar.
     * @param oldPhone Número de teléfono actual a modificar.
     * @param newPhone Nuevo número de teléfono a establecer.
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Obtiene la lista de contactos almacenados en la agenda.
     *
     * @return Lista de contactos.
     */
    public List<Contacto> getContacts() {
        return this.contacts;
    }
}