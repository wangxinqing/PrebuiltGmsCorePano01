package defpackage;

import java.util.concurrent.Callable;

/* renamed from: tnt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tnt implements Callable {
    private final tob a;
    private final asav b;

    public tnt(tob tob, asav asav) {
        this.a = tob;
        this.b = asav;
    }

    public final Object call() {
        tob tob = this.a;
        return (tny) tob.c.get(this.b);
    }
}
