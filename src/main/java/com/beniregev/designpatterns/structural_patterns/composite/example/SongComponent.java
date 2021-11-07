package com.beniregev.designpatterns.structural_patterns.composite.example;

/**
 * This acts as an interface for every Song (Leaf) and SongGroup (Composite) we create
 * @author binyamin.regev
 */
public abstract class SongComponent {
    // We throw UnsupportedOperationException so that if
    // it doesn't make sense for a song, or song group
    // to inherit a method they can just inherit the
    // default implementation

    /**
     * This allows me to add components
     * @param newSongComponent
     */
    public void add(SongComponent newSongComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * This allows me to remove components
     * @param newSongComponent
     */
    public void remove(SongComponent newSongComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * This allows me to get components
     * @param componentIndex
     * @return
     */
    public SongComponent getComponent(int componentIndex) {
        throw new UnsupportedOperationException();
    }

    /**
     * This allows me to retrieve song names
     * @return
     */
    public String getSongName() {
        throw new UnsupportedOperationException();
    }

    /**
     * This allows me to retrieve band names
     * @return
     */
    public String getBandName() {
        throw new UnsupportedOperationException();
    }

    /**
     * his allows me to retrieve release year
     */
    public int getReleaseYear() {
        throw new UnsupportedOperationException();
    }

    /**
     * When this is called by a class object that extends SongComponent
     * it will print out information specific to the Song or SongGroup
     */
    public void displaySongInfo() {
        throw new UnsupportedOperationException();
    }

}
