package service;

import java.rmi.*;
import java.util.*;
import model.*;

public interface VacRegInterface extends Remote {

    public void saveCitizen(Citizen cit) throws RemoteException;
    public void saveVaccination(Vaccination vac) throws RemoteException;

    public List showTableData(String type) throws RemoteException;
    public List<Citizen> showCitizens() throws RemoteException;
    public Citizen getCitizen(String id) throws RemoteException;
}
