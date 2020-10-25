package com.wang.demo01;

/**
 * @author wanggy5
 * @date 2020/10/25 19:13
 */
public class Client {
    public static void main(String[] args) {
        //房东要租房房子
        Host host = new Host();
        //代理，中介帮房东租房子
        Proxy proxy = new Proxy(host);//中介
        //你不用面对房东

        proxy.rent();
    }
}
