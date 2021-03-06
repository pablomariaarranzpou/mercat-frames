/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2.model;

import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Classe que hereta de Comanda, i modelitza una comanda normal
 *
 * @author janal
 */
public class ComandaNormal extends Comanda implements Serializable {

    static final float PREU_ENVIAMENT = 1; // Enviament comanda normal = 1 euro
    static final long TEMPS_REBUDA = 2; // Temps en rebre comanda normal = 2 dies

    /**
     * Constructor de la Classe ComandaNormal
     *
     * @param client
     * @param article
     * @param quantitat
     */
    public ComandaNormal(Client client, Article article, int quantitat) {
        super(client, article, quantitat);
    }

    /**
     * Sobresciptura del metode de la classe Comanda que retorna el tipus =
     * "Normal"
     *
     * @return
     */
    @Override
    public String tipusComanda() {
        return "Normal";
    }

    /**
     * Sobresciptura del metode de la classe Comanda que retorna si una comanda
     * ha sigut enviada
     *
     * @return
     */
    @Override
    public boolean comandaEnviada() {
        Date dataActual = new Date();
        // Trobem la data d'enviament sumant la data de creació més el temps fins enviaments
        Date dataEnviament = new Date(this.getCreacioComanda().getTime() + this.getArticle().getTempsFinsEnviament());
        return dataActual.after(dataEnviament);
    }

    /**
     * Sobresciptura del metode de la classe Comanda que retorna si una comanda
     * ha sigut rebuda
     *
     * @return
     */
    @Override
    public boolean comandaRebuda() {
        Date dataActual = new Date();
        // Trobem la data d'enviament sumant la data de creació més el temps fins enviaments
        Date dataRebuda = new Date(this.getCreacioComanda().getTime() + 
                this.getArticle().getTempsFinsEnviament() + TimeUnit.DAYS.toMillis(TEMPS_REBUDA));
        return dataActual.after(dataRebuda);
    }

    /**
     * Sobresciptura del metode de la classe Comanda que retorna el preu de
     * enviament.
     *
     * @return
     */
    @Override
    public float preuEnviament() {
        return PREU_ENVIAMENT - (PREU_ENVIAMENT * (this.getClient().descompteEnv() / 100));
    }

}
