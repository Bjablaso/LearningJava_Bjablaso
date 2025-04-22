package travelaround.Project.AmazingBank;

import java.util.Scanner;

public class KnowledgeCheck1 {
 public static void main(String[] args) {
     //TODO : wRITE A PROGRAM THAT Ask the user about several financial inputs and print out the answer formated
     Scanner scanner = new Scanner(System.in);
     System.out.println("Please enter your account Username : ");
    String  username = scanner.nextLine();

    System.out.println("Please enter your account Password : ");
    String password = scanner.nextLine();

    String bankName = "First Bank of Wiki\n";
    String bankAddress = "1425 JAMES ST, PO BOX 4000 ";
    String bankNumber = "\"VICTORIA BC  V8X 3X4 \" 1‑800‑555‑5555";

    String statementHeader ="CHEQUING ACCOUNT STATEMENT\n";

    int pageNumber = 1;
    int outof = 1;

    String page =  String.valueOf(1) + " of " + String.valueOf(outof);

     StringBuilder bankSataementHeader = new StringBuilder();

     bankSataementHeader.append(String.format("%-15s %-20s  %100S %-5s %87s  ", bankName, bankAddress,statementHeader,
             bankNumber,page ));

  System.out.println(bankSataementHeader.toString());



 }
}
