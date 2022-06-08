package com.gamalelsawy.designpatterns.chainofresponsibility;

public class FacebookHandler implements Handler{
    private Handler handler;

    @Override
    public void setNextHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void handle(Video video) {
        if(video.getLink().contains("facebook")){
            System.out.println("I can handle it");
        }else {
            System.out.println("I can't handle it");
            handler.handle(video);
        }
    }
}
