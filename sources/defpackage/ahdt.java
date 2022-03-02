package defpackage;

import java.util.concurrent.Future;

/* renamed from: ahdt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahdt implements aoqb {
    private final ahdy a;
    private final aorr b;
    private final aorr c;

    public ahdt(ahdy ahdy, aorr aorr, aorr aorr2) {
        this.a = ahdy;
        this.b = aorr;
        this.c = aorr2;
    }

    public final aorr a(Object obj) {
        ahdy ahdy = this.a;
        aorr aorr = this.b;
        aorr aorr2 = this.c;
        audx audx = (audx) obj;
        if (((audx) aorl.a((Future) aorr)).equals(aorl.a((Future) aorr2))) {
            return aorl.a((Object) null);
        }
        return aopr.a(aorr2, amll.a((aoqb) new ahdu(ahdy)), ahdy.c);
    }
}
