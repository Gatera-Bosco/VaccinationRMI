package controllers;

import model.*;
import org.hibernate.*;

public class VaccinationDao {

    public void saveVaccination(Vaccination vac) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(vac);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
