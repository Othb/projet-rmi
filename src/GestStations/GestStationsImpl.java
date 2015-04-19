/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GestStations;

/**
 *
 * @author 21103482
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Collection;
import java.util.Iterator;

public class GestStationsImpl extends UnicastRemoteObject implements GestStations {

    private Collection<Usager> lesUsagers;
    private Collection<Station> lesStations;
    private Collection<Velo> lesVelos;
    private Collection<Emprunt> lesEmprunts;

    protected GestStationsImpl() throws RemoteException {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public String abonner(String nom, String cp) throws RemoteException {
        Usager u = new Usager(nom, cp, TypeUsager.PARTICULIER);
        lesUsagers.add(u);
        return u.getID() + " - " + u.getCode();
    }

    @Override
    public boolean authentifier(int num, String mdp) throws RemoteException {
        boolean auth = false;
        Iterator<Usager> it = lesUsagers.iterator();
        Usager u;
        while (it.hasNext()) {
            u = it.next();
            if (u.getID() == num && u.getCode() == mdp) {
                auth = true;
            }
        }
        return auth;
    }

    @Override
    public void retirerVelo() throws RemoteException {
        // TODO Auto-generated method stub
    }

    @Override
    public void ajouterVelo() throws RemoteException {
        // TODO Auto-generated method stub
    }

    @Override
    public void etatVoisins() throws RemoteException {
        // TODO Auto-generated method stub
    }

    @Override
    public void infosReçu() throws RemoteException {
        // TODO Auto-generated method stub
    }
}
