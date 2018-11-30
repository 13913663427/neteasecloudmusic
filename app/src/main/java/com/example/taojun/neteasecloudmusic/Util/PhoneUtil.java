package com.example.taojun.neteasecloudmusic.Util;

import android.text.TextUtils;

public class PhoneUtil {

    private static final String PHONE_REG = "^1(3|4|5|7|8)\\d{9}$";

    /**
     * 返回值true表示为电话号码，反之不是
     *
     * @param phone
     * @return
     */
    public static boolean isPhoneNumber(String phone) {
        if (TextUtils.isEmpty(phone)) {
            return false;
        }
        return phone.matches(PHONE_REG);
    }
}
