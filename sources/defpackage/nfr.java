package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: nfr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nfr {
    private static SharedPreferences a = null;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (a == null) {
                a = (SharedPreferences) nfs.a(new nfq(context));
            }
            sharedPreferences = a;
        }
        return sharedPreferences;
    }
}
