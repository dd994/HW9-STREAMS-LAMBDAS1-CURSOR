package main.java.funcinterface;

public class Test {
    public static void main(String[] args) {

        Swearing swearing = word -> word.equalsIgnoreCase("Fuck")||word.equalsIgnoreCase("Shit")||word.equalsIgnoreCase("Bitch");

        System.out.println(swearing.isSwearing("fuckel"));


    }
}
