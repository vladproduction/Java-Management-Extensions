package com.vladproduction.sample1.example_music.commonMBean;

public class Music implements MusicMBean{

    private StileType stileType;
    private String band;
    private int foundationYear;

    @Override
    public StileType getStileType() {
        return this.stileType;
    }

    @Override
    public void setStileType(StileType stileType) {
        this.stileType = stileType;
    }

    @Override
    public String getBand() {
        return this.band;
    }

    @Override
    public void setBand(String band) {
        this.band = band;
    }

    @Override
    public int getFoundationYear() {
        return this.foundationYear;
    }

    @Override
    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    @Override
    public void printInfo() {
        System.out.println("Music{" +
                "stile=" + this.stileType +
                ", band='" + this.band + '\'' +
                ", foundationYear=" + this.foundationYear +
                '}');

    }

}
