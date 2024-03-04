package com.vladproduction.sample1_mbeans.example_music;

import com.vladproduction.sample1_mbeans.example_music.stiles.Classic;
import com.vladproduction.sample1_mbeans.example_music.stiles.Rock;

import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;

public class MainApp {

    private static final MBeanServer server = MBeanServerFactory.createMBeanServer();

    public static void main(String[] args) throws Exception{

        Rock.nirvana(server);
        Rock.metallica(server);
        Classic.vivaldi(server);
        Classic.mozart(server);

    }
}
