package com.maxxbyte;

public class MapNode {

    //properties=================================================================================
    // represents one single location/point on the map
    private int x; // x coordinate
    private int y; // y coordinate
    private String type; // "building", "path", "obstacle"

    //constructor================================================================================
    public MapNode(int x, int y, String type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    //methods====================================================================================

    //getters and setters========================================================================
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}