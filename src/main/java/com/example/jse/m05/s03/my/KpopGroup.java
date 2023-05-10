package com.example.jse.m05.s03.my;

public class KpopGroup {
    private String groupName;
    private String recordLabel;
    private int yearsActive;

    public KpopGroup(String groupName, String recordLabel, int yearsActive) {
        super();
        this.groupName = groupName;
        this.recordLabel = recordLabel;
        this.yearsActive = yearsActive;
    }

    @Override
    public String toString() {
        return "KpopGroup [groupName=" + groupName + ", recordLabel=" + recordLabel + ", yearsActive=" + yearsActive
                + "]";
    }

//    This method returns whether or not a band is currently on tour
    public String goOnTour(boolean yes) {
        return yes ? groupName + " is currently on tour" : "No concert dates currently available for " + groupName;
    }
}