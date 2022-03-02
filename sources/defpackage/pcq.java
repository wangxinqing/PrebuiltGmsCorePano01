package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: pcq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pcq extends awem {
    private final awef b;
    private final awef c;
    private final awef d;
    private final awef e;
    private final awef f;
    private final bapu g;

    public pcq(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3, awef awef4, awef awef5, bapu bapu3) {
        super(bapu2, awey.a(pcq.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
        this.d = aweu.a(awef3);
        this.e = aweu.a(awef4);
        this.f = aweu.a(awef5);
        this.g = bapu3;
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b(), this.d.b(), this.e.b(), this.f.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        List list = (List) obj;
        aukh aukh = (aukh) list.get(0);
        String str = (String) list.get(1);
        pcp pcp = (pcp) list.get(2);
        int i = 3;
        pcs pcs = (pcs) list.get(3);
        awdn b2 = awds.b(this.g);
        aucd o = aoke.f.o();
        String a = ((aerh) ((Map) list.get(4)).get(aukg.a(aukh.a))).a(aukh);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoke aoke = (aoke) o.b;
        a.getClass();
        int i2 = aoke.a | 16;
        aoke.a = i2;
        aoke.e = a;
        str.getClass();
        aoke.a = i2 | 2;
        aoke.b = str;
        pcp pcp2 = pcp.READ;
        aujx aujx = aujx.UNKNOWN;
        int ordinal = pcp.ordinal();
        if (ordinal == 0) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoke aoke2 = (aoke) o.b;
            aoke2.c = aomp.a(3);
            aoke2.a |= 4;
        } else if (ordinal == 1) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoke aoke3 = (aoke) o.b;
            aoke3.c = aomp.a(4);
            aoke3.a |= 4;
        }
        if (pcs != pcs.PASS) {
            i = 4;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoke aoke4 = (aoke) o.b;
        aoke4.d = i - 2;
        aoke4.a |= 8;
        ((aetj) b2.a()).a((aoke) o.i());
        return aorl.a((Object) pcs);
    }
}
