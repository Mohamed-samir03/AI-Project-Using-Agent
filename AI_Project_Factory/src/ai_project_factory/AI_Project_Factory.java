
package ai_project_factory;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hP
 */
public class AI_Project_Factory {


    
    public static void main(String[] args) {
   new Req_customer1().setVisible(true);
        
        new Req_customer2().setVisible(true);
        new Req_customer3().setVisible(true);
        
        jade.core.Runtime r = jade.core.Runtime.instance();
        
        Profile p = new ProfileImpl("localhost", 10000 , "Factory products");
        
        ContainerController main = r.createMainContainer(p);
        
        try {
            AgentController rma = main.createNewAgent("rma", "jade.tools.rma.rma", null);
            rma.start();
            
            AgentController Factoryagent = main.createNewAgent("factory", "factory_ai.Factory", null);
            Factoryagent.start();
            
            
        } catch (StaleProxyException ex) {
            Logger.getLogger(AI_Project_Factory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
