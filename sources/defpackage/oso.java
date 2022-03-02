package defpackage;

import android.util.Log;
import java.util.Locale;

/* renamed from: oso  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oso {
    static {
        new ith("Icing");
    }

    public static int a() {
        if (!Log.isLoggable("Icing", 2)) {
            return Log.isLoggable("Icing", 3) ? 1 : 0;
        }
        return 2;
    }

    public static void b(String str) {
        if (Log.isLoggable("Icing", 6)) {
            f(str);
            Log.e("Icing", str);
        }
    }

    public static void c(String str) {
        if (Log.isLoggable("Icing", 4)) {
            f(str);
            Log.i("Icing", str);
        }
    }

    public static void d(String str) {
        if (Log.isLoggable("Icing", 2)) {
            f(str);
            Log.v("Icing", str);
        }
    }

    public static void e(String str) {
        if (Log.isLoggable("Icing", 5)) {
            f(str);
            Log.w("Icing", str);
        }
    }

    private static void f(String str) {
        psc psc;
        if (axrm.b() && (psc = (psc) psj.a.get()) != null && str != null) {
            auqk auqk = psc.a;
            anvb anvb = psc.b;
            aucf aucf = (aucf) anve.c.o();
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            anve anve = (anve) aucf.b;
            str.getClass();
            anve.a |= 1;
            anve.b = str;
            auqk.a(anvb, (anve) aucf.i());
        }
    }

    public static void g(String str, Object... objArr) {
        a("Icing", str, objArr);
    }

    private static String h(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static void b(String str, Object obj) {
        if (Log.isLoggable("Icing", 6)) {
            String h = h(str, obj);
            f(h);
            Log.e("Icing", h);
        }
    }

    public static void c(String str, Object obj) {
        if (Log.isLoggable("Icing", 4)) {
            String h = h(str, obj);
            f(h);
            Log.i("Icing", h);
        }
    }

    public static void d(String str, Object obj) {
        if (Log.isLoggable("Icing", 2)) {
            String h = h(str, obj);
            f(h);
            Log.v("Icing", h);
        }
    }

    public static void e(String str, Object obj) {
        if (Log.isLoggable("Icing", 5)) {
            String h = h(str, obj);
            f(h);
            Log.w("Icing", h);
        }
    }

    public static void a(String str) {
        if (Log.isLoggable("Icing", 3)) {
            f(str);
            Log.d("Icing", str);
        }
    }

    public static void b(String str, Object obj, Object obj2) {
        if (Log.isLoggable("Icing", 6)) {
            String h = h(str, obj, obj2);
            f(h);
            Log.e("Icing", h);
        }
    }

    public static void c(String str, Object obj, Object obj2) {
        if (Log.isLoggable("Icing", 4)) {
            String h = h(str, obj, obj2);
            f(h);
            Log.i("Icing", h);
        }
    }

    public static void d(String str, Object obj, Object obj2) {
        if (Log.isLoggable("Icing", 2)) {
            String h = h(str, obj, obj2);
            f(h);
            Log.v("Icing", h);
        }
    }

    public static void e(String str, Object obj, Object obj2) {
        if (Log.isLoggable("Icing", 5)) {
            String h = h(str, obj, obj2);
            f(h);
            Log.w("Icing", h);
        }
    }

    public static void a(String str, Object obj) {
        if (Log.isLoggable("Icing", 3)) {
            String h = h(str, obj);
            f(h);
            Log.d("Icing", h);
        }
    }

    public static void b(String str, Object... objArr) {
        if (Log.isLoggable("Icing", 3)) {
            String h = h(str, objArr);
            f(h);
            Log.d("Icing", h);
        }
    }

    public static void c(String str, Object... objArr) {
        if (Log.isLoggable("Icing", 6)) {
            String h = h(str, objArr);
            f(h);
            Log.e("Icing", h);
        }
    }

    public static void d(String str, Object... objArr) {
        if (Log.isLoggable("Icing", 4)) {
            String h = h(str, objArr);
            f(h);
            Log.i("Icing", h);
        }
    }

    public static void e(String str, Object... objArr) {
        if (Log.isLoggable("Icing", 2)) {
            String h = h(str, objArr);
            f(h);
            Log.v("Icing", h);
        }
    }

    public static void a(String str, Object obj, Object obj2) {
        if (Log.isLoggable("Icing", 3)) {
            String h = h(str, obj, obj2);
            f(h);
            Log.d("Icing", h);
        }
    }

    public static void b(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("Icing", 6)) {
            a(th, h(str, objArr));
        }
    }

    public static void c(Throwable th, String str, Object... objArr) {
        if (!Log.isLoggable("Icing", 5)) {
            return;
        }
        if (Log.isLoggable("Icing", 3)) {
            String h = h(str, objArr);
            f(h);
            Log.w("Icing", h, th);
            return;
        }
        String h2 = h(str, objArr);
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(h2).length() + 2 + String.valueOf(valueOf).length());
        sb.append(h2);
        sb.append(": ");
        sb.append(valueOf);
        String sb2 = sb.toString();
        f(sb2);
        Log.w("Icing", sb2);
    }

    public static void a(String str, String str2, Object... objArr) {
        if (Log.isLoggable(str, 2)) {
            f(h(str2, objArr));
        }
    }

    public static void a(String str, Object... objArr) {
        if (Log.isLoggable("Icing", 2)) {
            f(h(str, objArr));
        }
    }

    public static void a(Throwable th, String str) {
        if (!Log.isLoggable("Icing", 6)) {
            return;
        }
        if (Log.isLoggable("Icing", 3)) {
            f(str);
            Log.e("Icing", str, th);
            return;
        }
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append(": ");
        sb.append(valueOf);
        String sb2 = sb.toString();
        f(sb2);
        Log.e("Icing", sb2);
    }

    public static void f(String str, Object... objArr) {
        if (Log.isLoggable("Icing", 5)) {
            String h = h(str, objArr);
            f(h);
            Log.w("Icing", h);
        }
    }

    public static void a(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("Icing", 3)) {
            String h = h(str, objArr);
            f(h);
            Log.d("Icing", h, th);
        }
    }
}
