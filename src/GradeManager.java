import java.util.ArrayList;
import java.util.Collections;

public class GradeManager {
    private ArrayList<Integer> grades;

    public GradeManager() {
        grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100.");
        }
        grades.add(grade);
        System.out.println("Grade added: " + grade);
    }

    public void sortGrades() {
        Collections.sort(grades);
        System.out.println("Grades sorted: " + grades);
    }

    public double calculateAverage() {
        if (grades.isEmpty()) {
            throw new IllegalStateException("No grades available to calculate average.");
        }
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double avg = sum / grades.size();
        System.out.println("Average grade: " + avg);
        return avg;
    }

    public int getHighestGrade() {
        if (grades.isEmpty()) {
            throw new IllegalStateException("No grades available.");
        }
        int max = Collections.max(grades);
        System.out.println("Highest grade: " + max);
        return max;
    }

    public int getLowestGrade() {
        if (grades.isEmpty()) {
            throw new IllegalStateException("No grades available.");
        }
        int min = Collections.min(grades);
        System.out.println("Lowest grade: " + min);
        return min;
    }

    public boolean searchGrade(int grade) {
        boolean found = grades.contains(grade);
        System.out.println("Grade " + grade + (found ? " found." : " not found."));
        return found;
    }

    public int getGradeAtIndex(int index) {
        try {
            int grade = grades.get(index);
            System.out.println("Grade at index " + index + ": " + grade);
            return grade;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        } finally {
            System.out.println("Checked Index: " + index);

        }
    }
}
