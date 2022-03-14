
package ai_project_factory;

import jade.core.AID;
import jade.core.Agent;
import jade.lang.acl.ACLMessage;


public class Customer2 extends Agent {
    
    private static String name_p ;
    private static int quantity  ;
    private static double balance_c2 = 45000 ;

    public static String getName_p() {
        return name_p;
    }

    public static void setName_p(String name_p) {
        Customer2.name_p = name_p;
    }

    public static int getQuantity() {
        return quantity;
    }

    public static void setQuantity(int quantity) {
        Customer2.quantity = quantity;
    }

    public static double getBalance_c2() {
        return balance_c2;
    }

    public static void setBalance_c2(double balance_c2) {
        Customer2.balance_c2 = balance_c2;
    }

    
    

    
    
      protected void setup(){
          
        if(!"".equals(name_p) && quantity!=0)
        {
            System.out.println("Welcome Customer2");
            ACLMessage acl1 = new ACLMessage() ;
            acl1.addReceiver(new AID("factory", false));

            String qun = String.valueOf(quantity) ;
            String bal = String.valueOf(balance_c2) ;
            
           acl1.setContent("c2"+name_p+" "+qun+" "+bal);
            
            acl1.setPerformative(ACLMessage.INFORM);

            send(acl1);
        }
    }
    
}
