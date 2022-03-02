package defpackage;

import java.util.concurrent.Callable;

/* renamed from: abte  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abte implements Callable {
    private final abtg a;

    public abte(abtg abtg) {
        this.a = abtg;
    }

    public final Object call() {
        abtg abtg = this.a;
        return Boolean.valueOf(abtg.a.b.post(new abtf(abtg)));
    }
}
