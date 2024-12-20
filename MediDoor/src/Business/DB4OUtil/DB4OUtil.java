/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DB4OUtil;

import Business.ConfigureASystem;
import Business.Ecosystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

/**
 *
 * @author antaradeshmukh
 */
public class DB4OUtil {

    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();// path to the data store
    private static DB4OUtil dB4OUtil;
    private ObjectContainer conn;

    public synchronized static DB4OUtil getInstance() {
        if (dB4OUtil == null) {
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {

            System.out.println("I never came here !");

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(Ecosystem.class).cascadeOnUpdate(true); // Change to the object you want to save

            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(Ecosystem system) {
        try {
            ObjectContainer conn = createConnection();
            conn.store(system);
            conn.commit();
            conn.close();
            System.out.println("Closed XXXXXXXX");
        } catch (Exception e) {
            System.out.println(e + " IN SOTRING");
        }
    }

    public Ecosystem retrieveSystem() {
        try {

            ObjectContainer conn = createConnection();
            System.out.println("New object");
            ObjectSet<Ecosystem> systems = conn.query(Ecosystem.class); // Change to the object you want to save
            Ecosystem system;

            if (systems.isEmpty()) {
                System.out.println("HI HI ");
//            Predefined objects created in the system
                system = ConfigureASystem.configure();  // If there's no System in the record, create a new one
                conn.close();
                return system;
            } else {
                system = systems.get(systems.size() - 1);
            }
            conn.close();
            return system;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
