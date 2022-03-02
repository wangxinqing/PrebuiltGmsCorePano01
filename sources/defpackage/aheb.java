package defpackage;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: aheb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aheb implements aoqa {
    private final ahed a;
    private final audx b;
    private final int c;
    private final List d;

    public aheb(ahed ahed, audx audx, int i, List list) {
        this.a = ahed;
        this.b = audx;
        this.c = i;
        this.d = list;
    }

    public final aorr a() {
        ahed ahed = this.a;
        audx audx = this.b;
        int i = this.c;
        List list = this.d;
        aorr a2 = aorl.a((Object) audx);
        for (int i2 = 0; i2 < i; i2++) {
            if (((Boolean) aorl.a((Future) list.get(i2))).booleanValue()) {
                a2 = aopr.a(a2, amll.a((aoqb) new ahec((ahgk) ahed.a.get(i2))), (Executor) aoqm.a);
            }
        }
        return a2;
    }
}
