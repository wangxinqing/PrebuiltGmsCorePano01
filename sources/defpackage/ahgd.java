package defpackage;

import java.util.List;
import java.util.Set;

/* renamed from: ahgd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahgd implements Runnable {
    private final ahgg a;
    private final int b;
    private final Set c;
    private final int d;
    private final int e;
    private final int f;

    public ahgd(ahgg ahgg, int i, Set set, int i2, int i3, int i4) {
        this.a = ahgg;
        this.b = i;
        this.c = set;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final void run() {
        ahgg ahgg = this.a;
        int i = this.b;
        Set set = this.c;
        int i2 = this.d;
        int i3 = this.e;
        int i4 = this.f;
        aucd o = aoku.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoku aoku = (aoku) o.b;
        aoku.a |= 1;
        aoku.b = i;
        if (!aoku.c.a()) {
            aoku.c = aucj.a(aoku.c);
        }
        auab.a((Iterable) set, (List) aoku.c);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoku aoku2 = (aoku) o.b;
        int i5 = aoku2.a | 2;
        aoku2.a = i5;
        aoku2.d = i2;
        aoku2.a = i5 | 4;
        aoku2.e = i3;
        aoku aoku3 = (aoku) o.i();
        aucd o2 = aokx.g.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aokx aokx = (aokx) o2.b;
        aoku3.getClass();
        aokx.f = aoku3;
        aokx.a |= 16;
        ahgg.a((aokx) o2.i(), i4);
    }
}
