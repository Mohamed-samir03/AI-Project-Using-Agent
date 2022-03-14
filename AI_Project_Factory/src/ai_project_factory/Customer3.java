
package ai_project_factory;

import jade.core.AID;
import jade.core.Agent;
import jade.lang.acl.ACLMessage;


public class Customer3 extends Agent {
    
    private static String name_p ;
    private static int quantity  ;
    private static double balance_c3 = 35000 ;

    public static String getName_p() {
        return name_p;
    }

    public static void setName_p(String name_p) {
        Customer3.name_p = name_p;
    }

    public static int getQuantity() {
        return quantity;
    }

    public static void setQuantity(int quantity) {
        Customer3.quantity = quantity;
    }

    public static double getBalance_c3() {
        return balance_c3;
    }

    public static void setBalance_c3(double balance_c3) {
        Customer3.balance_c3 = balance_c3;
    }

    

 
    
    protected void setup(){
        
        if(!"".equals(name_p) && quantity!=0)
        {
            System.out.println("Welcome Customer3");
            ACLMessage acl1 = new ACLMessage() ;
            acl1.addReceiver(new AID("factory", false));

            String qun = String.valueOf(quantity) ;
            String bal = String.valueOf(balance_c3) ;
            
           acl1.setContent("c3"+name_p+" "+qun+" "+bal);
            
            acl1.setPerformative(ACLMessage.INFORM);

            send(acl1);
        }
        
    }
    
}
