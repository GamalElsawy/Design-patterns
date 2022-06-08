package com.gamalelsawy.designpatterns.chainofresponsibility;

public interface Handler {
    void setNextHandler(Handler handler);
    void handle(Video video);
}
