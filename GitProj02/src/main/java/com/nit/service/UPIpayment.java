package com.nit.service;

public class UPIpayment 
{
    public String paymentProcess(long accno,double amount)
    {
    	return amount+" amount transfered from the account: "+accno;
    }
    
    public String paymentThroughUPIid(String upid,double amount)
    {
    	return amount+" amount transfered from up id: "+upid;
    }
}
