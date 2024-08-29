package service;

import controllers.*;
import java.rmi.RemoteException;
import java.rmi.server.*;
import java.util.List;
import model.Citizen;
import model.Vaccination;

public class VacRegService extends UnicastRemoteObject implements VacRegInterface {

    public VacRegService() throws RemoteException {
        super();
    }

    @Override
    public void saveCitizen(Citizen cit) throws RemoteException {
        CitizenDao dao = new CitizenDao();
        dao.saveCitizen(cit);
    }

    @Override
    public void saveVaccination(Vaccination vac) throws RemoteException {
        VaccinationDao dao = new VaccinationDao();
        dao.saveVaccination(vac);
    }

    @Override
    public List showTableData(String type) throws RemoteException {
        CitizenDao dao = new CitizenDao();
        List result = dao.showTableData(type);
        return result;
    }

    @Override
    public List<Citizen> showCitizens() throws RemoteException {
        CitizenDao dao = new CitizenDao();
        List result = dao.showCitizens();
        return result;
    }

    @Override
    public Citizen getCitizen(String id) throws RemoteException {
        CitizenDao dao = new CitizenDao();
        Citizen citizen = dao.getCitizen(id);
        return citizen;
    }
}
