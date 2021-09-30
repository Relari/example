package com.pe.relari.example;

import java.net.InetAddress;
import java.net.NetworkInterface;

public class MacAddress {

    public String conseguirMAC(){
        StringBuilder sb = new StringBuilder();
        NetworkInterface a;
        try {
            a = NetworkInterface.getByInetAddress(InetAddress.getLocalHost());
            byte[] mac = a.getHardwareAddress();


            for (int i = 0; i < mac.length; i++) {
                sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ""+sb.toString();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MacAddress p = new MacAddress();
        System.out.println(p.conseguirMAC());
    }
}
