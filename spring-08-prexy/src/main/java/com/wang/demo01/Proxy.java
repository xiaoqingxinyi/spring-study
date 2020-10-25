package com.wang.demo01;

/**
 * @author wanggy5
 * @date 2020/10/25 19:15
 */
public class Proxy implements Rent{

    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
        seeHouse();
        hetong();
        fare();
    }

    //中介带你看房
    public void seeHouse(){
        System.out.println("中介带你看房");
    }
    //中介签合同
    public void hetong(){
        System.out.println("签合同");
    }

    //中介收中介费
    public void fare() {
        System.out.println("收中介费");
    }
}
