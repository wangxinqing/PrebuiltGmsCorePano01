package defpackage;

import android.util.Log;

/* renamed from: ith  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ith {
    private final String a;
    private final String b;

    public ith(String str) {
        this(str, (String) null);
    }

    private final String c(String str, Object... objArr) {
        String format = String.format(str, objArr);
        String str2 = this.b;
        return str2 != null ? str2.concat(format) : format;
    }

    public final String a(String str) {
        String str2 = this.b;
        return str2 != null ? str2.concat(str) : str;
    }

    public final void b(String str) {
        if (a(3)) {
            a(str);
        }
    }

    public ith(String str, String str2) {
        boolean z;
        iva.a((Object) str, (Object) "log tag cannot be null");
        if (str.length() <= 23) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.a = str;
        if (str2 == null || str2.length() <= 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final void a(String str, String str2) {
        if (a(4)) {
            Log.i(str, a(str2));
        }
    }

    public final void b(String str, String str2) {
        if (a(5)) {
            Log.w(str, a(str2));
        }
    }

    public final void a(String str, String str2, Throwable th) {
        if (a(4)) {
            Log.i(str, a(str2), th);
        }
    }

    public final void b(String str, String str2, Throwable th) {
        if (a(5)) {
            Log.w(str, a(str2), th);
        }
    }

    public final void c(String str) {
        if (a(3)) {
            a(str);
        }
    }

    public final void a(String str, String str2, Object... objArr) {
        if (a(4)) {
            Log.i(str, c(str2, objArr));
        }
    }

    public final void b(String str, String str2, Object... objArr) {
        if (a(6)) {
            Log.e(str, c(str2, objArr));
        }
    }

    public final void c(String str, String str2) {
        if (a(6)) {
            Log.e(str, a(str2));
        }
    }

    public final void a(String str, Object... objArr) {
        if (a(3)) {
            c(str, objArr);
        }
    }

    public final void b(String str, Object... objArr) {
        if (a(5)) {
            Log.w(this.a, c(str, objArr));
        }
    }

    public final void c(String str, String str2, Throwable th) {
        if (a(6)) {
            Log.e(str, a(str2), th);
        }
    }

    public final boolean a(int i) {
        return Log.isLoggable(this.a, i);
    }
}
