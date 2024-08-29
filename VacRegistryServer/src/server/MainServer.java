package server;

import java.rmi.registry.*;
import service.*;

public class MainServer {

    public static void main(String[] args) {
        try {
            //CREATING THE REGISTRY WITH PORT
            int port = 4050;
            Registry registry = LocateRegistry.createRegistry(port);
            VacRegInterface vac = (VacRegInterface) new VacRegService();
            //BINDING THE INTERFACE OBJECT TO THE REGISTRY
            registry.rebind("vacservice", vac);
            System.out.print("Server running on port: " + port);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
