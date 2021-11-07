package com.beniregev.designpatterns.behavioral_patterns.iterator;

/**
 * <div>
 * <p>
 * The iterator design pattern allows you to access objects that
 * are stored in many different collection types.
 * </p>
 * <p>
 * You do this by creating a common interface that these classes
 * share. Then you have them provide you with an iterator that
 * allows you to traverse the objects they contain.
 * </p>
 * <p>
 * Because they all share a common interface you can treat them
 * polymorphically and eliminate a lot of duplicate code. The
 * example video will explain how and the code that follows will
 * reenforce the concepts.
 * </p>
 * </div>
 * @author binyamin.regev
 */
public class RadioStation {
    public static void main(String[] args){

        SongsOfThe70s songs70s = new SongsOfThe70s();
        SongsOfThe80s songs80s = new SongsOfThe80s();
        SongsOfThe90s songs90s = new SongsOfThe90s();

        DiscJockey madMike = new DiscJockey(songs70s, songs80s, songs90s);

        // madMike.showTheSongs();
        madMike.showTheSongs2();
    }
}
