package com.mahagan.onetomany;


import com.mahagan.onetomany.entity.Company;
import com.mahagan.onetomany.entity.Employees;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.ArrayList;
import java.util.List;

public class OneToManyRelationalMappingWithHibernateSaveAndFetchApplication {

	public static void main(String[] args) {
		StandardServiceRegistry standardServiceRegistry=new StandardServiceRegistryBuilder().
				configure("hibernate.cfg.xml").build();
		Metadata metadata=new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
		SessionFactory sessionFactory=metadata.getSessionFactoryBuilder().build();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();

		Employees employees=new Employees();
		employees.setEmployee_Name("Krishna shinde");
		employees.setEmployee_Location("Pune");
		employees.setEmployee_Age("21");

		Employees employees1=new Employees();
		employees1.setEmployee_Name("Krishna shinde");
		employees1.setEmployee_Location("Pune");
		employees1.setEmployee_Age("21");

		Employees employees2=new Employees();
		employees2.setEmployee_Name("Krishna shinde");
		employees2.setEmployee_Location("Pune");
		employees2.setEmployee_Age("21");

		List<Employees> list=new ArrayList<>();
		list.add(employees);
		list.add(employees1);
		list.add(employees2);

		Company company=new Company();
		company.setCompany_Name("LarsenAndTourbo");
		company.setCompany_Location("Pune");
		company.setEmployees(list);

		session.persist(company);
		transaction.commit();
		session.close();
		System.out.println("Data has been successfully saved in DB");

	}

}
