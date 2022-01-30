import java.util.Scanner;

import javax.swing.JOptionPane;

public class IO {
    public static int getInt(String prompt){
        int input;
        String in = JOptionPane.showInputDialog(prompt);
        input = Integer.parseInt(in);
        return input;
    }

    public static int getInt(){
        int input;
        String in = JOptionPane.showInputDialog("Please enter an integer");
        input = Integer.parseInt(in);
        return input;
    }

    public static double getDouble(String prompt){
        double input;
        String in = JOptionPane.showInputDialog(prompt);
        input = Double.parseDouble(in);
        return input;
    }

    public static double getDouble(){
        double input;
        String in = JOptionPane.showInputDialog("Please enter a Double");
        input = Double.parseDouble(in);
        return input;
    }

    public static boolean getBoolean(String prompt){
        int input;
        Object[] options = { "true", "false" };
        input = JOptionPane.showOptionDialog(null, prompt, "IO.getBoolean",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, options, options[0]);
        if( input == 0)
            return true;
        else
            return false;
    }

    public static boolean getBoolean(){
        int input;
        Object[] options = { "true", "false" };
        input = JOptionPane.showOptionDialog(null, "Please choose a boolean value", "IO.getBoolean",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, options, options[0]);
        if( input == 0)
            return true;
        else
            return false;
    }

    public static String getString(String prompt){
        String input = JOptionPane.showInputDialog(prompt);
        return input;
    }

    public static String getString(){
        String input = JOptionPane.showInputDialog("Please enter a String");
        return input;
    }

    public static int getConsoleInt(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter an Integer:");
        int input = scan.nextInt();
        return input;
    }

    public static int getConsoleInt(String prompt){
        Scanner scan = new Scanner(System.in);
        System.out.print(prompt + ":");
        int input = scan.nextInt();
        return input;
    }


    public static double getConsoleDouble(String prompt){
        Scanner scan = new Scanner(System.in);
        System.out.print(prompt + ":");
        double input = scan.nextDouble();
        return input;
    }

    public static double getConsoleDouble(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a Double:");
        double input = scan.nextDouble();
        return input;
    }

    public static boolean getConsoleBoolean(String prompt){
        Scanner scan = new Scanner(System.in);
        System.out.print(prompt + ":");
        boolean input = scan.nextBoolean();
        return input;
    }

    public static boolean getConsoleBoolean(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a Boolean:");
        boolean input = scan.nextBoolean();
        return input;
    }

    public static String getConsoleString(String prompt){
        Scanner scan = new Scanner(System.in);
        System.out.print(prompt + ":");
        String input = scan.next();
        return input;
    }

    public static String getConsoleString(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a String:");
        String input = scan.next();
        return input;
    }
}
