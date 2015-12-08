package org.dental.conexion;

import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.XMLConfiguration;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Henry Salinas A.
 */
public class HibernateUtil {

    private static final Logger LOG = Logger.getLogger(HibernateUtil.class);
    private static Map<String, SessionFactory> sessionFactories = new HashMap<String, SessionFactory>();

    public synchronized static SessionFactory getSessionFactory() {
        if (sessionFactories.get(ConstantesConexion.HIBERNATE_FACTORY) == null) {
            try {
                SessionFactory sfactory = obtenerSessionFactory();
                sessionFactories.put(ConstantesConexion.HIBERNATE_FACTORY, sfactory);
            } catch (Exception ex) {
                LOG.error("Error al setear las propiedades de hibernate", ex);
            }
        }
        return sessionFactories.get(ConstantesConexion.HIBERNATE_FACTORY);
    }

    private static SessionFactory obtenerSessionFactory() throws ExceptionInInitializerError {
        try {
            XMLConfiguration hibernateConf = new XMLConfiguration(ConstantesConexion.HIBERNATE_CONF);

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setValidating(false);
            factory.setIgnoringComments(true);
            factory.setIgnoringElementContentWhitespace(true);
            DocumentBuilder builder = factory.newDocumentBuilder();

            Configuration configBDD = new PropertiesConfiguration(ConstantesConexion.PROPIEDAD_BDD);
            String url = configBDD.getString("base");
            String usuario = configBDD.getString("usuario");
            String clave = configBDD.getString("password");

            LOG.info("-------------------archivo BDD------------------");
            LOG.info("url: " + url);
            LOG.info("usuario: " + usuario);
            LOG.info("clave: " + clave);

            Document doc = builder.parse(hibernateConf.getBasePath());
            NodeList lista = doc.getElementsByTagName("session-factory");
            Element nodoSessionFactory = (Element) lista.item(0);

            Element property = null;
            // Nodo url
            property = doc.createElement("property");
            property.setAttribute("name", "connection.url");
            property.appendChild(doc.createTextNode(url));
            nodoSessionFactory.appendChild(property);
            // Nodo username
            property = doc.createElement("property");
            property.setAttribute("name", "connection.username");
            property.appendChild(doc.createTextNode(usuario));
            nodoSessionFactory.appendChild(property);
            // Nodo password
            property = doc.createElement("property");
            property.setAttribute("name", "connection.password");
            property.appendChild(doc.createTextNode(clave));
            nodoSessionFactory.appendChild(property);

            AnnotationConfiguration annotationConfiguration = new AnnotationConfiguration();
            annotationConfiguration.configure(doc);
            SessionFactory sessionFactory = annotationConfiguration.buildSessionFactory();
            return sessionFactory;
        } catch (Throwable ex) {
            LOG.error(ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
}
