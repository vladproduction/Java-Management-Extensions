package com.vladproduction.sample1.example_music.stiles;

import com.vladproduction.sample1.example_music.commonMBean.MusicMBean;

public interface RockMBean extends MusicMBean {

    void setIsActive(boolean isActive);
    boolean getIsActive();


}
