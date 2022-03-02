package defpackage;

import java.util.List;

/* renamed from: ahdz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahdz implements aoqb {
    private final ahed a;
    private final List b;
    private final int c;

    public ahdz(ahed ahed, List list, int i) {
        this.a = ahed;
        this.b = list;
        this.c = i;
    }

    public final aorr a(Object obj) {
        ahed ahed = this.a;
        List list = this.b;
        return aorl.b((Iterable) list).a(amll.a((aoqa) new aheb(ahed, (audx) obj, this.c, list)), ahed.b);
    }
}
