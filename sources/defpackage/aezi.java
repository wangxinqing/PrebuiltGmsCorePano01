package defpackage;

import java.util.List;

/* renamed from: aezi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aezi extends awem {
    private final awef b;
    private final awef c;
    private final awef d;

    public aezi(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3) {
        super(bapu2, awey.a(aezi.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
        this.d = aweu.a(awef3);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b(), this.d.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        List list = (List) obj;
        aeuy aeuy = (aeuy) list.get(0);
        amzy amzy = (amzy) list.get(1);
        aunk aunk = (aunk) list.get(2);
        aumr aumr = aunk.b;
        if (aumr == null) {
            aumr = aumr.c;
        }
        afdp b2 = aeuy.a().b();
        try {
            anda.a((List) aunk.d, aezb.a);
            aukl aukl = aunk.c;
            if (aukl == null) {
                aukl = aukl.c;
            }
            if ((1 & aukl.a) != 0) {
                aukl aukl2 = aunk.c;
                if (aukl2 == null) {
                    aukl2 = aukl.c;
                }
                auay.a(aukl2.b).k();
            }
            aeuy.e();
            aeuy.a(b2, aumr);
            b2.b();
            b2.close();
            return aorl.a((Object) aumr);
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
