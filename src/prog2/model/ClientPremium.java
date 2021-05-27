/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2.model;

import java.io.Serializable;

/**
 * Classe Derivada de la classe Client
 *
 * @author Pablo
 */
public class ClientPremium extends Client implements Serializable {
    static final String TIPUS_CLIENT = "Premium";
    static final float MENSUALITAT = 4f; // Els clients premium paguen una mensualitat de 4 euros.
    static final float DESCOMPTE_ENVIAMENT = 20f; // Els clients premium reben un 20% de descompte en l'enviament.
    
    
    /**
     * Constructor de la Classe CLientPremium
     *
     * @param nom
     * @param correu
     * @param adreça
     */
    public ClientPremium(String nom, String correu, String adreça) {
        super(nom, correu, adreça);
    }

    /**
     * Sobresciptura del metode de la classe Client que retorna la String amb
     * Premium
     *
     * @return
     */
    @Override
    public String tipusClient() {
        return TIPUS_CLIENT;
    }

    /**
     * Sobresciptura del metode de la classe Client que retorna el cacul mensual
     * = 4.0.
     *
     * @return
     */
    @Override
    public float calcMensual() {
        return MENSUALITAT;
    }

    /**
     * Sobresciptura del metode de la classe Client que retorna el descompte
     * d´enviament -20%.
     *
     * @return
     */
    @Override
    public float descompteEnv() {
        return DESCOMPTE_ENVIAMENT; 
    }

}
