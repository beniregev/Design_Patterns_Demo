package com.beniregev.designpatterns.behavioral_patterns.iterator;

/**
 *
 * @author binyamin.regev
 */
public class SongInfo {
    String songName;
    String bandName;
    int yearReleased;

    /**
     *
     * @param newSongName
     * @param newBandName
     * @param newYearReleased
     */
    public SongInfo(String newSongName, String newBandName, int newYearReleased){
        songName = newSongName;
        bandName = newBandName;
        yearReleased = newYearReleased;
    }

    public String getSongName(){ return songName; }
    public String getBandName(){ return bandName; }
    public int getYearReleased(){ return yearReleased; }
}
