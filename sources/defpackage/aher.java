package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: aher  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aher implements aoqb {
    private final ahey a;
    private final aorr b;
    private final aorr c;

    public aher(ahey ahey, aorr aorr, aorr aorr2) {
        this.a = ahey;
        this.b = aorr;
        this.c = aorr2;
    }

    public final aorr a(Object obj) {
        ahey ahey = this.a;
        aorr aorr = this.b;
        aorr aorr2 = this.c;
        if (aorl.a((Future) aorr).equals(aorl.a((Future) aorr2))) {
            return aorl.a((Object) null);
        }
        return aopr.a(ahey.f.a(ahey.b), amll.a((aoqb) new ahes(ahey, aorr2)), (Executor) aoqm.a);
    }
}
