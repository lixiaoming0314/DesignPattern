package com.ycx.mode.simplemethod;

import android.util.Log;

/**
 * Created by 李小明 on 17/6/8.
 * 邮箱:287907160@qq.com
 */

public class MailSendImpl implements Sender {
    @Override
    public void send(String message) {
        Log.i("lxm", "mail = " + message);
    }
}
