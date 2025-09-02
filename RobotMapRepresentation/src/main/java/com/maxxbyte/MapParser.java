package com.maxxbyte;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// handles file uploads and parsing for CSV-like files into map points
public class MapParser {

    public RobotMap loadFromFile(String filePath) {
        RobotMap map = new RobotMap();

        // try-with-resources ensures that the file gets closed automatically
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean headerSkipped = false;

            // read file line by line
            while ((line = br.readLine()) != null) {
                // skip the header row if that's the first line
                if (!headerSkipped) {
                    headerSkipped = true;
                    continue;
                }

                // split line into tokens based on comma
                // example format: x,y,type
                String[] parts = line.split(",");

                // validate we have exactly 3 columns: x, y, type
                if (parts.length < 3) {
                    System.out.println("\nSkipping invalid line (not enough columns): " + line);
                    continue;
                }

                // parse data
                try {
                    int x = Integer.parseInt(parts[0].trim());
                    int y = Integer.parseInt(parts[1].trim());
                    String type = parts[2].trim();

                    // add point once parsed
                    map.addPoint(new MapPoint(x, y, type));

                } catch (NumberFormatException e) {
                    System.out.println("\nInvalid number in line: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("\nFailed to read file: " + e.getMessage());
            ;
        }

        return map;
    }
}