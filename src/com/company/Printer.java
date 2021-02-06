package com.company;

public class Printer {
    private String name;
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplex;

    public Printer(String name, int tonerLevel, boolean isDuplex) {
        this.name = name;
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }else {
            this.tonerLevel = -1;
        }
        this.isDuplex = isDuplex;
        this.numberOfPagesPrinted = 0;
    }

    public int printedPages(int pages) {
        int addedPages = pages;
        this.numberOfPagesPrinted += pages;
        return (addedPages);

    }

    public void fillUpToner(int feelUp) {
        if ((this.tonerLevel + feelUp) > 100) {
            this.tonerLevel = 100;
            System.out.println("Toner level is full!!!");
            System.out.println("Toner level is: " + this.tonerLevel);
        } else {
            this.tonerLevel = this.tonerLevel + feelUp;
            System.out.println("Toner level is: " + this.tonerLevel);
        }

    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public String getName() {
        return name;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }


    public boolean isDuplex() {
        return isDuplex;
    }
}
