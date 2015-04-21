/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GestStations;
import Station.Station;
import java.rmi.*;
import java.util.*;

/**
 *
 * @author 21103482
 */
public interface GestStations extends java.rmi.Remote {

    public String abonner(String nom, String cp) throws RemoteException;

    public boolean authentifier(int num, String mdp) throws RemoteException;
    
    public List<Station> listStations() throws RemoteException;

    public String retirerVelo(int station) throws RemoteException;

    public void ajouterVelo() throws RemoteException;

    public void etatVoisins() throws RemoteException;

    public void infosReçu() throws RemoteException;
}
