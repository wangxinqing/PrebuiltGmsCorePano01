package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ahfp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahfp implements aoqb {
    private final ahfv a;
    private final aoqb b;
    private final Executor c;

    public ahfp(ahfv ahfv, aoqb aoqb, Executor executor) {
        this.a = ahfv;
        this.b = aoqb;
        this.c = executor;
    }

    public final aorr a(Object obj) {
        ahfv ahfv = this.a;
        return ahfv.b.a(this.b, this.c);
    }
}
