package com.cug.alibaba_middleware;

import com.cug.alibaba_middleware.model.OrderMessage;
import com.cug.alibaba_middleware.model.PaymentMessage;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        OrderMessage tbao_orderMessage = OrderMessage.createTbaoMessage();
        OrderMessage tmall_orderMessage = OrderMessage.createTmallMessage();
        System.out.println( tbao_orderMessage.toString());
        System.out.println( tmall_orderMessage.toString());

        PaymentMessage[] tbao_payment_list = PaymentMessage.createPayMentMsg(tbao_orderMessage);
        PaymentMessage[] tmall_payment_list = PaymentMessage.createPayMentMsg(tmall_orderMessage);

        System.out.println( tbao_payment_list[0].toString());
        System.out.println( tbao_payment_list[1].toString());
        
        System.out.println( tmall_payment_list[0].toString());
        System.out.println( tmall_payment_list[1].toString());
    }
}
