package com.gamalelsawy.designpatterns.proxy;

public class We implements InternetServiceProvider{
    private int routingSpeed = 100;

    @Override
    public String routeSite(String url) {
        return String.format("http://www.%s.com",url);
    }

    public int getRoutingSpeed() {
        return routingSpeed;
    }
}
