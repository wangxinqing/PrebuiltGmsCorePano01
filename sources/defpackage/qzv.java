package defpackage;

import java.util.concurrent.Executor;

/* renamed from: qzv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class qzv implements aoqb {
    private final Executor a;
    private final rap b;

    public qzv(rap rap, Executor executor) {
        this.b = rap;
        this.a = executor;
    }

    public final aorr a(Object obj) {
        rap rap = this.b;
        amzy amzy = (amzy) obj;
        return aorl.b((Iterable) amzy).a((aoqa) new qzy(rap, amzy), this.a);
    }
}
