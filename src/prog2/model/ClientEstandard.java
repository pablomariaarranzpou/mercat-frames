/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2.model;

import java.io.Serializable;

/**
 * Classe Deriavda de la classe Client
 *
 * @author Pablo
 */
public class ClientEstandard extends Client implements Serializable {

    static final String TIPUS_CLIENT = "Estandard";
    static final float MENSUALITAT = 0; // Els clients estàndard no paguen mensualitat
    static final float DESCOMPTE_ENVIAMENT = 0; // Els clients estàndard no reben descomptes en l'enviament.
    
    /**
     * Métode constructor de la classe ClientEstandard.
     *
     * @param nom
     * @param correu
     * @param adreça
     */
    public ClientEstandard(String nom, String correu, String adreça) {
        super(nom, correu, adreça);
    }

    /**
     * Sobresciptura del metode de la classe Client que retorna la String amb
     * estandard
     *
     * @return
     */
    @Override
    public String tipusClient() {
        return TIPUS_CLIENT;
    }

    /**
     * Sobresciptura del metode de la classe Client que retorna el cacul mensual
     * = 0.
     *
     * @return
     */
    @Override
    public float calcMensual() {
        return MENSUALITAT;
    }

    /**
     * Sobresciptura del metode de la classe Client que retorna el descompte
     * d´enviament = 0.
     *
     * @return
     */
    @Override
    public float descompteEnv() {
        return DESCOMPTE_ENVIAMENT;
    }

}
