package com.company;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer("Lexmark", 50, false);
        System.out.println(printer.getName());
        System.out.println("Toner level " + printer.getTonerLevel());

        printer.fillUpToner(30);
//        printer.fillUpToner(30);
        System.out.println("Printed pages " + printer.getNumberOfPagesPrinted());
        int pagess = printer.printedPages(100);
        System.out.println("Pages printed was= " + pagess + " and total is= " + printer.getNumberOfPagesPrinted());



    }
}
