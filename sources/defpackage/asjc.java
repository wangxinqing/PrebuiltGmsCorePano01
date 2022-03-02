package defpackage;

import java.util.concurrent.Callable;

/* renamed from: asjc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class asjc implements Callable {
    private final asjb a;
    private final asgs b;

    public asjc(asjb asjb, asgs asgs) {
        this.a = asjb;
        this.b = asgs;
    }

    public final Object call() {
        asjb asjb = this.a;
        asgs asgs = this.b;
        int i = asjh.g;
        return asjb.a(asgs);
    }
}
