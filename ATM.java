import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class ATM
{
    static Scanner scanner = new Scanner(System.in);
    double BankBalance;
    String currentDate; 
    String currentTime;
    String account;

    public static void main(String[] args){
        int ch;
        ATM ob = new ATM();
        ob.GetData();
        while(true){
            System.out.println("---------------------------------------");
            System.out.println("              SBI ATM Menu             ");
            System.out.println("---------------------------------------");
            System.out.println("Please select a transaction:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("---------------------------------------");
            System.out.print("Enter your Choice: ");
            ch = scanner.nextInt();
            System.out.println("---------------------------------------");

            switch (ch){
                case 1:
                    System.out.println("");
                    System.out.print("Please enter the amount to be withdrawn: Rs.");
                    double WithdrawAmount = scanner.nextInt();
                    System.out.println("");
                    ob.withdraw(WithdrawAmount);
                    break;
                    
                case 2:
                    System.out.println("");
                    System.out.print("Please enter the amount to be deposited: Rs.");
                    double DepositAmount = scanner.nextInt();
                    System.out.println("");
                    ob.deposit(DepositAmount);
                    break;

                case 3:
                    ob.CheckBalance();
                    break;
                    
                case 4:
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("---------------------------------------");
                    System.out.println("                 SBI ATM               ");
                    System.out.println("---------------------------------------");
                    System.out.println("Invalid Input, Please Try Again!");
                    System.out.println("---------------------------------------");
                    break;
            }
        }
        
    }

    public void withdraw(double amount){
        if(this.BankBalance >= amount){
            this.BankBalance = this.BankBalance - amount;
            System.out.println("---------------------------------------");
            System.out.println("            SBI ATM Receipt            ");
            System.out.println("---------------------------------------");
            System.out.println("Date       : " + currentDate);
            System.out.println("Time       : " + currentTime);
            System.out.println("Account No.: " + account);
            System.out.println("Transaction: Withdrawal");
            System.out.println("Amount     : Rs." + amount);
            System.out.println("---------------------------------------");
            System.out.println("Remaining Balance: Rs." + this.BankBalance);
            System.out.println("---------------------------------------");
            System.out.println("      Thank you for using SBI Bank     ");
            System.out.println("---------------------------------------");
        }else{
            System.out.println("Insuficiant Balance!");
        }
    }

    public void deposit(double amount){
        this.BankBalance = this.BankBalance + amount;
        System.out.println("---------------------------------------");
        System.out.println("            SBI ATM Receipt            ");
        System.out.println("---------------------------------------");
        System.out.println("Date       : " + currentDate);
        System.out.println("Time       : " + currentTime);
        System.out.println("Account No.: " + account);
        System.out.println("Transaction: Deposit");
        System.out.println("Amount     : Rs." + amount);
        System.out.println("---------------------------------------");
        System.out.println("New Balance: Rs." + this.BankBalance);
        System.out.println("---------------------------------------");
        System.out.println("      Thank you for using SBI Bank     ");
        System.out.println("---------------------------------------");
    }

    public void CheckBalance(){
        System.out.println("---------------------------------------");
        System.out.println("            SBI ATM Receipt            ");
        System.out.println("---------------------------------------");
        System.out.println("Date       : " + currentDate);
        System.out.println("Time       : " + currentTime);
        System.out.println("Account No.: " + account);
        System.out.println("Transaction: Balance Check");
        System.out.println("---------------------------------------");
        System.out.println("Current Balance: Rs." + this.BankBalance);
        System.out.println("---------------------------------------");
        System.out.println("      Thank you for using SBI Bank     ");
        System.out.println("---------------------------------------");
    }

    public void GetData(){
        System.out.println("---------------------------------------");
        System.out.println("        Welcome to SBI Bank ATM        ");
        System.out.println("---------------------------------------");
        System.out.print("Account No: ");
        this.account = scanner.nextLine();
        System.out.println("---------------------------------------");
        System.out.println("");
        System.out.println("");
        LocalDateTime now = LocalDateTime.now();

        // Define the date and time formats
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Format the current date and time separately
        this.currentDate = now.format(dateFormatter);
        this.currentTime = now.format(timeFormatter);
    }
}
