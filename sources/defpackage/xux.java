package defpackage;

import java.util.concurrent.Callable;

/* renamed from: xux  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xux implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ xuy b;

    public xux(xuy xuy, String str) {
        this.b = xuy;
        this.a = str;
    }

    public final Object call() {
        return this.b.a.a(this.a);
    }
}
