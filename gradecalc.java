//Import Scanner class
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //Build Scanner Object
    Scanner myScanner = new Scanner(System.in);
    //Declare variables for Part 1
     int zyBooks;
     int activities;
     int projects;
     int midtermExam;
     int finalExam;
     
    //Part 1
     System.out.print("Please enter your zyBooks grade: ");
     zyBooks = myScanner.nextInt();
     while(zyBooks <= 0){
        System.out.println("That’s not a valid grade. Please try again.");
        zyBooks = myScanner.nextInt();
      }
     System.out.print("Please enter your activities grade: ");
     activities = myScanner.nextInt();
     while(activities <= 0){
        System.out.println("That’s not a valid grade. Please try again.");
        activities = myScanner.nextInt();
      }
     System.out.print("Please enter your projects grade: ");
     projects = myScanner.nextInt();
     while(projects <= 0){
        System.out.println("That’s not a valid grade. Please try again.");
        projects = myScanner.nextInt();
      }
     System.out.print("Please enter your midterm exam grade: ");
     midtermExam = myScanner.nextInt();
     while(midtermExam <= 0){
        System.out.println("That’s not a valid grade. Please try again.");
        midtermExam = myScanner.nextInt();
      }
     System.out.print("Please enter your final exam grade: ");
     finalExam = myScanner.nextInt();
     while(finalExam <= 0){
        System.out.println("That’s not a valid grade. Please try again.");
        finalExam = myScanner.nextInt();
      }
    //Declare variables for Part 2
     double weightedZyBooks;
     double weightedActivities;
     double weightedProjects;
     double weightedMidterm;
     double weightedFinal; 
    //Part 2
       weightedZyBooks = zyBooks * .10;
       weightedActivities = activities * .10;
       weightedProjects = projects * .40;
       weightedMidterm = midtermExam * .20;
       weightedFinal = finalExam * .20;
    //Declare variables for Part 3
    double grade;
    double finalGrade; 
    //Part 3
    grade = ((zyBooks/5)) + ((activities/5)) + ((projects/5)) + ((midtermExam/5)) + ((finalExam/5));
    finalGrade = ((zyBooks/100)*weightedZyBooks)+((activities/100)*weightedActivities)+((projects/100)*weightedProjects)+((midtermExam/100)*weightedMidterm)+((finalExam/100)*weightedFinal);
    System.out.println("Your final average is a(n) " + grade);
    //Declare variables for Part 4
    double letterGrade;
    //Part 4
     letterGrade = grade;
     if(letterGrade >= 89.5){
         System.out.println("You earned an A in the class");
      } else if(letterGrade >= 79.5) {
            System.out.println("You earned a B in the class");
      } else if(letterGrade >= 69.5) {
            System.out.println("You earned a C in the class");
      } else if(letterGrade >= 59.5) {
            System.out.println("You earned a D in the class");
      } else if(letterGrade >= 59.4) {
            System.out.println("Unfortunately, You earned a F in the course");
      }
       //Part 5
       if(letterGrade >= 89.5){
         System.out.println("Congratulations!");
      }
     
  }
}
