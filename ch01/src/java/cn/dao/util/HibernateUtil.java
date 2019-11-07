package cn.dao.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.Transaction;
import org.hibernate.Session;

import cn.bean.BaseUser;

public class HibernateUtil {
    private static final SessionFactory sessionFactory;
    
    static
    {
        try
        {
	    System.out.println(System.getProperty("user.dir"));
	    String user_dir = System.getProperty("user.dir");
	    String cfg_dir = user_dir + "/config/hibernate.cfg.xml";
	    System.out.println(cfg_dir);
	    
            //Configuration config = new Configuration().configure(cfg_dir);
            Configuration config = new Configuration().configure("/config/hibernate.cfg.xml");

	    System.out.println("got cfg");
            sessionFactory = config.buildSessionFactory();
        }
        catch(Throwable e)
        {
            throw new ExceptionInInitializerError(e);
        }
    }
    
    public static final ThreadLocal session = new ThreadLocal();
    
    public static Session currentSession() throws HibernateException
    {
        Session s = (Session)session.get();
        //Open a new Session,if this Thread has none yet
        if(s == null || !s.isOpen())
        {
            s = sessionFactory.openSession();
            session.set(s);
        }
        return s;
    }
    
    public static void closeSession() throws HibernateException
    {
        Session s = (Session)session.get();
        session.set(null);
        if(s != null)
            s.close();
    }

    public static void main(String args[]){
	Session session = HibernateUtil.currentSession();
	Transaction tx=session.beginTransaction();
	BaseUser registBean = new BaseUser();
	session.save(registBean);
	tx.commit();
	session.close();
	System.out.println("complete");
    }
}
