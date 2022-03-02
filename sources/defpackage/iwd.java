package defpackage;

import android.util.Log;
import java.util.Locale;

/* renamed from: iwd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class iwd {
    public final String a;
    private final String b;
    private final int c;

    public iwd(String str, String... strArr) {
        String str2;
        if (r0 != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str3 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str3);
            }
            sb.append("] ");
            str2 = sb.toString();
        } else {
            str2 = "";
        }
        this.b = str2;
        this.a = str;
        new ith(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.a, i)) {
            i++;
        }
        this.c = i;
    }

    public static final String a(Object obj) {
        if (obj == null) {
            return "<NULL>";
        }
        String trim = obj.toString().trim();
        if (trim.isEmpty()) {
            return "<EMPTY>";
        }
        return String.format("<ELLIDED:%s>", new Object[]{Integer.valueOf(trim.hashCode())});
    }

    public final boolean a(int i) {
        return this.c <= i;
    }

    public final void b(String str, Throwable th, Object... objArr) {
        if (a(3)) {
            Log.d(this.a, g(str, objArr), th);
        }
    }

    public final void c(String str, Throwable th, Object... objArr) {
        Log.i(this.a, g(str, objArr), th);
    }

    public final void d(String str, Throwable th, Object... objArr) {
        Log.w(this.a, g(str, objArr), th);
    }

    public final void e(String str, Throwable th, Object... objArr) {
        Log.e(this.a, g(str, objArr), th);
    }

    public final void f(String str, Throwable th, Object... objArr) {
        Log.wtf(this.a, g(str, objArr), th);
    }

    /* access modifiers changed from: protected */
    public final String g(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.b.concat(str);
    }

    public void b(String str, Object... objArr) {
        if (a(3)) {
            Log.d(this.a, g(str, objArr));
        }
    }

    public final void c(String str, Object... objArr) {
        Log.i(this.a, g(str, objArr));
    }

    public final void d(String str, Object... objArr) {
        Log.w(this.a, g(str, objArr));
    }

    public final void e(String str, Object... objArr) {
        Log.e(this.a, g(str, objArr));
    }

    public final void f(String str, Object... objArr) {
        Log.wtf(this.a, g(str, objArr));
    }

    public void a(String str, Throwable th, Object... objArr) {
        if (a(2)) {
            Log.v(this.a, g(str, objArr), th);
        }
    }

    public void a(String str, Object... objArr) {
        if (a(2)) {
            Log.v(this.a, g(str, objArr));
        }
    }

    public final void a(Throwable th) {
        Log.w(this.a, th);
    }
}
