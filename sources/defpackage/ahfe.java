package defpackage;

import java.util.concurrent.Future;

/* renamed from: ahfe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahfe implements aoqb {
    private final ahfj a;
    private final aorr b;
    private final aorr c;

    public ahfe(ahfj ahfj, aorr aorr, aorr aorr2) {
        this.a = ahfj;
        this.b = aorr;
        this.c = aorr2;
    }

    public final aorr a(Object obj) {
        ahfj ahfj = this.a;
        aorr aorr = this.b;
        aorr aorr2 = this.c;
        if (aorl.a((Future) aorr).equals(aorl.a((Future) aorr2))) {
            return aorl.a((Object) null);
        }
        return aopr.a(aorr2, amll.a((aoqb) new ahff(ahfj, aorr2)), ahfj.d);
    }
}
