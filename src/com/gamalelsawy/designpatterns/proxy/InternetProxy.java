package com.gamalelsawy.designpatterns.proxy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class InternetProxy implements InternetServiceProvider{
    private List<String> blockedSites = Arrays.asList("facebook", "whatsapp", "youtube");

    @Override
    public String routeSite(String url) {
        if(blockedSites.contains(url)){
            return "This website is blocked!";
        }
        return new We().routeSite(url);
    }
}
