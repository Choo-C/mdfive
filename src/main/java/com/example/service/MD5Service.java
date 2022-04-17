package com.example.service;

import com.example.util.MD5Util;

public class MD5Service {

    public  String getMD5 (String input) {
        return MD5Util.getMD5(input);
    }
}
