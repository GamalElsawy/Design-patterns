package com.gamalelsawy.designpatterns.chainofresponsibility;

public class InstagramHandler implements Handler{
    private Handler handler;

    @Override
    public void setNextHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void handle(Video video) {
        if(video.getLink().contains("instagram")){
            System.out.println("I can handle it");
        }else {
            System.out.println("This link is not supported");
            //handler.handle(video);
        }
    }
}
