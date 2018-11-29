package com.example.taojun.neteasecloudmusic;

public class B {

    public B(){
    }


    public B(String a) {
        this.a = a;
    }

    public B(String a, int num) {

    }

    private String a = "123";//"321"
    public int num = 456;
    protected String name = "张三";

    protected final void say() {
        System.out.println("Hello Word");
    }

    @Override
    public String toString() {
        return "B{" + "a='" + a + '\'' + ", num=" + num + ", name='" + name + '\'' + '}';
    }
}
