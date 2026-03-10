package ru.omgtu.lr2.utils;

public class MessageEvent {
    private int buttonId;

    public MessageEvent(int buttonId) {
        this.buttonId = buttonId;
    }

    public int getButtonId() {
        return buttonId;
    }
}