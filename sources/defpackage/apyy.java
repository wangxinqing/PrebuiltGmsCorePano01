package defpackage;

import java.util.concurrent.Callable;

/* renamed from: apyy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class apyy implements Callable {
    private final apzb a;
    private final apza b;

    public apyy(apzb apzb, apza apza) {
        this.a = apzb;
        this.b = apza;
    }

    public final Object call() {
        apyt b2;
        apzb apzb = this.a;
        apza apza = this.b;
        synchronized (apzb.a) {
            apzb.a(apzb.a(apza));
            b2 = apzb.b(apza);
        }
        return b2;
    }
}
