package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

import AbstractFactoryClasses.ConcreteFactory1;
import AbstractFactoryClasses.ConcreteFactory2;
import AccountClasses.Account1;
import AccountClasses.Account2;

/**
 * Account Driver Class. 
 * @author - Rutul Mehta
 */
public class AccountDriver {
    /**
     * Main method
     */
    public static void main(String[] args) throws Exception {
        Integer accountselected;
        accountselected = selectaccount();

        if (accountselected == 1) {
            Account1();
        } else if (accountselected == 2) {
            Account2();
        } else {
            System.out.println("****Invalid Input !! Try Again****");
        }
    }

    /**
     * Method for account selection
     * @return - 1 for Account1, 2 for Account2
     */
    public static Integer selectaccount() {
        try {
            Integer ch;
            Scanner sc = new Scanner(System.in);
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Select Account");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("1 - Account1");
            System.out.println("2 - Account2");
            System.out.println("---------------------------------------------------------------------");
            ch = sc.nextInt();
            return ch;
        } catch (NumberFormatException e) {
            System.out.println("Wrong choice !!");
            e.printStackTrace();
        } catch (InputMismatchException e) {
        }
        return -1;
    }

    /**
     * Perform Account1 Operations
     */
    public static void Account1() {

        ConcreteFactory1 concreteFactory1 = new ConcreteFactory1();
        Account1 gp1 = new Account1(concreteFactory1);
        System.out.println("---------------------------------------------------------------------");

        System.out.print("Account-1");
        System.out.print("\n");

        String ch = "start";
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (ch != "q") {
                System.out.println("---------------------------------------------------------------------");
                System.out.print("Select Operation: ");
                System.out.print("\n");
                System.out.print("MENU of Operations");
                System.out.print("\n");
                System.out.print("0. open(int, int, int)");
                System.out.print("\n");
                System.out.print("1. pin(int)");
                System.out.print("\n");
                System.out.print("2. deposit(int)");
                System.out.print("\n");
                System.out.print("3. withdraw(int)");
                System.out.print("\n");
                System.out.print("4. balance()");
                System.out.print("\n");
                System.out.print("5. login(int)");
                System.out.print("\n");
                System.out.print("6. logout()");
                System.out.print("\n");
                System.out.print("7. lock(int)");
                System.out.print("\n");
                System.out.print("8. unlock(int)");
                System.out.print("\n");
                System.out.print("\n");
                System.out.println("---------------------------------------------------------------------");
                ch = sc.readLine();
                switch (ch) {
                    case "0": // "open(int, int, int)"
                    {
                        try {
                            System.out.print("Operation:  open(int p,int y,int a)");
                            System.out.print("\n");
                            System.out.print("Enter value of the parameter p (pin):");
                            System.out.print("\n");
                            int p = Integer.parseInt(sc.readLine());
                            System.out.print("Enter value of the parameter y (user's Identification number):");
                            System.out.print("\n");
                            int y = Integer.parseInt(sc.readLine());
                            System.out.print("Enter value of the parameter a (balance):");
                            System.out.print("\n");
                            int a = Integer.parseInt(sc.readLine());
                            gp1.open(p, y, a);

                        } catch (InputMismatchException e) {
                            System.out.println("Invalid Input - Please Select Again ");
                        } catch (IOException e) {
                            System.out.println("Input IO error");
                        } catch (NumberFormatException e) {
                            System.out.println("Number should be proper");
                        }
                        break;
                    }

                    case "1": // Pin(int)
                    {
                        try{
                            System.out.print("Operation:  pin(int x)");
                            System.out.print("\n");
                            System.out.print("Enter value of the parameter x (pin):");
                            System.out.print("\n");
                            int x = Integer.parseInt(sc.readLine());
                            gp1.pin(x);
                        }catch (InputMismatchException e) {
                            System.out.println("Invalid Input - Please Select Again ");
                        } catch (IOException e) {
                            System.out.println("Input IO error");
                        } catch (NumberFormatException e) {
                            System.out.println("Number should be proper");
                        }
                        break;
                    }

                    case "2": { // deposit(int)
                        try {
                            System.out.print("Operation:  deposit(int d)");
                            System.out.print("\n");
                            System.out.print("Enter value of the parameter d (deposit amount):");
                            System.out.print("\n");
                            int d = Integer.parseInt(sc.readLine());
                            gp1.deposit(d);

                        } catch (InputMismatchException e) {
                            System.out.println("Invalid Input - Please Select Again ");
                        } catch (IOException e) {
                            System.out.println("Input IO error");
                        } catch (NumberFormatException e) {
                            System.out.println("Number should be in proper");
                        }
                        break;
                    }

                    case "3": { // withdraw(int)
                        try {
                            System.out.print("Operation:  withdraw(int w)");
                            System.out.print("\n");
                            System.out.print("Enter value of the parameter w (withdraw amount):");
                            System.out.print("\n");
                            int w = Integer.parseInt(sc.readLine());
                            gp1.withdraw(w);

                        } catch (InputMismatchException e) {
                            System.out.println("Invalid Input - Please Select Again ");
                        } catch (IOException e) {
                            System.out.println("Input IO error");
                        } catch (NumberFormatException e) {
                            System.out.println("Number should be in proper");
                        }
                        break;
                    }

                    case "4": { // balance()
                        System.out.print("Operation:  balance()");
                        System.out.print("\n");
                        gp1.balance();
                        break;
                    }

                    case "5": { // login(int)
                        try {
                            System.out.print("Operation:  login(int y)");
                            System.out.print("\n");
                            System.out.print("Enter value of the parameter y (user's Identification number):");
                            System.out.print("\n");
                            int y = Integer.parseInt(sc.readLine());
                            gp1.login(y);

                        } catch (InputMismatchException e) {
                            System.out.println("Invalid Input - Please Select Again ");
                        } catch (IOException e) {
                            System.out.println("Input IO error");
                        } catch (NumberFormatException e) {
                            System.out.println("Number should be in proper");
                        }
                        break;
                    }

                    case "6": // logout
                    {
                        System.out.print("Operation:  logout()");
                        System.out.print("\n");
                        gp1.logout();
                        break;
                    }

                    case "7": { // lock(int)
                        try {
                            System.out.print("Operation:  lock(int x)");
                            System.out.print("\n");
                            System.out.print("Enter value of the parameter x (pin):");
                            System.out.print("\n");
                            int x = Integer.parseInt(sc.readLine());
                            gp1.lock(x);

                        } catch (InputMismatchException e) {
                            System.out.println("Invalid Input - Please Select Again ");
                        } catch (IOException e) {
                            System.out.println("Input IO error");
                        } catch (NumberFormatException e) {
                            System.out.println("Number should be proper");
                        }
                        break;
                    }

                    case "8":// unlock
                    {
                        try {
                            System.out.print("Operation:  unlock(int x)");
                            System.out.print("\n");
                            System.out.print("Enter value of the parameter x (pin):");
                            System.out.print("\n");
                            int x = Integer.parseInt(sc.readLine());
                            gp1.unlock(x);

                        } catch (InputMismatchException e) {
                            System.out.println("Invalid Input - Please Select Again ");
                        } catch (IOException e) {
                            System.out.println("Input IO error");
                        } catch (NumberFormatException e) {
                            System.out.println("Number should be proper");
                        }
                        break;
                    }

                    case "q": { // EXIT
                        System.out.print("Operation:  Exit");
                        System.out.print("\n");
                        System.exit(0);
                        break;
                    }
                    default: {
                        System.out.println("Wrong Choice");
                        break;
                    }
                }
                ; // endswitch

            }
            ; // endwhile
        } catch (NumberFormatException e) {
            System.out.println("Number should be in proper");
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch");

        } catch (IOException e) {
            System.out.println("Input IO error");
        }

    }

    /**
     * Perform Account2 Operations
     */
    public static void Account2() {

        ConcreteFactory2 concreteFactory2 = new ConcreteFactory2();
        Account2 gp2 = new Account2(concreteFactory2);
        System.out.println("---------------------------------------------------------------------");

        System.out.print("Account-2");
        System.out.print("\n");

        String ch = "1";
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (ch != "q") {
                System.out.println("---------------------------------------------------------------------");
                System.out.print("Select Operation: ");
                System.out.print("\n");
                System.out.print("MENU of Operations");
                System.out.print("\n");
                System.out.print("0. open(int,int,float)");
                System.out.print("\n");
                System.out.print("1. pin(int)");
                System.out.print("\n");
                System.out.print("2. deposit(float)");
                System.out.print("\n");
                System.out.print("3. withdraw(float)");
                System.out.print("\n");
                System.out.print("4. balance()");
                System.out.print("\n");
                System.out.print("5. login(int)");
                System.out.print("\n");
                System.out.print("6. logout()");
                System.out.print("\n");
                System.out.print("7. suspend()");
                System.out.print("\n");
                System.out.print("8. activate()");
                System.out.print("\n");
                System.out.print("9. close()");
                System.out.print("\n");
                System.out.println("---------------------------------------------------------------------");
                ch = sc.readLine();
                switch (ch) {
                    case "0": { // open(int p, int y, float a)

                        try {
                            System.out.print("Operation:  Activate(int p, int y, float a)");
                            System.out.print("\n");
                            System.out.print("Enter value of the parameter p:");
                            System.out.print("\n");
                            int p = Integer.parseInt(sc.readLine());
                            System.out.print("\n");
                            System.out.print("Enter value of the parameter y:");
                            System.out.print("\n");
                            int y = Integer.parseInt(sc.readLine());
                            System.out.print("\n");
                            System.out.print("Enter value of the parameter a:");
                            System.out.print("\n");
                            float a = Float.parseFloat(sc.readLine());

                            gp2.open(p, y, a);
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid Input - Please Select Again ");
                        } catch (IOException e) {
                            e.printStackTrace();
                            System.out.println("Input IO error");
                        } catch (NumberFormatException e) {
                            System.out.println("Number should be in proper");
                        }
                    }

                    case "1": // Pin(int)
                    {
                        try{
                            System.out.print("Operation:  pin(int x)");
                            System.out.print("\n");
                            System.out.print("Enter value of the parameter x (pin):");
                            System.out.print("\n");
                            int x = Integer.parseInt(sc.readLine());
                            gp2.pin(x);
                        }catch (InputMismatchException e) {
                            System.out.println("Invalid Input - Please Select Again ");
                        } catch (IOException e) {
                            System.out.println("Input IO error");
                        } catch (NumberFormatException e) {
                            System.out.println("Number should be proper");
                        }
                        break;
                    }

                    case "2": { // deposit(float)
                        try {
                            System.out.print("Operation:  deposit(float d)");
                            System.out.print("\n");
                            System.out.print("Enter value of the parameter d (deposit amount):");
                            System.out.print("\n");
                            float d = Float.parseFloat(sc.readLine());
                            gp2.deposit(d);

                        } catch (InputMismatchException e) {
                            System.out.println("Invalid Input - Please Select Again ");
                        } catch (IOException e) {
                            System.out.println("Input IO error");
                        } catch (NumberFormatException e) {
                            System.out.println("Number should be in proper");
                        }
                        break;
                    }

                    case "3": { // withdraw(float)
                        try {
                            System.out.print("Operation:  withdraw(float w)");
                            System.out.print("\n");
                            System.out.print("Enter value of the parameter w (withdraw amount):");
                            System.out.print("\n");
                            float w = Float.parseFloat(sc.readLine());
                            gp2.withdraw(w);

                        } catch (InputMismatchException e) {
                            System.out.println("Invalid Input - Please Select Again ");
                        } catch (IOException e) {
                            System.out.println("Input IO error");
                        } catch (NumberFormatException e) {
                            System.out.println("Number should be in proper");
                        }
                        break;
                    }

                    case "4": { // balance()
                        System.out.print("Operation:  balance()");
                        System.out.print("\n");
                        gp2.balance();
                        break;
                    }

                    case "5": { // login(int)
                        try {
                            System.out.print("Operation:  login(int y)");
                            System.out.print("\n");
                            System.out.print("Enter value of the parameter y (user's Identification number):");
                            System.out.print("\n");
                            int y = Integer.parseInt(sc.readLine());
                            gp2.login(y);

                        } catch (InputMismatchException e) {
                            System.out.println("Invalid Input - Please Select Again ");
                        } catch (IOException e) {
                            System.out.println("Input IO error");
                        } catch (NumberFormatException e) {
                            System.out.println("Number should be in proper");
                        }
                        break;
                    }

                    case "6": // logout
                    {
                        System.out.print("Operation:  logout()");
                        System.out.print("\n");
                        gp2.logout();
                        break;
                    }

                    case "7": { // suspend
                        System.out.print("Operation:  Suspend()");
                        System.out.print("\n");
                        gp2.suspend();
                        break;
                    }

                    case "8": { // activate
                        System.out.print("Operation:  Activate()");
                        System.out.print("\n");
                        gp2.activate();
                        break;
                    }

                    case "9": { // close
                        System.out.print("Operation:  Close()");
                        System.out.print("\n");
                        gp2.close();
                        break;
                    }

                    case "q": { // quit
                        System.out.print("Operation:  Exit()");
                        System.out.print("\n");
                        System.exit(0);
                        break;
                    }
                    default: {
                        System.out.println("Wrong Choice");
                        break;
                    }
                }
                ; // endswitch
            }
            ; // endwhile

        } catch (NumberFormatException e) {
            System.out.println("Number should be in proper");
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch");
            System.exit(1);
        } catch (IOException e) {
            System.out.println("Input IO error");
            System.exit(1);
        }
    }
}
