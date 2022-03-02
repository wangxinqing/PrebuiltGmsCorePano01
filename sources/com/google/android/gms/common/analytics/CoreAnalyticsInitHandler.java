package com.google.android.gms.common.analytics;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CoreAnalyticsInitHandler extends hec {
    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        int i2 = i & 8;
        if ((i & 2) > 0) {
            iap.a();
            iap.a(this, 9, ((Long) ikq.b.c()).longValue());
        }
        if (i2 > 0) {
            int i3 = getSharedPreferences("coreanalyticsprefs", 0).getInt("last_install_version_code", 0);
            int d = jhg.d((Context) this);
            if (i3 != d) {
                iao.a();
                aucd o = aohl.u.o();
                aohg a = iao.a(this);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aohl aohl = (aohl) o.b;
                a.getClass();
                aohl.b = a;
                aohl.a |= 1;
                iao.a((Context) this, "install", ((aohl) o.i()).k());
                getSharedPreferences("coreanalyticsprefs", 0).edit().putInt("last_install_version_code", d).apply();
            }
            iap.a();
            iap.a(this, 10, ((Long) ikq.d.c()).longValue());
        }
    }
}
