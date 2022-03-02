package com.google.android.gms.ads.internal.util.client;

import android.util.Log;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class c {
    public static void a(String str) {
        if (a(3)) {
            Log.d("Ads", str);
        }
    }

    public static void b(String str) {
        if (a(6)) {
            Log.e("Ads", str);
        }
    }

    public static void c(String str) {
        if (a(5)) {
            Log.w("Ads", str);
        }
    }

    public static void a(String str, Throwable th) {
        if (a(3)) {
            Log.d("Ads", str, th);
        }
    }

    public static void b(String str, Throwable th) {
        if (a(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static boolean a(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }
}
