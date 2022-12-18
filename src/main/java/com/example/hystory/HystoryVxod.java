package com.example.hystory;

public class HystoryVxod {
    private String FIO;
    private String hystory;

    public HystoryVxod( String FIO, String hystory) {
       this.FIO=FIO;
       this.hystory=hystory;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getHystory() {
        return hystory;
    }

    public void setHystory(String hystory) {
        this.hystory = hystory;
    }
}
