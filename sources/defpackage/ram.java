package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ram  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ram implements aoqb {
    private final Executor a;
    private final adet b;

    public ram(adet adet, Executor executor) {
        this.b = adet;
        this.a = executor;
    }

    public final aorr a(Object obj) {
        adet adet = this.b;
        amzy amzy = (amzy) obj;
        return aorl.b((Iterable) amzy).a((aoqa) new rab(adet, amzy), this.a);
    }
}
