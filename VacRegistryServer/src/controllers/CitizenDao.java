package controllers;

import java.util.*;
import model.*;
import org.hibernate.*;

public class CitizenDao {

    public void saveCitizen(Citizen cit) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(cit);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public List<Citizen> showCitizens() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        List result = new ArrayList();
        try {
            tx = session.beginTransaction();
            result = session.createQuery("FROM Citizen").list();

            tx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return result;
    }

    public Citizen getCitizen(String id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Citizen result = new Citizen();
        try {
            tx = session.beginTransaction();
            String hql = "FROM Citizen WHERE citizenid= :id";
            //CREATING A HIBERNATE QUERY AND ADD THE RESULT TO A LIST
            Query query = session.createQuery(hql);
            query.setParameter("id", id);
            List cResult = query.list();
            Iterator iterator = cResult.iterator();
            iterator.hasNext();
            result = (Citizen) iterator.next();

            tx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return result;
    }

    public List showTableData(String type) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        List result = new ArrayList();
        try {
            tx = session.beginTransaction();
            String sql;

            if (type.equals("unvac")) {
                sql = "Select fullname,citizenid, phonenumber, citizen, brand, vacdate from citizen c left join vaccination v on c.citizenid = v.citizen where v.citizen is null;";
            } else {
                sql = "Select fullname,citizenid, phonenumber, citizen, brand, vacdate from citizen c, vaccination v where c.citizenid = v.citizen";
            }

            SQLQuery query = session.createSQLQuery(sql);
            query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            result = query.list();

            tx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return result;
    }
}
