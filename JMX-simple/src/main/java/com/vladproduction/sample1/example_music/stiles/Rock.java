package com.vladproduction.sample1.example_music.stiles;

import com.vladproduction.sample1.example_music.commonMBean.Music;

import javax.management.*;

import static com.vladproduction.sample1.example_music.commonMBean.StileType.ROCK;

public class Rock extends Music implements RockMBean {

    @Override
    public void setIsActive(boolean isActive) {
    }

    @Override
    public boolean getIsActive() {
        return false;
    }
    public static void nirvana(MBeanServer server) throws Exception {

        Rock rock1 = new Rock();
        ObjectName keyRock1 = new ObjectName("rock:nirvana=value");
        server.registerMBean(rock1, keyRock1);

        AttributeList attList = new AttributeList();
        attList.add(new Attribute("StileType", ROCK));
        attList.add(new Attribute("Band", "Nirvana"));
        attList.add(new Attribute("FoundationYear", 1987));
        attList.add(new Attribute("IsActive", false));

        server.setAttributes(keyRock1, attList);

        server.invoke(keyRock1, "printInfo", new Object[0], new String[0]);
    }

    public static void metallica(MBeanServer server) throws Exception {

        Rock rock2 = new Rock();
        ObjectName keyRock2 = new ObjectName("rock:metallica=value");
        server.registerMBean(rock2, keyRock2);

        AttributeList attList = new AttributeList();
        attList.add(new Attribute("StileType", ROCK));
        attList.add(new Attribute("Band", "Metallica"));
        attList.add(new Attribute("FoundationYear", 1981));
        attList.add(new Attribute("IsActive", true));

        server.setAttributes(keyRock2, attList);

        server.invoke(keyRock2, "printInfo", new Object[0], new String[0]);
    }
}
