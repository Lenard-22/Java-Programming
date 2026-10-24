/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week.pkg5;


class Student {
    String name;
    int[] quizzes;
    double average;

    public Student(String name, int[] quizzes) {
        this.name = name;
        this.quizzes = quizzes;
        this.average = calculateAverage();
    }

    private double calculateAverage() {
        int sum = 0;
        for (int score : quizzes) {
            sum += score;
        }
        return (double) sum / quizzes.length;
    }
}


public class Expert {
    
   
    public static void main(String[] args) {
        String[] names = {"Aurora", "TLPH", "ONIC", "Falcon", "Omega"};
        
        int[][] rawQuizData = {
            {85, 90, 88, 92}, 
            {95, 96, 92, 98}, 
            {85, 90, 88, 92}, 
            {70, 75, 78, 72}, 
            {91, 92, 89, 94}  
        };

        Student[] students = new Student[names.length];
        for (int i = 0; i < names.length; i++) {
            students[i] = new Student(names[i], rawQuizData[i]);
        }

      
        for (int i = 0; i < students.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < students.length; j++) {
                if (students[j].average > students[maxIndex].average) {
                    maxIndex = j;
                }
            }
            Student temp = students[maxIndex];
            students[maxIndex] = students[i];
            students[i] = temp;
        }

        System.out.println("    OFFICIAL LEADERBOARD");
        int currentRank = 1;
        
        for (int i = 0; i < students.length; i++) {
            if (i > 0 && students[i].average < students[i - 1].average) {
                currentRank = i + 1; 
            }
            System.out.printf("Rank %d: %-8s | Avg: %.2f\n", currentRank, students[i].name, students[i].average);
        }

        System.out.println("\nSearch Result");

        String Team = "ONIC";
        int searchRank = findStudentRank(students, Team);
        System.out.println(" Result: " + Team + " holds Rank " + searchRank);
    }

    public static int findStudentRank(Student[] sortedStudents, String targetName) {
        int rank = 1;
        for (int i = 0; i < sortedStudents.length; i++) {
            if (i > 0 && sortedStudents[i].average < sortedStudents[i - 1].average) {
                rank = i + 1;
            }
            
            if (sortedStudents[i].name.equals(targetName)) {
                return rank;
            }
        }
        return -1; 
    }
}