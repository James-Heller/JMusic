package edu.JamesTang.JMusic.entity;

/**
 * @author JamesTang
 * @date 2020/10/9 21:36
 *
 *  This class is used for create the music res object.
 */
public class Music {

    private String NAME;
    private String AUTHOR;
    private String LOCATION;

    /**
     *
     * @param name The name of the music
     * @param author The author of the music
     * @param location The path of music in server Disk
     */

    public Music(String name, String author, String location){
        this.NAME=name;
        this.AUTHOR=author;
        this.LOCATION=location;
    }

    public void setNAME(String name){
        this.NAME=name;
    }

    public void setAUTHOR(String author){
        this.AUTHOR=author;
    }

    public void setLOCATION(String location){
        this.LOCATION=location;
    }

    public String getNAME(){
        return this.NAME;
    }

    public String getAUTHOR(){
        return this.AUTHOR;
    }

    public String getLOCATION(){
        return this.LOCATION;
    }
}
