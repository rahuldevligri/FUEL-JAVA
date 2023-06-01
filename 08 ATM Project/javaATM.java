import java.util.Scanner;
class ATM{
    int atm_balance=15000;
    int[] Card_Num ={12345,23456,34567,45678,56789,67890,78901,89012,90123,01234};
    String[] Acc_Name={"Rahul","Ankit","Harshit","Umesh","Lokesh","Rohit","Omkar","Hitesh","Ishant","Tushar"};
    int[] PIN={123,234,345,456,567,678,789,890,901,012};
    int[] Acc_Balance={5000,7000,9000,11000,13000,15000,17000,19000,20000};
    int location;

    public void bank(){
        System.out.println("Choice Bank: ");
        System.out.println("1. SBI Bank ");
        System.out.println("2. Paytm Bank");
        Scanner sc = new Scanner(System.in);
        int bn=sc.nextInt();
        if(bn==1){
            System.out.println("Welcome to SBI Bank...");
            System.out.println("***************");
            check_Card_Num();
        }
        else if(bn==2){
            System.out.println("Welcome to Paytm Payments Bank...");
            System.out.println("***************");
            check_Card_Num();
        }
        else{
            System.out.println("Invalid choice...");
            bank();
        }
        sc.close();
    }

    public void check_Card_Num(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Card Number: ");
        int cn=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<Card_Num.length;i++){
            if(cn==Card_Num[i]){
                flag=true;
                enter_pin(location=i);
                break;
            }
            else{
                System.out.println("Card Number isn't Valid...");
                System.out.println("*******************");
                System.out.println("Choice...");
                System.out.println("Press 1 to Enter Card Number again...");
                System.out.println("Press any key to Exit...");
                int num=sc.nextInt();
                if(num==1){
                    check_Card_Num();
                }
            }
        }
        if(flag=false){
            System.out.println("Card Number isn't Valid...");
            System.out.println("*******************");
                System.out.println("Choice...");
                System.out.println("Press 1 to Enter Card Number again...");
                System.out.println("Press any key to Exit...");
                int num=sc.nextInt();
                if(num==1){
                    check_Card_Num();
                }
        }
        sc.close();
    }
    
    public void enter_pin(int location){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Card Pin: ");
        int cp=sc.nextInt();
        if(cp==PIN[location])
            menu();
        else{
            System.out.println("Invaild Pin..Try again...");
            System.out.println("*******************");
            System.out.println("Choice...");
            System.out.println("Press 1 to Enter Your Card PIN again...");
            System.out.println("Press any key to Exit...");
            int num=sc.nextInt();
            if(num==1){
                enter_pin(location);
            }
        }
        sc.close();
    }

    public void menu(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Choice");
        System.out.println("1. Cash Withdraw: ");
        System.out.println("2. Cash Deposite: ");
        System.out.println("3. Check Balance: ");
        System.out.println("4. Exit: ");
        int choice=sc.nextInt();
        if(choice==1)
            cash_Withdraw(location);
        else if(choice==2)
            cash_Deposite(location);
        
        else if(choice==3)
            check_Balance(location);
        
        else if(choice<1 && choice>4){
            System.out.println("Enter valid choice...");
            menu();
        }
        else
            return;
            
        sc.close();
    }
    
    public void cash_Withdraw(int location){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount: ");
        int amt=sc.nextInt();
        if(amt>atm_balance){
            System.out.println("Insufficient Balance in ATM Machine...");
            System.out.println("*******************");
            System.out.println("Choice...");
            System.out.println("Press 1 to Enter Amount again... ");
            System.out.println("Enter 2 to go back in Menu... ");
            System.out.println("Press any key to Exit...");
            int num=sc.nextInt();
            if(num==1)
                cash_Withdraw(location);
            else if(num==2)
                menu();
        }
        else if(Acc_Balance[location]>=amt){
            System.out.println("Money has been withdrawal successfully...");
            System.out.println("Collect Your Money= "+amt);
            Acc_Balance[location]-=amt;
            atm_balance-=amt;
            System.out.println("*******************");
            System.out.println("Choice...");
            System.out.println("Press 1 to Check Balance... ");
            System.out.println("Press 2 to go back in Menu... ");
            System.out.println("Press any key to Exit...");
            int num=sc.nextInt();
            if(num==1)
                check_Balance(location);
            
            else if(num==2)
                menu();
            
        }
        else{
            System.out.println("Insufficient Balance in your Bank Account...");
            System.out.println("*******************");
            System.out.println("Choose.....");
            System.out.println("Press 1 to Check Balance: ");
            System.out.println("Press 2 to go back in Menu: ");
            System.out.println("Press Any key to Exit...");
            int ch=sc.nextInt();
            if(ch==1)
                check_Balance(location);
            
            else if(ch==2)
                menu();
            
        }
        sc.close();
    }

    public void cash_Deposite(int location){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Amount.... ");
        int amt=sc.nextInt();
        Acc_Balance[location]+=amt;
        System.out.println("Amount "+amt+" added successfully in your account..");
        System.out.println("*******************");
        System.out.println("Choice...");
        System.out.println("Press 1 to go back in Menu... ");
        System.out.println("Press any key to Exit...");
        int num=sc.nextInt();
        if(num==1)
            menu();
        
        sc.close();
    }

    public void check_Balance(int location){
        System.out.println("Your Account Balance is "+Acc_Balance[location]);
        System.out.println("*******************");
        System.out.println("Choice...");
        System.out.println("Press 1 to go back in Menu... ");
        System.out.println("Press any key to Exit...");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num==1)
            menu();
    }
}
class javaATM{
    public static void main(String[] args){
        ATM atm = new ATM();
        atm.bank();
    }
}