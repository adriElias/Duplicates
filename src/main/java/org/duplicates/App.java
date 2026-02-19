package org.duplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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

        System.out.println("\n --- Months with August--- \n");
        months.add(7, new Month("August"));

        System.out.println(months);

        System.out.println("\n --- Months with HashSet --- \n");

        Set<Month> monthSet = new HashSet<>(months);
        System.out.println(monthSet);

        boolean added = monthSet.add(new Month("August"));
        System.out.println("\nWas it possible to add a duplicate of August?: " + added);

        System.out.println("HashSet size: " + monthSet.size());

        System.out.println("\n -- For-each without MonthSet -- \n");
        for (Month m : months) {
            System.out.println(m);
        }

        System.out.println("\n -- For-each with MonthSet -- \n");
        for (Month m : monthSet) {
            System.out.println(m);
        }

        System.out.println("\n-- Iterator without MonthSet-- \n");
        Iterator<Month> iterator = months.iterator();
        while (iterator.hasNext()) {
            Month m = iterator.next();
            System.out.println(m);
        }

        System.out.println("\n-- Iterator with MonthSet-- \n");
        Iterator<Month> iteratorSet = monthSet.iterator();
        while (iteratorSet.hasNext()) {
            Month m = iteratorSet.next();
            System.out.println(m);
        }
    }
}
