package com.jwell.sms.service.impl;

import com.jwell.sms.service.ISmsService;
import org.springframework.stereotype.Service;

@Service
public class SmsServiceImpl implements ISmsService {

    @Override
    public String sendMessage(String name, String msg) {
        return "开始给用户："+name+"发送短信,内容如下："+msg;
    }
}
