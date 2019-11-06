package cn.dao.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil extends HttpServlet{
private static final SessionFactory sessionFactory;
    
    private static final Logger logger = Logger.getLogger(HibernateUtil.class);

    static
    {
        try
        {
	    //logger.info("");
	    logger.info("ready to get hibernate.cfg.xml");

	    ServletContext sc = config.getServletContext();
	    String webAppPath = sc.getRealPath("/");
	    logger.info("webAppPath:"+webAppPath);
	    String hibernate_cfg_xml = "/WEB-INF/classes/config/hibernate.cfg.xml";
	    String cfg_file = webAppPath + hibernate_cfg_xml;
	    logger.info("hibernate_cfg_xml Path:" + cfg_file);
	    //File cfgFile = new File(cfg_file);

            Configuration config = new Configuration().configure(cfg_file);
	    logger.info("got hibernate.cfg.xml");
	    logger.info("ready to get config.buildSessionFactory");
            sessionFactory = config.buildSessionFactory();
	    logger.info("got hibernate.cfg.xml");
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
}
