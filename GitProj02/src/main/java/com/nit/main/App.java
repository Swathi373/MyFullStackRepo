package com.nit.main;

import com.nit.service.UPIpayment;

public class App 
{
    public static void main( String[] args )
    {
        UPIpayment upi = new UPIpayment();
        System.out.println(upi.paymentProcess(37865784876L, 25000.0));
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println(upi.paymentThroughUPIid("ybl@134", 30000.0));
        System.out.println(upi.paymentThroughAccount(99988877L, "poorna", 2000.0));
    }
}
