package redbus.ticket;

import java.util.Scanner;

public class RedBus {
    static String busNumber="6125";

    public static void main(String[] args) {
        User us=null;
        Ticket tkt = null;
        Scanner sc = new Scanner(System.in);
try {


    boolean flag = true;
    while (flag) {
        System.out.println("1.Add Ticket\n2.Remove Ticket\n3.Change BoardingPoint\n4.Change Destination\n5.Change Both Boarding & Destination\n6.verify Ticket\n7.Bus Details\n8.User\n9.Exit");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                if (us != null) {
//                        System.out.println("Add ticket");
                    System.out.println("Enter boarding Point");
                    String brd = sc.next();
                    System.out.println("Enter Destination");
                    String dst = sc.next();
                    tkt = new Ticket("123456789", 658, brd, dst, us);
                    System.out.println("Successfully ticket generated");
                } else {
                    System.out.println("************************");
                    System.out.println("Press 8 to create user");
                    System.out.println("************************");
                }
                break;
            case 2:
                if (tkt != null) {
                    tkt = null;
                    System.out.println("Successfully Ticket cancelled");
                } else {
                    System.out.println("There no ticket booked");
                }
                break;
            case 3:
                if (tkt != null) {
                    System.out.println("Enter Boarding point");
                    tkt.setBoarding(sc.next());
                    System.out.println("Successfully your boarding point changed");
                } else {
                    System.out.println("No ticket");
                }
                break;
            case 4:
                if (tkt != null) {
                    System.out.println("Enter Destination");
                    tkt.setDestination(sc.next());
                    System.out.println("Successfully your Destination changed");
                } else {
                    System.out.println("There is no ticket to change Destination");
                }
                break;
            case 5:
                if (tkt != null) {
                    System.out.println("Enter Boarding point");
                    tkt.setBoarding(sc.next());

                    System.out.println("Enter Destination");
                    tkt.setDestination(sc.next());
                    System.out.println("Successfully your boarding point and Destination changed");
                } else {
                    System.out.println("please book the ticket");
                }
                break;
            case 6:
                if (tkt != null) {
                    System.out.println("Enter the Ticket no to verify");
                    String s1 = sc.next();
                    if (s1 == tkt.getTicketNo()) {
                        System.out.println("Your ticket is verified");
                    } else {
                        System.out.println("Please enter proper tkt no");
                    }
                } else {
                    System.out.println("No ticket to verify");
                }
                break;
            case 7:
                if (tkt != null) {
                    System.out.println("******************");
                    System.out.println("Bus No: " + busNumber + "\nTicket No: " + tkt.getTicketNo() + "\nTicket price: " + tkt.getTicketPrice() + "\nBoarding :" + tkt.getBoarding() + "\nDestination:" + tkt.getDestination());
                    System.out.println("******************");
                } else {
                    System.out.println("Please book the ticket");
                }
                break;
            case 8:
                boolean flag1 = true;
                while (flag1) {
                    System.out.println("1.Add user\n2.Remove User\n3.Verify user\n4.Ticket Details\n5.user Details\n6.Exit");
                    int choose1 = sc.nextInt();
                    switch (choose1) {
                        case 1:
                            if(us==null) {
                                System.out.println("\nPlease create user");
                                System.out.println("Enter name");
                                String name = sc.next();
                                System.out.println("Enter Phone Number");
                                long cno = sc.nextInt();
                                String gender = null;
                                System.out.println("Select Gender\n1.Male\n2.Female");
                                int choice3 = sc.nextInt();
                                switch (choice3) {
                                    case 1: {
                                        gender = "Male";

                                    }
                                    case 2: {
                                        gender = "Female";
                                    }
                                }
                                us = new User(name, cno, gender, "Bangalore", "FMEPD4583G");
                                System.out.println("\nSuccessfully user created\n");
                            }else {
                                System.out.println("user already Exit");
                            }
                            break;
                        case 2:
                            if (us != null) {
                                us = null;
                                System.out.println("Successfully User removed");
                            } else {
                                System.out.println("There is no user to remove");
                            }
                            break;
                        case 3:
                            if (tkt
                                    != null) {
                                System.out.println("Enter the phone no to verify");
                                long cn = sc.nextLong();
                                if (us.getCno() == cn) {
                                    System.out.println("Succesfully verified User");
                                } else {
                                    System.out.println("Please enter correct input");
                                }
                            } else {
                                System.out.println("No user to verify");
                            }
                            break;
                        case 4:
                            if (us != null) {
                                System.out.println("******************");
                                System.out.println("\nTicket No: " + tkt.getTicketNo() + "\nTicket price: " + tkt.getTicketPrice() + "\nBoarding :" + tkt.getBoarding() + "\nDestination:" + tkt.getDestination());

                                System.out.println("******************");
                            } else {
                                System.out.println("no user ");
                            }
                            break;
                        case 5:
                            if (us != null) {
                                System.out.println("===================");
                                us.userDetails();
                                System.out.println("=====================");
                            } else {
                                System.out.println("No user please add user");
                            }
                            break;
                        case 6:
                            flag1 = false;
                            break;
                    }

                }
                break;


            case 9:
                flag = false;

                System.out.println("Thank you");
        }
    }

}catch (Exception ex){
    ex.printStackTrace();
}
    }
}