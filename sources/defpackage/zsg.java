package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Map;

/* renamed from: zsg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zsg {
    private static final Map b = new HashMap();
    public final String a;

    private zsg(String str) {
        this.a = str.length() > 23 ? str.substring(0, 23) : str;
    }

    public static zsg a(String str) {
        zsg zsg;
        synchronized (b) {
            zsg = (zsg) b.get(str);
            if (zsg == null) {
                zsg = new zsg(str);
                b.put(str, zsg);
            }
        }
        return zsg;
    }

    public static String f(String str, Object... objArr) {
        try {
            return String.format(str, objArr);
        } catch (IllegalFormatException e) {
            return "";
        }
    }

    private static String g(String str, Object... objArr) {
        try {
            return String.format(str, objArr);
        } catch (IllegalFormatException e) {
            return "";
        }
    }

    public final void b(String str) {
        if (Log.isLoggable(this.a, 4)) {
            Log.i(this.a, str);
        }
    }

    public final void c(String str) {
        if (Log.isLoggable(this.a, 5)) {
            Log.w(this.a, str);
        }
    }

    public final void d(String str) {
        if (Log.isLoggable(this.a, 6)) {
            Log.e(this.a, str);
        }
    }

    @Deprecated
    public final void e(String str, Object... objArr) {
        if (Log.isLoggable(this.a, 6)) {
            Log.e(this.a, f(str, objArr));
        }
    }

    public final void b(String str, Object... objArr) {
        if (Log.isLoggable(this.a, 5)) {
            Log.w(this.a, g(str, objArr));
        }
    }

    @Deprecated
    public final void c(String str, Object... objArr) {
        if (Log.isLoggable(this.a, 5)) {
            Log.w(this.a, f(str, objArr));
        }
    }

    public final void d(String str, Object... objArr) {
        if (Log.isLoggable(this.a, 6)) {
            Log.e(this.a, g(str, objArr));
        }
    }

    public final void a(String str, Object... objArr) {
        if (Log.isLoggable(this.a, 4)) {
            Log.i(this.a, g(str, objArr));
        }
    }

    public final void a(Throwable th, String str) {
        if (Log.isLoggable(this.a, 6)) {
            Log.e(this.a, str, th);
        }
    }
}
