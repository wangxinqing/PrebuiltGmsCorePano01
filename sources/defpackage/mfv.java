package defpackage;

import android.util.Log;
import java.util.Locale;

/* renamed from: mfv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mfv {
    public static final ith a = new ith("Family");
    private static final boolean b = "20.12.16 (080306-{{cl}})".contains("eng");

    public static String a(String str, String str2, Object... objArr) {
        if (objArr.length != 0) {
            str2 = String.format(Locale.US, str2, objArr);
        }
        StringBuilder sb = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
        sb.append("[");
        sb.append(str);
        sb.append("] ");
        sb.append(str2);
        return sb.toString();
    }

    public static void b(String str, String str2, Object... objArr) {
        if (a(2)) {
            a(str, str2, objArr);
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        if (a(3)) {
            a(str, str2, objArr);
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        if (a.a(4)) {
            a.a("Family", a(str, str2, objArr));
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        if (a.a(5)) {
            a.b("Family", a(str, str2, objArr));
        }
    }

    public static void f(String str, String str2, Object... objArr) {
        if (a.a(6)) {
            a.c("Family", a(str, str2, objArr));
        }
    }

    private static boolean a(int i) {
        return b || Log.isLoggable("Family", i);
    }
}
