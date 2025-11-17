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
    
    public String paymentViaBank(String name,long accno, double amount)
    {
    	return "Account holders name: "+name+", Account number: "+accno+", amount: "+amount;
    }
}
