package BookMyShow;

import aggregation_college_student.College;

import java.util.Scanner;

//public class BookMyShowDriver {
    public  static void main(String[] args)
        Scanner s = new Scanner(System.in);
        BookMyShow c = new BookMyShow("moodbidri",100,2);
        boolean exit=true;
        while(true) {
            System.out.println("\n1.Admission of student\n2.Student details\n3.College Deatils\n4.Remove a student\n5.Exit\nEnter your choice:");
            int ch =s.nextInt();
            switch(ch)
            {
                case 1:
                    c.addStudent();
                    break;
                case 2:
                    c.studentDetails();
                    break;
                case 3:
                    c.collegeDetails();
                    break;
                case 4:
                    c.removeStudent();
                    break;
                case 5:
                    System.exit(0);
            }

        }
    }
}
