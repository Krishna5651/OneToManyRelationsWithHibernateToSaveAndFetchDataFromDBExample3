/**
 * Created By Krishna Shinde
 * Date : 30-06-2023
 * Time : 12:19
 * Project: OneToManyRelationalMappingWithHibernateSaveAndFetch
 **/

package com.mahagan.onetomany;

import com.mahagan.onetomany.entity.Company;
import com.mahagan.onetomany.entity.Employees;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OneToManyRelationalMappingWithHibernateFetchDataFromDb {
    public static void main(String[] args) {
        StandardServiceRegistry standardServiceRegistry=new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        Metadata metadata=new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
        SessionFactory sessionFactory=metadata.getSessionFactoryBuilder().build();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        TypedQuery typedQuery=session.createQuery("from Company company");
        List<Company> list=typedQuery.getResultList();
        Iterator<Company> iterator=list.listIterator();

        while (iterator.hasNext()){
            Company company=iterator.next();
            System.out.println("Company Name>>>>"+company.getCompany_Name()+" "+company.getCompany_Location());

            List<Employees> list1=company.getEmployees();
            Iterator<Employees> iterator1=list1.iterator();
            while (iterator1.hasNext()){
                Employees employees=iterator1.next();
                System.out.println(employees.getEmployee_Name()+" "+employees.getEmployee_Location()
                +" "+employees.getEmployee_Age());
            }

        }
        session.close();
        System.out.println("Data has been successfully retrive");
    }
}


