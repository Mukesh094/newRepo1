package com.twiliosms.controller;


import com.twiliosms.payload.SmsRequest;
import com.twiliosms.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sms")
public class SmsController {

    @Autowired
    private SmsService smsService;

    @PostMapping("/send")
    public void sendSMS(@RequestBody SmsRequest smsRequest) {
        smsService.sendSMS(smsRequest.getTo(), smsRequest.getMessage());

    }

}
