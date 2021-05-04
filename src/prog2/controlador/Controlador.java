/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2.controlador;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import prog2.model.Dades;
import prog2.vista.MercatException;

/**
 *
 * @author Pablo
 */
public class Controlador {

    Dades _dades;

    public Controlador() {
        _dades = new Dades();
    }

    public void addArticle(String id, String nom, float preu, int temps, boolean admetUrgent) throws MercatException {
        _dades.afegirArticle(id, nom, preu, temps, admetUrgent);
    }

    public boolean recuperarArticles() {
        List<String> llista = _dades.recuperaArticles();
        if (llista.isEmpty()) {
            return false;
        }
        Iterator it = llista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        return true;
    }

    public void addClient(String email, String nom, String adreca, boolean esPremium) throws MercatException {
        _dades.afegirClient(email, nom, adreca, esPremium);
    }

    public boolean recuperarClients() {
        List<String> llista = _dades.recuperaClients();
        if (llista.isEmpty()) {
            return false;
        }
        Iterator it = llista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        return true;
    }

    public void addComanda(int articlePos, int clientPos, int quantitat, boolean esUrgent) throws MercatException {
        _dades.afegirComanda(articlePos, clientPos, quantitat, esUrgent);
    }

    public boolean recuperarComandes() {
        List<String> llista = _dades.recuperaComandes();
        if (!llista.isEmpty()) {
            return false;
        }
        Iterator it = llista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        return true;
    }

    public void eliminarComanda(int pos) throws MercatException {
        _dades.esborrarComanda(pos);
    }

    public boolean recuperarComandesUrgents() {
        List<String> llista = _dades.recuperaComandesUrgents();
        if(!llista.isEmpty()) return false;
        Iterator it = llista.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        return true;
    }

    public void guardar() throws IOException {
        _dades.guardaDades("dades.dat");
    }

    public void recuperar() throws IOException, ClassNotFoundException {
        _dades = _dades.carregaDades("dades.dat");
    }

}
