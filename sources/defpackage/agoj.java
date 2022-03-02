package defpackage;

import android.util.Log;

/* renamed from: agoj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agoj implements amqy {
    private final String a;

    public agoj(String str) {
        this.a = str;
    }

    public final Object a(Object obj) {
        Throwable th = (Throwable) obj;
        Log.w(this.a, "Swallowed exception");
        return null;
    }
}
