package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ahfb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahfb implements aoqa {
    private final ahfj a;
    private final aorr b;
    private final aoqb c;
    private final Executor d;

    public ahfb(ahfj ahfj, aorr aorr, aoqb aoqb, Executor executor) {
        this.a = ahfj;
        this.b = aorr;
        this.c = aoqb;
        this.d = executor;
    }

    public final aorr a() {
        ahfj ahfj = this.a;
        aorr aorr = this.b;
        aoqb aoqb = this.c;
        Executor executor = this.d;
        aorr a2 = aopr.a(aorr, (aoqb) new ahfc(ahfj), (Executor) aoqm.a);
        aorr a3 = aopr.a(a2, aoqb, executor);
        return aopr.a(a3, amll.a((aoqb) new ahfe(ahfj, a2, a3)), (Executor) aoqm.a);
    }
}
