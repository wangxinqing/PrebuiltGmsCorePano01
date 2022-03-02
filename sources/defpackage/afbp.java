package defpackage;

import java.util.List;

/* renamed from: afbp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afbp extends awem {
    private final bapu b;
    private final awef c;
    private final awef d;
    private final awef e;
    private final awef f;
    private final awef g;
    private final awef h;

    public afbp(bapu bapu, bapu bapu2, bapu bapu3, awef awef, awef awef2, awef awef3, awef awef4, awef awef5, awef awef6) {
        super(bapu2, awey.a(afbp.class), bapu);
        this.b = bapu3;
        this.c = aweu.a(awef);
        this.d = aweu.a(awef2);
        this.e = aweu.a(awef3);
        this.f = aweu.a(awef4);
        this.g = aweu.a(awef5);
        this.h = aweu.a(awef6);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.c.b(), this.d.b(), this.e.b(), this.f.b(), this.g.b(), this.h.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        baaj baaj;
        List list = (List) obj;
        awds.b(this.b);
        auls auls = (auls) list.get(0);
        String str = (String) list.get(1);
        String str2 = (String) list.get(2);
        String str3 = (String) list.get(3);
        aulm aulm = (aulm) list.get(4);
        List list2 = (List) list.get(5);
        aucd o = aumd.h.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aumd aumd = (aumd) o.b;
        str.getClass();
        aumd.b = 2;
        aumd.c = str;
        str2.getClass();
        int i = aumd.a | 4;
        aumd.a = i;
        aumd.d = str2;
        str3.getClass();
        aumd.a = i | 8;
        aumd.e = str3;
        auay au = aulm.au();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aumd aumd2 = (aumd) o.b;
        au.getClass();
        aumd2.a |= 16;
        aumd2.f = au;
        if (!aumd2.g.a()) {
            aumd2.g = aucj.a(aumd2.g);
        }
        auab.a((Iterable) list2, (List) aumd2.g);
        aumd aumd3 = (aumd) o.i();
        azxi azxi = auls.a;
        baaj baaj2 = ault.d;
        if (baaj2 == null) {
            synchronized (ault.class) {
                baaj = ault.d;
                if (baaj == null) {
                    baag a = baaj.a();
                    a.c = baai.UNARY;
                    a.d = baaj.a("search.mdh.MobileDataHubCore", "SetUpNotifications");
                    a.b();
                    a.a = baoq.a(aumd.h);
                    a.b = baoq.a(aume.a);
                    baaj = a.a();
                    ault.d = baaj;
                }
            }
            baaj2 = baaj;
        }
        return bapb.a(azxi.a(baaj2, auls.b), (Object) aumd3);
    }
}
