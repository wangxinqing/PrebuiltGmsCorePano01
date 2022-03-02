package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: agtt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agtt {
    public final aekn a;
    public final Executor b;
    public final amsv c;
    public final agss d;
    public final osi e;
    public final agop f;

    public agtt(osi osi, aekn aekn, Executor executor, amsv amsv, agop agop) {
        this.e = osi;
        this.a = aekn;
        this.b = executor;
        this.c = amsv;
        this.f = agop;
        osi.getClass();
        this.d = new agss(4002, aekn, agop, new agtk());
    }

    static final /* synthetic */ void a(aorr aorr, agod agod) {
        try {
            aorl.a((Future) aorr);
        } catch (CancellationException | ExecutionException e2) {
            agod.close();
        }
    }
}
