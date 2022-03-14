package ai_project_factory;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Factory extends Agent {

    String[] name_p = new String[]{"A", "B", "C", "D", "E"};
    int[] quantity = new int[]{7500, 3500, 4050, 1500, 2275};
    double[] price = new double[]{45, 150, 300, 65, 275};
    
    static double total_price = 0 ; 

    static int cnt_c1 = 1;
    static int cnt_c2 = 1;
    static int cnt_c3 = 1;

    public static double getTotal_price() {
        return total_price;
    }

    public static void setTotal_price(double total_price) {
        Factory.total_price = total_price;
    }
    
    
    
    protected void setup() {

        System.out.println("Start factory");
        addBehaviour(new CyclicBehaviour() {
            @Override
            public void action() {
                ACLMessage a = receive();
                if (a != null) {

                    String con = a.getContent();

                    if ("c1".equals(con.substring(0, 2))) {

                        String con_c1 = con.substring(2, con.length());
                        StringTokenizer st = new StringTokenizer(con_c1);
                        while (st.hasMoreTokens()) {
                            String name = st.nextToken();
                            int qun = Integer.parseInt(st.nextToken());
                            double balance = Double.parseDouble(st.nextToken());

                            switch (name) {
                                case "A" -> {
                                    if (qun <= quantity[0]) {
                                        quantity[0] -= qun;
                                        double total = qun * price[0] * 0.8;    // offer of 20%
                                        total_price = total ;
                                        if (balance >= total) {
                                            balance -= total;
                                            Customer1.setBalance_c1(balance);
                                            JOptionPane.showMessageDialog(null, "Buy successfully and total price is : " + total + "$ "
                                                    + "\nand you take offer on product \" A \" IS : 20% ");
                                        } else {
                                            if (cnt_c1 <= 2) {
                                                JOptionPane.showMessageDialog(null, "Buy successfully but balance of "
                                                        + "customer1 \"not Enough\" \n and you borrowed ( " + con_c1 + " ) once "
                                                        + "\nand you take offer on product \" A \" IS : 20% ");
                                                balance -= total;
                                                Customer1.setBalance_c1(balance);
                                                cnt_c1++;
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Sorry!!, you have "
                                                        + "exceeded the borrowing limit and you borrowed ( " + balance + "$ )");
                                            }
                                        }

                                    } //  End check Quantity yes
                                    else {
                                        JOptionPane.showMessageDialog(null, "Quantity of factory \"not Enough\"");
                                    } // End check Quantity no
                                }
                                case "B" -> {
                                    if (qun <= quantity[1]) {
                                        quantity[1] -= qun;
                                        double total = qun * price[1];
                                        if (balance >= total) {
                                            balance -= total;
                                            total_price = total ;
                                            Customer1.setBalance_c1(balance);
                                            JOptionPane.showMessageDialog(null, "Buy successfully and total price is : " + total + "$ ");
                                        } else {
                                            if (cnt_c1 <= 2) {
                                                JOptionPane.showMessageDialog(null, "Buy successfully but balance of "
                                                        + "customer1 \"not Enough\" and you borrowed ( " + con_c1 + " ) once");
                                                balance -= total;
                                                Customer1.setBalance_c1(balance);
                                                cnt_c1++;
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Sorry!!, you have "
                                                        + "exceeded the borrowing limit and you borrowed ( " + balance + "$ )");
                                            }
                                        }

                                    } //  End check Quantity yes
                                    else {
                                        JOptionPane.showMessageDialog(null, "Quantity of factory \"not Enough\"");
                                    } // End check Quantity no
                                }
                                case "C" -> {
                                    if (qun <= quantity[2]) {
                                        quantity[2] -= qun;
                                        double total = qun * price[2];
                                        total_price = total ;
                                        if (balance >= total) {
                                            balance -= total;
                                            Customer1.setBalance_c1(balance);
                                            JOptionPane.showMessageDialog(null, "Buy successfully and total price is : " + total + "$ ");
                                        } else {
                                            if (cnt_c1 <= 2) {
                                                JOptionPane.showMessageDialog(null, "Buy successfully but balance of "
                                                        + "customer1 \"not Enough\" and you borrowed ( " + con_c1 + " ) once");
                                                balance -= total;
                                                Customer1.setBalance_c1(balance);
                                                cnt_c1++;
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Sorry!!, you have "
                                                        + "exceeded the borrowing limit and you borrowed ( " + balance + "$ )");
                                            }
                                        }

                                    } //  End check Quantity yes
                                    else {
                                        JOptionPane.showMessageDialog(null, "Quantity of factory \"not Enough\"");
                                    } // End check Quantity no
                                }
                                case "D" -> {
                                    if (qun <= quantity[3]) {
                                        quantity[3] -= qun;
                                        double total = qun * price[3];
                                        total_price = total ;
                                        if (balance >= total) {
                                            balance -= total;
                                            Customer1.setBalance_c1(balance);
                                            JOptionPane.showMessageDialog(null, "Buy successfully and total price is : " + total + "$ ");
                                        } else {
                                            if (cnt_c1 <= 2) {
                                                JOptionPane.showMessageDialog(null, "Buy successfully but balance of "
                                                        + "customer1 \"not Enough\" and you borrowed ( " + con_c1 + " ) once");
                                                balance -= total;
                                                Customer1.setBalance_c1(balance);
                                                cnt_c1++;
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Sorry!!, you have "
                                                        + "exceeded the borrowing limit and you borrowed ( " + balance + "$ )");
                                            }
                                        }

                                    } //  End check Quantity yes
                                    else {
                                        JOptionPane.showMessageDialog(null, "Quantity of factory \"not Enough\"");
                                    } // End check Quantity no
                                }
                                case "E" -> {
                                    if (qun <= quantity[4]) {
                                        quantity[4] -= qun;
                                        double total = qun * price[4];
                                        total_price = total ;
                                        if (balance >= total) {
                                            balance -= total;
                                            Customer1.setBalance_c1(balance);
                                            JOptionPane.showMessageDialog(null, "Buy successfully and total price is : " + total + "$ ");
                                        } else {
                                            if (cnt_c1 <= 2) {
                                                JOptionPane.showMessageDialog(null, "Buy successfully but balance of "
                                                        + "customer1 \"not Enough\" and you borrowed ( " + con_c1 + " ) once");
                                                balance -= total;
                                                Customer1.setBalance_c1(balance);
                                                cnt_c1++;
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Sorry!!, you have "
                                                        + "exceeded the borrowing limit and you borrowed ( " + balance + "$ )");
                                            }
                                        }

                                    } //  End check Quantity yes
                                    else {
                                        JOptionPane.showMessageDialog(null, "Quantity of factory \"not Enough\"");
                                    } // End check Quantity no
                                }
                                default ->
                                    JOptionPane.showMessageDialog(null, "the name product Not found in factory");

                            } // End Switch

                        }
                    } // End if Customer1 Request
                    else if ("c2".equals(con.substring(0, 2))) {
                        String con_c2 = con.substring(2, con.length());
                        StringTokenizer st = new StringTokenizer(con_c2);
                        while (st.hasMoreTokens()) {
                            String name = st.nextToken();
                            int qun = Integer.parseInt(st.nextToken());
                            double balance = Double.parseDouble(st.nextToken());

                            switch (name) {
                                case "A" -> {
                                    if (qun <= quantity[0]) {
                                        quantity[0] -= qun;
                                        double total = qun * price[0] * 0.8;    // offer of 20%
                                        total_price = total ;
                                        if (balance >= total) {
                                            balance -= total;
                                            Customer2.setBalance_c2(balance);
                                            JOptionPane.showMessageDialog(null, "Buy successfully and total price is : " + total + "$ "
                                                    + "\nand you take offer on product \" A \" IS : 20% ");
                                        } else {
                                            if (cnt_c2 <= 2) {
                                                JOptionPane.showMessageDialog(null, "Buy successfully but balance of "
                                                        + "customer2 \"not Enough\" \n and you borrowed ( " + con_c2 + " ) once "
                                                        + "\nand you take offer on product \" A \" IS : 20% ");
                                                balance -= total;
                                                Customer2.setBalance_c2(balance);
                                                cnt_c2++;
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Sorry!!, you have "
                                                        + "exceeded the borrowing limit and you borrowed ( " + balance + "$ )");
                                            }
                                        }

                                    } //  End check Quantity yes
                                    else {
                                        JOptionPane.showMessageDialog(null, "Quantity of factory \"not Enough\"");
                                    } // End check Quantity no
                                }
                                case "B" -> {
                                    if (qun <= quantity[1]) {
                                        quantity[1] -= qun;
                                        double total = qun * price[1];
                                        total_price = total ;
                                        if (balance >= total) {
                                            balance -= total;
                                            Customer2.setBalance_c2(balance);
                                            JOptionPane.showMessageDialog(null, "Buy successfully and total price is : " + total + "$ ");
                                        } else {
                                            if (cnt_c2 <= 2) {
                                                JOptionPane.showMessageDialog(null, "Buy successfully but balance of "
                                                        + "customer2 \"not Enough\" and you borrowed ( " + con_c2 + " ) once");
                                                balance -= total;
                                                Customer2.setBalance_c2(balance);
                                                cnt_c2++;
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Sorry!!, you have "
                                                        + "exceeded the borrowing limit and you borrowed ( " + balance + "$ )");
                                            }
                                        }

                                    } //  End check Quantity yes
                                    else {
                                        JOptionPane.showMessageDialog(null, "Quantity of factory \"not Enough\"");
                                    } // End check Quantity no
                                }
                                case "C" -> {
                                    if (qun <= quantity[2]) {
                                        quantity[2] -= qun;
                                        double total = qun * price[2];
                                        total_price = total ;
                                        if (balance >= total) {
                                            balance -= total;
                                            Customer2.setBalance_c2(balance);
                                            JOptionPane.showMessageDialog(null, "Buy successfully and total price is : " + total + "$ ");
                                        } else {
                                            if (cnt_c2 <= 2) {
                                                JOptionPane.showMessageDialog(null, "Buy successfully but balance of "
                                                        + "customer2 \"not Enough\" and you borrowed ( " + con_c2 + " ) once");
                                                balance -= total;
                                                Customer2.setBalance_c2(balance);
                                                cnt_c2++;
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Sorry!!, you have "
                                                        + "exceeded the borrowing limit and you borrowed ( " + balance + "$ )");
                                            }
                                        }

                                    } //  End check Quantity yes
                                    else {
                                        JOptionPane.showMessageDialog(null, "Quantity of factory \"not Enough\"");
                                    } // End check Quantity no
                                }
                                case "D" -> {
                                    if (qun <= quantity[3]) {
                                        quantity[3] -= qun;
                                        double total = qun * price[3];
                                        total_price = total ;
                                        if (balance >= total) {
                                            balance -= total;
                                            Customer2.setBalance_c2(balance);
                                            JOptionPane.showMessageDialog(null, "Buy successfully and total price is : " + total + "$ ");
                                        } else {
                                            if (cnt_c2 <= 2) {
                                                JOptionPane.showMessageDialog(null, "Buy successfully but balance of "
                                                        + "customer2 \"not Enough\" and you borrowed ( " + con_c2 + " ) once");
                                                balance -= total;
                                                Customer2.setBalance_c2(balance);
                                                cnt_c2++;
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Sorry!!, you have "
                                                        + "exceeded the borrowing limit and you borrowed ( " + balance + "$ )");
                                            }
                                        }

                                    } //  End check Quantity yes
                                    else {
                                        JOptionPane.showMessageDialog(null, "Quantity of factory \"not Enough\"");
                                    } // End check Quantity no
                                }
                                case "E" -> {
                                    if (qun <= quantity[4]) {
                                        quantity[4] -= qun;
                                        double total = qun * price[4];
                                        total_price = total ;
                                        if (balance >= total) {
                                            balance -= total;
                                            Customer2.setBalance_c2(balance);
                                            JOptionPane.showMessageDialog(null, "Buy successfully and total price is : " + total + "$ ");
                                        } else {
                                            if (cnt_c2 <= 2) {
                                                JOptionPane.showMessageDialog(null, "Buy successfully but balance of "
                                                        + "customer2 \"not Enough\" and you borrowed ( " + con_c2 + " ) once");
                                                balance -= total;
                                                Customer2.setBalance_c2(balance);
                                                cnt_c2++;
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Sorry!!, you have "
                                                        + "exceeded the borrowing limit and you borrowed ( " + balance + "$ )");
                                            }
                                        }

                                    } //  End check Quantity yes
                                    else {
                                        JOptionPane.showMessageDialog(null, "Quantity of factory \"not Enough\"");
                                    } // End check Quantity no
                                }
                                default ->
                                    JOptionPane.showMessageDialog(null, "the name product Not found in factory");

                            } // End Switch

                        } // while StringTokenizer

                    } // End if customer2
                    else if ("c3".equals(con.substring(0, 2))) {
                        String con_c3 = con.substring(2, con.length());
                        StringTokenizer st = new StringTokenizer(con_c3);
                        while (st.hasMoreTokens()) {
                            String name = st.nextToken();
                            int qun = Integer.parseInt(st.nextToken());
                            double balance = Double.parseDouble(st.nextToken());

                            switch (name) {
                                case "A" -> {
                                    if (qun <= quantity[0]) {
                                        quantity[0] -= qun;
                                        double total = qun * price[0] * 0.8;    // offer of 20%
                                        if (balance >= total) {
                                            balance -= total;
                                            Customer3.setBalance_c3(balance);
                                            JOptionPane.showMessageDialog(null, "Buy successfully and total price is : " + total + "$ "
                                                    + "\nand you take offer on product \" A \" IS : 20% ");
                                        } else {
                                            if (cnt_c3 <= 2) {
                                                JOptionPane.showMessageDialog(null, "Buy successfully but balance of "
                                                        + "customer3 \"not Enough\" \n and you borrowed ( " + con_c3 + " ) once "
                                                        + "\nand you take offer on product \" A \" IS : 20% ");
                                                balance -= total;
                                                Customer3.setBalance_c3(balance);
                                                cnt_c3++;
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Sorry!!, you have "
                                                        + "exceeded the borrowing limit and you borrowed ( " + balance + "$ )");
                                            }
                                        }

                                    } //  End check Quantity yes
                                    else {
                                        JOptionPane.showMessageDialog(null, "Quantity of factory \"not Enough\"");
                                    } // End check Quantity no
                                }
                                case "B" -> {
                                    if (qun <= quantity[1]) {
                                        quantity[1] -= qun;
                                        double total = qun * price[1];
                                        total_price = total ;
                                        if (balance >= total) {
                                            balance -= total;
                                            Customer3.setBalance_c3(balance);
                                            JOptionPane.showMessageDialog(null, "Buy successfully and total price is : " + total + "$ ");
                                        } else {
                                            if (cnt_c3 <= 2) {
                                                JOptionPane.showMessageDialog(null, "Buy successfully but balance of "
                                                        + "customer3 \"not Enough\" and you borrowed ( " + con_c3 + " ) once");
                                                balance -= total;
                                                Customer3.setBalance_c3(balance);
                                                cnt_c3++;
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Sorry!!, you have "
                                                        + "exceeded the borrowing limit and you borrowed ( " + balance + "$ )");
                                            }
                                        }

                                    } //  End check Quantity yes
                                    else {
                                        JOptionPane.showMessageDialog(null, "Quantity of factory \"not Enough\"");
                                    } // End check Quantity no
                                }
                                case "C" -> {
                                     if (qun <= quantity[2]) {
                                        quantity[2] -= qun;
                                        double total = qun * price[2];
                                        total_price = total ;
                                        total_price = total ;
                                        if (balance >= total) {
                                            balance -= total;
                                            Customer3.setBalance_c3(balance);
                                            JOptionPane.showMessageDialog(null, "Buy successfully and total price is : " + total + "$ ");
                                        } else {
                                            if (cnt_c3 <= 2) {
                                                JOptionPane.showMessageDialog(null, "Buy successfully but balance of "
                                                        + "customer3 \"not Enough\" and you borrowed ( " + con_c3 + " ) once");
                                                balance -= total;
                                                Customer3.setBalance_c3(balance);
                                                cnt_c3++;
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Sorry!!, you have "
                                                        + "exceeded the borrowing limit and you borrowed ( " + balance + "$ )");
                                            }
                                        }

                                    } //  End check Quantity yes
                                    else {
                                        JOptionPane.showMessageDialog(null, "Quantity of factory \"not Enough\"");
                                    } // End check Quantity no
                                }
                                case "D" -> {
                                     if (qun <= quantity[3]) {
                                        quantity[3] -= qun;
                                        double total = qun * price[3];
                                        total_price = total ;
                                        if (balance >= total) {
                                            balance -= total;
                                            Customer3.setBalance_c3(balance);
                                            JOptionPane.showMessageDialog(null, "Buy successfully and total price is : " + total + "$ ");
                                        } else {
                                            if (cnt_c3 <= 2) {
                                                JOptionPane.showMessageDialog(null, "Buy successfully but balance of "
                                                        + "customer3 \"not Enough\" and you borrowed ( " + con_c3 + " ) once");
                                                balance -= total;
                                                Customer3.setBalance_c3(balance);
                                                cnt_c3++;
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Sorry!!, you have "
                                                        + "exceeded the borrowing limit and you borrowed ( " + balance + "$ )");
                                            }
                                        }

                                    } //  End check Quantity yes
                                    else {
                                        JOptionPane.showMessageDialog(null, "Quantity of factory \"not Enough\"");
                                    } // End check Quantity no
                                }
                                case "E" -> {
                                     if (qun <= quantity[4]) {
                                        quantity[4] -= qun;
                                        double total = qun * price[4];
                                        total_price = total ;
                                        if (balance >= total) {
                                            balance -= total;
                                            Customer3.setBalance_c3(balance);
                                            JOptionPane.showMessageDialog(null, "Buy successfully and total price is : " + total + "$ ");
                                        } else {
                                            if (cnt_c3 <= 2) {
                                                JOptionPane.showMessageDialog(null, "Buy successfully but balance of "
                                                        + "customer3 \"not Enough\" and you borrowed ( " + con_c3 + " ) once");
                                                balance -= total;
                                                Customer3.setBalance_c3(balance);
                                                cnt_c3++;
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Sorry!!, you have "
                                                        + "exceeded the borrowing limit and you borrowed ( " + balance + "$ )");
                                            }
                                        }

                                    } //  End check Quantity yes
                                    else {
                                        JOptionPane.showMessageDialog(null, "Quantity of factory \"not Enough\"");
                                    } // End check Quantity no
                                }
                                default ->
                                    JOptionPane.showMessageDialog(null, "the name product Not found in factory");

                            } // End Switch

                        } // while StringTokenizer
                    } // End if Customer3

                } // check for Null

            }
        });  // end action and behavior

    }

} //end setup
