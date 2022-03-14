package ai_project_factory;

import jade.core.AID;
import jade.core.Agent;
import jade.lang.acl.ACLMessage;


public class Customer1 extends Agent {
    
    private static String name_p ;
    private static int quantity  ;
    private static double balance_c1 = 25000 ;



    public static String getName_p() {
        return name_p;
    }

    public static void setName_p(String name_p) {
        Customer1.name_p = name_p;
    }

    public static int getQuantity() {
        return quantity;
    }

    public static void setQuantity(int quantity) {
        Customer1.quantity = quantity;
    }

    public static double getBalance_c1() {
        return balance_c1;
    }

    public static void setBalance_c1(double balance_c1) {
        Customer1.balance_c1 = balance_c1;
    }
    
    

    
  
    
      protected void setup(){

        if(!"".equals(name_p) && quantity!=0)
        {
            System.out.println("Welcome Customer1");
            ACLMessage acl1 = new ACLMessage() ;
            acl1.addReceiver(new AID("factory", false));

            String qun = String.valueOf(quantity) ;
            String bal = String.valueOf(balance_c1) ;
            
            
           acl1.setContent("c1"+name_p+" "+qun+" "+bal);
            
            acl1.setPerformative(ACLMessage.INFORM);

            send(acl1);
        }
      }   
      

         

   
}
