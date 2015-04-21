/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;
/**
 *
 * @author 21103482
 */
import GestStations.*;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

public class GestStationsImpl extends UnicastRemoteObject implements GestStations {

    private List<Usager> lesUsagers;
    private List<Station> lesStations;
    private List<Velo> lesVelos;
    private List<Emprunt> lesEmprunts;

    public GestStationsImpl() throws RemoteException {
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
    public String retirerVelo(int station) throws RemoteException {
        // TODO Auto-generated method stub
        Station st = lesStations.get(station);
        int cap = st.getCapacite();
        String rep = "";
        if(cap == 0)
        {
            rep = "DÉSOLÉ, AUCUN VELO N'EST DISPONIBLE POUR LE MOMENT";
        }
        else
        {
            rep = "VOUS POUVEZ ENCANCHER LE VELO";
        }
        
        return rep;
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
    
    public List<Station> listStations() throws RemoteException {
		// TODO Auto-generated method stub
		lesStations = new ArrayList<Station>();
		lesStations.add(new Station("Carmes","5.0000", "6.0000", 10));
		lesStations.add(new Station("Argoulets","7.0000", "8.0000", 10));
		lesStations.add(new Station("Purpan","1.0000", "9.0000", 10));
		return lesStations;
	}
}
