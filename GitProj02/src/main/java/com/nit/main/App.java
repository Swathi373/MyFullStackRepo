package com.nit.main;

import com.nit.service.UPIpayment;

public class App 
{
    public static void main( String[] args )
    {
        UPIpayment upi = new UPIpayment();
        System.out.println(upi.paymentProcess(37865784876L, 25000.0));
    }
}
