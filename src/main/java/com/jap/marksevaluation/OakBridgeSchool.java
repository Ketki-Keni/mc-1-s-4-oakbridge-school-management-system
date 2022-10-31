package com.jap.marksevaluation;
public class OakBridgeSchool {
    public int[] calculateTotalMarks(int [] math, int[] science, int[] english)
    {
        if (math.length == 0 || science.length == 0 || english.length == 0)
        {
            return null;
        }
        else
        {
            int[] totalMarks = new int[math.length];
            for (int index = 0; index < math.length; index++)
            {
                totalMarks[index] = math[index] + science[index] + english[index];
            }
            return totalMarks;
        }
    }
    // Write the logic to calculate the average marks using recursion
   public double calculateAverageScienceMarks (int[] science,int len)
    {
        double sumOfScienceMarks;
        if(len == 1)
        {
            sumOfScienceMarks = science[0];
        }
        else
        {
            sumOfScienceMarks = science[len - 1] + (len - 1) * calculateAverageScienceMarks(science, len - 1);
        }
        return sumOfScienceMarks/len;
    }
    // Write the logic to calculate the average marks using recursion
    public double calculateAverageEnglishMarks (int[] english,int len)
    {
        {
            if(len == 1)
            {
                return english[0];
            }
            return (english[len - 1] + (len - 1) * calculateAverageEnglishMarks(english, len - 1)) / len;
        }
    }
    // Write the logic to calculate the average marks using recursion
    public double calculateAverageMathMarks (int[] math,int len)
    {
        {
            if(len == 1)
            {
                return math[0];
            }
            return (math[len - 1] + (len - 1) * calculateAverageScienceMarks(math, len - 1))/ len;
        }
    }

    //Write the logic to find the top score in the class using recursion
    public int findTopScore(int [] totalMarks,int len)
    {
        if(len == 1)
        {
            return totalMarks[0];
        }
        return Math.max(totalMarks[len - 1], findTopScore(totalMarks, len - 1));
    }

    public static void main(String[] args) {

        // Initialize the OakBridgeSchool class object
        OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();

        int[] math = {88, 89, 100, 70, 60, 80, 35, 3, 25, 56};
        int[] science = {80, 83, 99, 67, 56, 84, 38, 9, 32, 65};
        int[] english = {90, 98, 100, 65, 54, 82, 40, 13, 45, 67};

        // Call the appropriate methods and display the output
        int[] totalMarks = oakBridgeSchool.calculateTotalMarks(math, science, english);
        System.out.println("-------------------------------------------------");
        System.out.println("Total Marks of students in the class : ");
        System.out.println("-------------------------------------------------");
        for (int index = 0; index < totalMarks.length; index++) {
            System.out.println(totalMarks[index]);
        }
        System.out.println("----------------------------------------");
        System.out.println("Top Score in the class : " + oakBridgeSchool.findTopScore(totalMarks, totalMarks.length));
        System.out.println("----------------------------------------");

        double averageScienceMarks = oakBridgeSchool.calculateAverageScienceMarks(science, science.length);
        System.out.println("Average Science Marks = " + averageScienceMarks);

        double averageEnglishMarks = oakBridgeSchool.calculateAverageEnglishMarks(english, english.length);
        System.out.println("Average English Marks = " + averageEnglishMarks);

        double averageMathMarks = oakBridgeSchool.calculateAverageMathMarks(math, math.length);
        System.out.println("Average Math Marks = " + averageMathMarks);


    }
}