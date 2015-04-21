/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Station;

import java.io.Serializable;

/**
 *
 * @author 21103482
 */
public class Station implements Serializable{

    private static int cpt_id = 0;
    private int id;
    private String nom;
    private String latitude;
    private String longitude;
    private int capacite;

    public Station(String n, String lat, String lon, int cap) {
        cpt_id++;
        this.id = cpt_id;
        this.nom = n;
        this.latitude = lat;
        this.longitude = lon;
        this.capacite = cap;
    }

    public String getNom() {
        return nom;
    }
    
    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public int getCapacite() {
        return capacite;
    }
}
