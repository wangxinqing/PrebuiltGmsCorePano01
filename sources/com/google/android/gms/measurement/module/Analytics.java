package com.google.android.gms.measurement.module;

import android.content.Context;
import android.os.Bundle;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Analytics {
    private static volatile Analytics a;
    private final svv b;

    public Analytics(svv svv) {
        iva.a((Object) svv);
        this.b = svv;
    }

    public static Analytics getInstance(Context context) {
        if (a == null) {
            synchronized (Analytics.class) {
                if (a == null) {
                    a = new Analytics(svv.a(context));
                }
            }
        }
        return a;
    }

    public final void a(String str, String str2, Bundle bundle, String str3) {
        iva.c(str3);
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.b.e().a(str, str2, bundle, str3);
    }
}
