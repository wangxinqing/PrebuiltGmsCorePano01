package defpackage;

import android.util.Log;

/* renamed from: bxl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bxl {
    private static String a(String str, String str2, Object... objArr) {
        if (objArr.length != 0) {
            String valueOf = String.valueOf(String.format("[%s]", new Object[]{str}));
            String valueOf2 = String.valueOf(String.format(str2, objArr));
            return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
        }
        return String.format("[%s]%s", new Object[]{str, str2});
    }

    public static void b(String str, String str2) {
        if (a(5)) {
            Log.w("ctxmgr", a(str, str2, new Object[0]));
        }
    }

    public static void b(String str, String str2, Object obj) {
        if (a(5)) {
            Log.w("ctxmgr", a(str, str2, obj));
        }
    }

    public static void a(String str, String str2) {
        if (a(6)) {
            Log.e("ctxmgr", a(str, str2, new Object[0]));
        }
    }

    public static void a(String str, String str2, Object obj) {
        if (a(6)) {
            Log.e("ctxmgr", a(str, str2, obj));
        }
    }

    private static boolean a(int i) {
        return Log.isLoggable("ctxmgr", i);
    }
}
