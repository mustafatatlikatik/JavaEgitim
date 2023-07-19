package com.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class Main {
    public static void main(String[]args){
        SessionFactory factory = new Configuration()
                .configure("com/hibernatedemo/hibernate.cfg.xml")
                .addAnnotatedClass(City.class).buildSessionFactory();
        Session session = factory.getCurrentSession();

        try {
            //Unit of Work tasarım deseninin uygulanmış halidir session
            session.beginTransaction();
            //HQL--> Hibernate Querry Language
            //Select * from city
            //"from City c where c.countryCode='TUR' AND c.district='Eskisehir'"
            //"from City c where c.name LIKE '%kar%'" içinde kar geçen şehirleri getirir
            //"from City c ORDER BY c.name ASC"
            //ASC - Ascending yükselen demek aşağıdan yukarı A-Z'ye defaulttur
            //DESC - Descending ASC'nin tam tersi
            /*List<City> cities = session.createQuery("from City c ORDER BY c.name ASC").getResultList();
            for (City city : cities) {
                System.out.println(city.getName());
            }
            //country codeları sıralamak için kullanılır
            /*List<String>countryCodes = session.createQuery("select c.countryCode from City c GROUP BY c.countryCode ").getResultList();
            for (String countryCode : countryCodes) {
                System.out.println(countryCode);
                session.getTransaction().commit();
            }*/
            //CRUD Create Read Update Delete
            //INSERT
            /*City city = new City();
            city.setName("Mersin 2");
            city.setCountryCode("TUR");
            city.setDistrict("Akdeniz");
            city.setPopulation(1230000);
            session.save(city);

            session.getTransaction().commit();
            System.out.println("Şehir eklendi");*/

            //UPDATE
            /*City city = session.get(City.class,4098);
            city.setPopulation(1350000);
            session.save(city);

            session.getTransaction().commit();
            System.out.println("Şehir güncellendi");*/

            //DELETE
            City city = session.get(City.class ,4098);
            session.delete(city);

            session.getTransaction().commit();
            System.out.println("Şehir silindi");

        }finally {
            factory.close();
        }
    }
}
