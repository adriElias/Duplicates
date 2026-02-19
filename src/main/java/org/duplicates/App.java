package org.duplicates;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Month> months = new ArrayList<>();
        System.out.println("--- Months without August--- \n");
        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        //August
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));

        System.out.println(months);

    }
}
