package org.hatch.challenge.devicesimulator.stream;

public interface StreamMessageSender {

    void sentMessage(Object payloadMessage) throws RuntimeException;

}
