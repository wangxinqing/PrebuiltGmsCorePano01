package defpackage;

import android.util.Log;

/* renamed from: alfy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alfy {
    public static void a(String str) {
        Object[] objArr = {"?", str};
    }

    public static void b(String str, String str2) {
        Log.i(str, String.format("%s: %s", new Object[]{"?", str2}));
    }

    public static void c(String str, String str2) {
        Log.w(str, String.format("%s: %s", new Object[]{"?", str2}));
    }

    public static void d(String str, String str2) {
        Log.wtf(str, String.format("%s: %s", new Object[]{"?", str2}));
    }

    public static void a(String str, String str2) {
        Log.e(str, String.format("%s: %s", new Object[]{"?", str2}));
    }

    public static void b(String str, String str2, Throwable th) {
        Log.w(str, String.format("%s: %s\n%s", new Object[]{"?", str2, Log.getStackTraceString(th)}));
    }

    public static void a(String str, String str2, Throwable th) {
        Log.i(str, String.format("%s: %s\n%s", new Object[]{"?", str2, Log.getStackTraceString(th)}));
    }
}
