package defpackage;

import android.os.Build;

/* renamed from: agoh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agoh implements aoqb {
    private final Exception a;

    public agoh(Exception exc) {
        this.a = exc;
    }

    public final aorr a(Object obj) {
        Exception exc = this.a;
        int i = Build.VERSION.SDK_INT;
        apev.a((Throwable) exc, (Throwable) obj);
        return aorl.a((Throwable) exc);
    }
}
