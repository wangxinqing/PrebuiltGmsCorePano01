package defpackage;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: qfn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qfn {
    public final String a = "InstantApps";
    private final String b;

    public qfn(String str) {
        this.b = String.valueOf(str).concat(": ");
    }

    private static String b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        apev.a(th, printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    public final void a(String str, Object... objArr) {
        Log.i(this.a, e(str, objArr));
    }

    public final String c(Throwable th, String str, Object... objArr) {
        StringWriter stringWriter = new StringWriter();
        stringWriter.append(this.b);
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        stringWriter.append(str);
        if (th != null) {
            stringWriter.append(10).append(b(th));
        }
        return stringWriter.toString();
    }

    public final void d(String str, Object... objArr) {
        Log.wtf(this.a, e(str, objArr));
    }

    /* access modifiers changed from: protected */
    public final String e(String str, Object... objArr) {
        return c((Throwable) null, str, objArr);
    }

    public final void a(Throwable th) {
        Log.e(this.a, b(th));
    }

    public final void b(String str, Object... objArr) {
        Log.e(this.a, e(str, objArr));
    }

    public final void a(Throwable th, String str, Object... objArr) {
        Log.e(this.a, c(th, str, objArr));
    }

    public final void b(Throwable th, String str, Object... objArr) {
        Log.w(this.a, c(th, str, objArr));
    }

    public final void c(String str, Object... objArr) {
        Log.w(this.a, e(str, objArr));
    }
}
