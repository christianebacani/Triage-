import java.util.Scanner;
public class TriageAdmittingBoothSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Welcome to Triage!\n");
        System.out.print("Press enter to start : ");
        String pressEnter = input.nextLine();
        
        System.out.print("Enter the First Name of the patient : ");
        String firstName = input.nextLine();
        
        System.out.print("Enter the Midle Name of the patient : ");
        String middleName = input.nextLine();
        
        System.out.print("Enter the Surname of the patient : ");
        String surName = input.nextLine();
        
        System.out.print("Enter the First Name of the Guardian : ");
        String firstNameGuardian = input.nextLine();
        
        System.out.print("Enter the Middle Name of the Guardian : ");
        String middleNameGuardian = input.nextLine();
        
        System.out.print("Enter the Surname of the Guardian : ");
        String surNameGuardian = input.nextLine();
        
        System.out.print("Please enter here the medical condition of the patient : ");
        String medCondition = input.nextLine();
        
        System.out.print("Enter the past medical condtion/s of the patient : ");
        String pastMedCondition = input.nextLine();
        
        System.out.print("\n\nPLEASE GO TO THE EMERGENCY ROOM FOR ADMITTIN PROCESS!");
        
        
    }
}
