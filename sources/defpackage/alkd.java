package defpackage;

import android.util.Log;

/* renamed from: alkd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alkd {
    public final String a;

    public alkd(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 3);
        sb.append("[");
        sb.append(str);
        sb.append("] ");
        this.a = sb.toString();
    }

    public final void a(String str) {
        Log.i("ConsentLogging", this.a.concat(str));
    }

    public final void b(String str) {
        Log.w("ConsentLogging", this.a.concat(str));
    }

    public final void a(String str, Throwable th) {
        Log.w("ConsentLogging", this.a.concat(str), th);
    }
}
