package com.google.android.gms.common.util;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WifiConnectionMonitor$ConnectionChangeReceiver extends nla {
    final /* synthetic */ jlq a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiConnectionMonitor$ConnectionChangeReceiver(jlq jlq) {
        super("common-base");
        this.a = jlq;
    }

    public final void a(Context context, Intent intent) {
        boolean z;
        String str;
        if ("android.net.wifi.STATE_CHANGE".equals(intent.getAction())) {
            NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
            boolean z2 = false;
            if (networkInfo == null || !networkInfo.isConnected()) {
                z = false;
            } else {
                z = true;
            }
            String str2 = null;
            if (z) {
                WifiInfo connectionInfo = this.a.a.getConnectionInfo();
                if (connectionInfo != null) {
                    str = connectionInfo.getBSSID();
                } else {
                    str = null;
                }
                if (str != null) {
                    z2 = z;
                }
            } else {
                z2 = z;
                str = null;
            }
            jlq jlq = this.a;
            if (jlq.d != z2 || (z2 && !str.equals(jlq.e))) {
                jlq jlq2 = this.a;
                jlq2.d = z2;
                if (z2) {
                    str2 = str;
                }
                jlq2.e = str2;
                synchronized (jlq2.b) {
                    jlq jlq3 = this.a;
                    jlp jlp = jlq3.c;
                    if (jlp != null) {
                        jlp.a(jlq3.d, jlq3.e);
                    }
                }
            }
        }
    }
}
