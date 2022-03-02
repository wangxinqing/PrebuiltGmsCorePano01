package defpackage;

import java.util.concurrent.Executor;

/* renamed from: afxz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afxz implements aoqb {
    private final Iterable a;

    public afxz(Iterable iterable) {
        this.a = iterable;
    }

    public final aorr a(Object obj) {
        afyl afyl = (afyl) obj;
        Iterable a2 = anbs.a(this.a, (amqy) new afyg(afyl));
        return aopr.a(aorl.b(a2).a((aoqa) new afyh(afyl), (Executor) aoqm.a), (aoqb) new afyi(a2), (Executor) aoqm.a);
    }
}
