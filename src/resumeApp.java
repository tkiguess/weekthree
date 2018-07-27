import java.util.ArrayList;
import java.util.Scanner;

public class resumeApp {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Education e = new Education();


        String finish = "", naim = "", email = "",
                edumacation = "", degree = "", major = "", university = "", graduation = "", additup = "",
                job = "", jobtitle = "", company = "", startdate = "", enddate = "", jobdescription = "", jobd = "", jobdud = "", adjob = "", iffy = "",
                skills = "", skillset = "", skill = "";
        int i = 1, j = 0;


        System.out.println("Welcome to Krusty Krab inc, I need to access your resume, lets get started.");

       System.out.println("What is your name?");
        naim = keyboard.next();

        System.out.println("Email Address?");
        email = keyboard.next();

        System.out.println("so now we will be moving on to your education background.");

        while (!edumacation.equalsIgnoreCase("d")) {
            System.out.println("Enter type of degree you have.");
            degree = keyboard.next();
            e.setDegree(degree);

            System.out.println("Enter major");
            major = keyboard.next();
            e.setMajor(major);

            System.out.println("What University did you attend?");
            university = keyboard.next();
            e.setUniversity(university);

            System.out.println("what year did you graduate?");
            graduation = keyboard.next();
            e.setGraduation(graduation);


            System.out.println("add another? yes to continue, or d to move on.");
            edumacation = keyboard.next();


            additup = additup + degree + " in " + major + "\n" + university + ", " + graduation + "\n" + "\n";

        }

        System.out.println("got it now we will be moving into your work experience.");

        while (j < 4) {
            System.out.println("enter a job title. ");
            jobtitle = keyboard.next();

            System.out.println("what company did you work for? ");
            company = keyboard.next();

            System.out.println("Start Date");
            startdate = keyboard.next();

            System.out.println("End date");
            enddate = keyboard.next();

            while (i < 2) {
                System.out.println("enter a job description.");
                jobdescription = keyboard.next();
                System.out.println("Add another one? if not press d");
                jobdud = keyboard.next();
                if (jobdud.contains("d")) {
                    i = 4;
                    continue;
                }
                jobd = jobd + "Duty: " + jobdescription + "\n";
            }

            System.out.println("Add another job? yes to continue, d for done.");
            job = keyboard.next();
            adjob = adjob + jobtitle + "\n" + company + "; " + startdate + " - " + enddate + "\n" + jobdescription + "\n";

            if (job.contains("d")) {
                j = 10;
                i = 10;
            }

        }


       /System.out.println("Now lets get to the skills that you have.");

        while (!skillset.contains("d")) {
            System.out.println("enter a skill.");
            skills = keyboard.next();
            System.out.println("add another? if not, press d");
            skillset = keyboard.next();
            skill = skill+ skills + "\n";
        }


        //============================================================================//


        System.out.println("===========================================");
        System.out.println("Name = " + naim);
        System.out.println("email = " + email + "\n");

        System.out.println("Education");
        System.out.println(additup + "\n");

        System.out.println("Experiece");
        System.out.println(adjob + "\n");

        System.out.println("Skills");
        System.out.println(skill);


    }

}
