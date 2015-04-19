/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GestStations;

/**
 *
 * @author 21103482
 */
import java.util.Date;

public class Emprunt {

    private int id_usager;
    private int id_velo;
    private Date loc;

    public Emprunt(int u, int v, Date h) {
        this.id_usager = u;
        this.id_velo = v;
        this.loc = h;
    }
}
