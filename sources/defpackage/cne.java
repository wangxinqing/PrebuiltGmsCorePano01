package defpackage;

import android.util.Log;

/* renamed from: cne  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cne {
    public static String a(String str) {
        return str.length() == 0 ? new String("TransportRuntime.") : "TransportRuntime.".concat(str);
    }

    public static void a(String str, Object obj) {
        a(str);
        new Object[1][0] = obj;
    }

    public static void a(String str, String str2) {
        Log.i(a(str), str2);
    }
}
