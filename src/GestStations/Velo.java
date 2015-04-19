/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GestStations;

/**
 *
 * @author 21103482
 */
public class Velo {

    private static int cpt_id = 0;
    private int id;
    private EtatVelo etat;

    public Velo() {
        cpt_id++;
        this.id = cpt_id;
        this.etat = EtatVelo.OP;
    }
}