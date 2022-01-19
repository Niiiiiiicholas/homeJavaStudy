package ru.newStudy.homeJava.Stream.Lesson1;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main
{
    private static String staffFile = "staff.txt";
    private static String dateFormat = "dd.MM.yyyy";

    public static void main(String[] args)
    {
        ArrayList<Employee> staff = loadStaffFromFile();
        Employee employee = staff.stream().sorted(Comparator.comparing(Employee::getSalary))
                .sorted(Comparator.comparing(Employee::getName))
                .filter(s->s.getWorkStart().getYear()+1900 == 2017).max((s1,s2)->s1.getSalary().compareTo(s2.getSalary())).get();
        System.out.println(employee);
    }

    private static ArrayList<Employee> loadStaffFromFile()
    {
        ArrayList<Employee> staff = new ArrayList<>();
        try
        {
            List<String> lines = Files.readAllLines(Paths.get(staffFile));
            for(String line : lines)
            {
                String[] fragments = line.split("\t");
                if(fragments.length != 3) {
                    System.out.println("Wrong line: " + line);
                    continue;
                }
                staff.add(new Employee(
                        fragments[0],
                        Integer.parseInt(fragments[1]),
                        (new SimpleDateFormat(dateFormat)).parse(fragments[2])
                ));
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return staff;
    }
}