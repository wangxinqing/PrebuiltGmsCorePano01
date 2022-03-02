package defpackage;

import android.util.Log;
import java.util.Locale;

/* renamed from: pnz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pnz {
    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static void b(String str) {
        if (Log.isLoggable("IcingInternalCorpora", 6)) {
            Log.e("IcingInternalCorpora", str);
        }
    }

    public static void c(String str) {
        if (Log.isLoggable("IcingInternalCorpora", 4)) {
            Log.i("IcingInternalCorpora", str);
        }
    }

    public static void d(String str) {
        if (Log.isLoggable("IcingInternalCorpora", 2)) {
            Log.v("IcingInternalCorpora", str);
        }
    }

    public static void e(String str) {
        if (Log.isLoggable("IcingInternalCorpora", 5)) {
            Log.w("IcingInternalCorpora", str);
        }
    }

    public static void a(String str) {
        if (Log.isLoggable("IcingInternalCorpora", 3)) {
            Log.d("IcingInternalCorpora", str);
        }
    }

    public static void b(String str, Object obj) {
        if (Log.isLoggable("IcingInternalCorpora", 6)) {
            Log.e("IcingInternalCorpora", a(str, obj));
        }
    }

    public static void c(String str, Object obj) {
        if (Log.isLoggable("IcingInternalCorpora", 4)) {
            Log.i("IcingInternalCorpora", a(str, obj));
        }
    }

    public static void d(String str, Object obj) {
        if (Log.isLoggable("IcingInternalCorpora", 2)) {
            Log.v("IcingInternalCorpora", a(str, obj));
        }
    }

    public static void e(String str, Object obj) {
        if (Log.isLoggable("IcingInternalCorpora", 5)) {
            Log.w("IcingInternalCorpora", a(str, obj));
        }
    }

    public static void a(String str, Object obj) {
        if (Log.isLoggable("IcingInternalCorpora", 3)) {
            Log.d("IcingInternalCorpora", a(str, obj));
        }
    }

    public static void b(String str, Object obj, Object obj2) {
        if (Log.isLoggable("IcingInternalCorpora", 4)) {
            Log.i("IcingInternalCorpora", a(str, obj, obj2));
        }
    }

    public static void c(String str, Object obj, Object obj2) {
        if (Log.isLoggable("IcingInternalCorpora", 2)) {
            Log.v("IcingInternalCorpora", a(str, obj, obj2));
        }
    }

    public static void a(String str, Object obj, Object obj2) {
        if (Log.isLoggable("IcingInternalCorpora", 3)) {
            Log.d("IcingInternalCorpora", a(str, obj, obj2));
        }
    }

    public static void b(String str, Object... objArr) {
        if (Log.isLoggable("IcingInternalCorpora", 3)) {
            Log.d("IcingInternalCorpora", a(str, objArr));
        }
    }

    public static void c(String str, Object... objArr) {
        if (Log.isLoggable("IcingInternalCorpora", 2)) {
            Log.v("IcingInternalCorpora", a(str, objArr));
        }
    }

    public static void a(Throwable th, String str, Object... objArr) {
        if (!Log.isLoggable("IcingInternalCorpora", 6)) {
            return;
        }
        if (Log.isLoggable("IcingInternalCorpora", 3)) {
            Log.e("IcingInternalCorpora", a(str, objArr), th);
            return;
        }
        String a = a(str, objArr);
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2 + String.valueOf(valueOf).length());
        sb.append(a);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("IcingInternalCorpora", sb.toString());
    }

    public static boolean a() {
        return Log.isLoggable("IcingInternalCorpora", 3);
    }
}
