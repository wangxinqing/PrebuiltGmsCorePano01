package defpackage;

import java.util.List;

/* renamed from: aicx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aicx implements acvv {
    private final aicy a;
    private final List b;

    public aicx(aicy aicy, List list) {
        this.a = aicy;
        this.b = list;
    }

    public final void a(Object obj) {
        aicy aicy = this.a;
        List list = this.b;
        if (((ick) obj).p()) {
            aucd o = aoaa.m.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoaa aoaa = (aoaa) o.b;
            aoaa.g = 8;
            aoaa.a |= 16;
            if (!aoaa.l.a()) {
                aoaa.l = aucj.a(aoaa.l);
            }
            auab.a((Iterable) list, (List) aoaa.l);
            aicy.a((aoaa) o.i());
        }
    }
}
