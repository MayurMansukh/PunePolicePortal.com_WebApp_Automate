/**
 * Description : get otp using get message method from twilio app
 * Author      : Mayur Mansukh
 * Date        : 11/6/21
 */
package com.bridgelabz.utils;

import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.Message;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;


public class OtpHandelUsingTwilio {
    public final String Account_SID = "AC9edfe56990de6fb3274f397361862126";
    public final String AUTH_TOKEN = "a0c6d87575c22253a3a76ffc2962eefd";

    public String getMessage(){
        return getMessages().filter(m -> m.getDirection().compareTo(Message.Direction.INBOUND)==0)
                .filter(m -> m.getTo().equals("+12152788883")).map(Message::getBody).findFirst()
                .orElseThrow(IllegalStateException::new);
    }

    private Stream<Message> getMessages(){
        ResourceSet<Message> message = Message.reader(Account_SID).read();
        return StreamSupport.stream(message.spliterator(),false);
    }

}