public class ExamResults {
    public static void main(String[] args) {
        int[][] marks = {
            {70, 80, 90},
            {60, 85, 75},
            {80, 70, 60},
            {90, 95, 80},
            {75, 85, 70}
        };

        int[] totalMarks = calculateTotalMarks(marks);
        int highestTotalMarksIndex = findHighestTotalMarksIndex(totalMarks);

        System.out.println("Total marks obtained by each student:");
        for (int i = 0; i < totalMarks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + totalMarks[i]);
        }

        System.out.println("Student " + (highestTotalMarksIndex + 1) + " obtained the highest total marks.");
    }

    public static int[] calculateTotalMarks(int[][] marks) {
        int[] totalMarks = new int[marks.length];

        for (int i = 0; i < marks.length; i++) {
            int sum = 0;
            for (int j = 0; j < marks[i].length; j++) {
                sum += marks[i][j];
            }
            totalMarks[i] = sum;
        }

        return totalMarks;
    }

    public static int findHighestTotalMarksIndex(int[] totalMarks) {
        int maxIndex = 0;
        int maxValue = totalMarks[0];

        for (int i = 1; i < totalMarks.length; i++) {
            if (totalMarks[i] > maxValue) {
                maxIndex = i;
                maxValue = totalMarks[i];
            }
        }

        return maxIndex;
    }
}
