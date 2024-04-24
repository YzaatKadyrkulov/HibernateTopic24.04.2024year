package org.example.config;

import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import javax.swing.border.EmptyBorder;
import java.util.Properties;

public class HibernateConfig {
    public static SessionFactory getSession() {
        Properties properties = new Properties();
        properties.put(Environment.DRIVER, "org.postgresql.Driver");
        properties.put(Environment.URL, "jdbc:postgresql://localhost:5432/topics");
        properties.put(Environment.USER, "postgres");
        properties.put(Environment.PASS, "1234");
        properties.put(Environment.HBM2DDL_AUTO, "update"); // I need to change on update after I will create table
        properties.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
        properties.put(Environment.SHOW_SQL, "true");

        Configuration configuration = new Configuration();
        configuration.addProperties(properties);
        configuration.addAnnotatedClass(Student.class);

//        SessionFactory sessionFactory = configuration.buildSessionFactory();

        return configuration.buildSessionFactory();
    }
}
