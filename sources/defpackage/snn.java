package defpackage;

import android.util.Log;

/* renamed from: snn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class snn {
    public static void a(String str, Object... objArr) {
        crc.a("MDM", str, objArr);
    }

    public static void b(String str, Object... objArr) {
        crc.b("MDM", str, objArr);
    }

    public static void b(Throwable th, String str, Object... objArr) {
        crc.a("MDM", th, str, objArr);
    }

    public static void c(String str, Object... objArr) {
        Log.w("MDM", crc.a(str, objArr));
    }

    public static void d(String str, Object... objArr) {
        Log.wtf("MDM", crc.a(str, objArr), new crd());
    }

    public static void a(Throwable th, String str, Object... objArr) {
        Log.e("MDM", crc.a(str, objArr), th);
    }
}
