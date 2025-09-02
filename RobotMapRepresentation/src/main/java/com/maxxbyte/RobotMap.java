package com.maxxbyte;

import java.util.ArrayList;
import java.util.List;

//holds a collection of map points (robot's internal map)
public class RobotMap {

    //properties=================================================================================
    private List<MapPoint> points; // all known locations;

    //constructor================================================================================
    public RobotMap() {
        this.points = new ArrayList<>();
    }

    //methods====================================================================================
    // add a point to the map
    public void addPoint(MapPoint point) {
        points.add(point);
    }

    // convert to a robot-friendly representation (stub for now)
    public void generateRepresentation() {
        // implement conversion logic (grid, graph, etc.)
        System.out.println("\nGenerating robot map representation: \n");
    }

    //getters and setters========================================================================
    // get all points
    public List<MapPoint> getPoints() {
        return points;
    }
}