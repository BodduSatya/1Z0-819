package com.company;

public final class Immutable {
    private String s = "name";

    public String getS() {
        return s;
    }
}

class Mutable{
    private String s;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
