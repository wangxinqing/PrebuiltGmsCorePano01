package defpackage;

import android.util.Log;
import java.util.Locale;

/* renamed from: afsh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afsh {
    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static void b(String str, Object obj, Object obj2) {
        if (Log.isLoggable("MDD", 4)) {
            Log.i("MDD", a(str, obj, obj2));
        }
    }

    public static void c(String str, Object obj, Object obj2) {
        if (Log.isLoggable("MDD", 5)) {
            Log.w("MDD", a(str, obj, obj2));
        }
    }

    public static void a(String str) {
        if (Log.isLoggable("MDD", 6)) {
            Log.e("MDD", str);
        }
    }

    public static void b(String str, Object... objArr) {
        if (Log.isLoggable("MDD", 6)) {
            Log.e("MDD", a(str, objArr));
        }
    }

    public static void a(String str, Object obj) {
        if (Log.isLoggable("MDD", 6)) {
            Log.e("MDD", a(str, obj));
        }
    }

    public static void b(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("MDD", 5)) {
            String a = a(str, objArr);
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2 + String.valueOf(valueOf).length());
            sb.append(a);
            sb.append(": ");
            sb.append(valueOf);
            Log.w("MDD", sb.toString());
        }
    }

    public static void a(String str, Object obj, Object obj2) {
        if (Log.isLoggable("MDD", 6)) {
            Log.e("MDD", a(str, obj, obj2));
        }
    }

    public static void a(Throwable th, String str) {
        if (Log.isLoggable("MDD", 6)) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(valueOf).length());
            sb.append(str);
            sb.append(": ");
            sb.append(valueOf);
            Log.e("MDD", sb.toString());
        }
    }

    public static void a(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("MDD", 6)) {
            a(th, a(str, objArr));
        }
    }
}
