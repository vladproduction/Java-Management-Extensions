package com.vladproduction.sample1.example_music.stiles;

import com.vladproduction.sample1.example_music.commonMBean.Music;

import javax.management.Attribute;
import javax.management.AttributeList;
import javax.management.MBeanServer;
import javax.management.ObjectName;

import static com.vladproduction.sample1.example_music.commonMBean.StileType.CLASSIC;

public class Classic extends Music implements ClassicMBean {

    private String instrument;

    @Override
    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    @Override
    public String getInstrument() {
        return this.instrument;
    }

    public static void vivaldi(MBeanServer server) throws Exception {

        Classic classic1 = new Classic();
        ObjectName key1Classic = new ObjectName("classic:vivaldi=value");
        server.registerMBean(classic1, key1Classic);

        AttributeList attrList = new AttributeList();
        attrList.add(new Attribute("StileType", CLASSIC));
        attrList.add(new Attribute("Band", "Vivaldi"));
        attrList.add(new Attribute("FoundationYear", 1725));
        attrList.add(new Attribute("SetInstrument", "violin"));

        server.setAttributes(key1Classic, attrList);

        server.invoke(key1Classic, "printInfo", new Object[0], new String[0]);

    }

    public static void mozart(MBeanServer server) throws Exception {

        Classic classic2 = new Classic();
        ObjectName key2Classic = new ObjectName("classic:mozart=value");
        server.registerMBean(classic2, key2Classic);

        AttributeList attrList = new AttributeList();
        attrList.add(new Attribute("StileType", CLASSIC));
        attrList.add(new Attribute("Band", "Mozart"));
        attrList.add(new Attribute("FoundationYear", 1787));
        attrList.add(new Attribute("SetInstrument", "violin, cello, bass"));

        server.setAttributes(key2Classic, attrList);

        server.invoke(key2Classic, "printInfo", new Object[0], new String[0]);

    }
}
