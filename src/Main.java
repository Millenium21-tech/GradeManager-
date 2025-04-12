public class Main {
    public static void main(String[] args) {
        GradeManager manager = new GradeManager();

        try {
            // Adding valid grades
            manager.addGrade(85);
            manager.addGrade(92);
            manager.addGrade(76);

            // Adding an invalid grade
            manager.addGrade(-5); // Should trigger IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            manager.sortGrades();
            manager.calculateAverage();
            manager.getHighestGrade();
            manager.getLowestGrade();

            // Searching for a grade
            manager.searchGrade(92);
            manager.searchGrade(60);

            // Accessing a grade at valid and invalid index
            manager.getGradeAtIndex(1);
            manager.getGradeAtIndex(10); // Should trigger ArrayIndexOutOfBoundsException

        } catch (Exception e) {
            System.out.println("Unhandled exception: " + e.getMessage());
        }
    }
}
