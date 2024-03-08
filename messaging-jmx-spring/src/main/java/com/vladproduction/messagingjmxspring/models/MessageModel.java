package com.vladproduction.messagingjmxspring.models;

import java.util.Date;

/**
 * Created by vladproduction on 08-Mar-24
 */

public class MessageModel implements MessageModelMBean{

    private String titleMsg;
    private String textMsg;
    private int messageId;
    @Override
    public void setTitle(String titleMsg) {
        this.titleMsg = titleMsg;
    }

    @Override
    public String getTitle() {
        return titleMsg;
    }

    @Override
    public void setText(String textMsg) {
        this.textMsg = textMsg;
    }

    @Override
    public String getText() {
        return textMsg;
    }

    @Override
    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    @Override
    public int getMessageId() {
        return this.messageId;
    }

    @Override
    public void printInfo(String titleMsg, String textMsg, int messageId) {
        StringBuilder sb = new StringBuilder();
        sb.append("Message ID: ").append(messageId).append(", Title: ").append(titleMsg).append(", Text: ").append(textMsg).append("\n");
        sb.append("Message Date: ".toUpperCase()).append(new Date());
        System.out.println(sb);

    }
}
