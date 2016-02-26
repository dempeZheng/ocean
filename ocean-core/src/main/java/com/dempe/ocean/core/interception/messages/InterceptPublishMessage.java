package com.dempe.ocean.core.interception.messages;

import com.dempe.ocean.common.protocol.mqtt.PublishMessage;

import java.nio.ByteBuffer;

/**
 * @author Wagner Macedo
 */
public class InterceptPublishMessage extends InterceptAbstractMessage {
    private final PublishMessage msg;
    private final String clientID;

    public InterceptPublishMessage(PublishMessage msg, String clientID) {
        super(msg);
        this.msg = msg;
        this.clientID = clientID;
    }

    public String getTopicName() {
        return msg.getTopicName();
    }

    public ByteBuffer getPayload() {
        return msg.getPayload();
    }

    public String getClientID() {
        return clientID;
    }
}