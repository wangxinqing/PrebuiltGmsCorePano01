package com.google.android.gms.mdm.util;

import android.content.IntentFilter;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BaseDeviceRinger$1 extends IntentFilter {
    public BaseDeviceRinger$1() {
        addAction("android.intent.action.SCREEN_ON");
        addAction("android.intent.action.SCREEN_OFF");
        addAction("android.intent.action.USER_PRESENT");
    }
}
