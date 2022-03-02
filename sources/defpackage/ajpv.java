package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ajpv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ajpv implements Callable {
    private final ajpz a;

    public ajpv(ajpz ajpz) {
        this.a = ajpz;
    }

    public final Object call() {
        ajpz ajpz = this.a;
        return Boolean.valueOf(ajpz.a.addGpsStatusListener(ajpz.c));
    }
}
