/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GestStations;

/**
 *
 * @author 21103482
 */
public class Usager {

    private static int cpt_id = 0;
    private int id;
    private String code;
    private String nom;
    private String cp;
    private TypeUsager type;

    public Usager(String nom, String cp, TypeUsager type) {
        cpt_id++;
        this.id = cpt_id;
        //this.setCode("aleatoire");
        this.nom = nom;
        this.cp = cp;
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public int getID() {
        return id;
    }
}
