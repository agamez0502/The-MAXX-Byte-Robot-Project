package com.maxxbyte;

public class App {

    public static void main(String[] args) {

        // path to your CSV file (make sure it exists in your project directory)
        String filePath = "src/main/resources/campus_map.csv";

        // create a parser instance
        MapParser parser = new MapParser();

        // parse the file into a RobotMap object
        RobotMap map = parser.parseFile(filePath);

        // print out a summary
        System.out.println("\nMap loaded successfully!");
        System.out.println("\nTotal points parsed: " + map.getPoints().size());

        // print the first few nodes for verification
        System.out.println("Sample points:");
        for (int i = 0; i < Math.min(5, map.getPoints().size()); i++) {
            System.out.println(" " + map.getPoints().get(i));
        }
    }
}