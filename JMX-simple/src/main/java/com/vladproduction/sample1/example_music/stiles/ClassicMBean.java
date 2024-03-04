package com.vladproduction.sample1.example_music.stiles;

import com.vladproduction.sample1.example_music.commonMBean.MusicMBean;

public interface ClassicMBean extends MusicMBean {

    void setInstrument(String instrument);
    String getInstrument();
}
