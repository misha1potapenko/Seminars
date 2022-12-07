//Реализуйте структуру телефонной книги с помощью HashMap,
//        учитывая, что один человек может иметь несколько телефонов.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<String, List<Long>> telephonBook = new HashMap<>();
        add(telephonBook);

    }
    public static HashMap<String, List<Long>> add(HashMap<String, List<Long>> telephoneBook){
        HashMap<String, List<Long>> telephonBook = new HashMap<>();
        List<Long> numbers = new ArrayList<>();
        System.out.print("Write your last name: ");
        Scanner forLastName = new Scanner(System.in);
        String lastName = forLastName.nextLine();
        System.out.print("Write your first number: ");
        Scanner forFirstNumber = new Scanner(System.in);
        Long firstNumber = forFirstNumber.nextLong();
        numbers.add(firstNumber);

        System.out.print("Do you have another number? (Write yes or no): ");
        Scanner addSecondNumber = new Scanner(System.in);
        String isSecondNumber = addSecondNumber.nextLine();

        while (isSecondNumber.equals("yes")){
            System.out.print("Write your another number: ");
            Scanner forSecondNumber = new Scanner(System.in);
            Long secondNumber = forSecondNumber.nextLong();
            numbers.add(secondNumber);
            System.out.print("Do you have another number? (Write yes or no): ");
            Scanner addAnotherNumber = new Scanner(System.in);
            isSecondNumber = addSecondNumber.nextLine();
        }
        if (isSecondNumber.equals("no")) {
            System.out.println("Good");

        } else System.out.println("You have written the wrong format");
        telephonBook.put(lastName,numbers);
        System.out.println(telephonBook);
        try(FileWriter writer = new FileWriter("phoneBook.txt", true))
        {
            // запись всей строки
            writer.write(String.valueOf(telephonBook));
           //запись по символам
            writer.append('\n');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        return telephonBook;



    }

}