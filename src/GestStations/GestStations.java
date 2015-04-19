/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GestStations;

/**
 *
 * @author 21103482
 */
public interface GestStations extends java.rmi.Remote {

    public String abonner(String nom, String cp) throws java.rmi.RemoteException;

    public boolean authentifier(int num, String mdp) throws java.rmi.RemoteException;

    public void retirerVelo() throws java.rmi.RemoteException;

    public void ajouterVelo() throws java.rmi.RemoteException;

    public void etatVoisins() throws java.rmi.RemoteException;

    public void infosReçu() throws java.rmi.RemoteException;
}
