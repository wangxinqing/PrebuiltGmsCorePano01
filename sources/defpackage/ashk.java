package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ashk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ashk implements Callable {
    private final ashp a;
    private final arwg b;
    private final ashj c;
    private final asgs d;

    public ashk(ashp ashp, arwg arwg, ashj ashj, asgs asgs) {
        this.a = ashp;
        this.b = arwg;
        this.c = ashj;
        this.d = asgs;
    }

    public final Object call() {
        ashp ashp = this.a;
        arwg arwg = this.b;
        ashj ashj = this.c;
        asgs asgs = this.d;
        arwg.b();
        ashp.d.set(1);
        ashj.a(asgs, ashp.f);
        return null;
    }
}
