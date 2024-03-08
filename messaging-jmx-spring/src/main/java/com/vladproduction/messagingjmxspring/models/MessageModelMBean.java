package com.vladproduction.messagingjmxspring.models;

import java.util.Date;

/**
 * Created by vladproduction on 08-Mar-24
 */

public interface MessageModelMBean {

    void setTitle(String titleMsg);
    String getTitle();
    void setText(String textMsg);
    String getText();
    void setMessageId(int messageId);
    int getMessageId();

    //methods common:
    void printInfo(String titleMsg, String textMsg, int messageId);


}
