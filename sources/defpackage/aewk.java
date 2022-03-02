package defpackage;

import java.util.List;

/* renamed from: aewk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aewk extends awem {
    private final awef b;
    private final awef c;
    private final awef d;

    public aewk(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3) {
        super(bapu2, awey.a(aewk.class), bapu);
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
        aunk aunk = (aunk) list.get(0);
        afcd afcd = (afcd) list.get(1);
        aevc aevc = (aevc) list.get(2);
        afdp b2 = aevc.c().b();
        try {
            afcd.a(b2);
            aumr aumr = aunk.b;
            if (aumr == null) {
                aumr = aumr.c;
            }
            aevc.a(b2, aumr);
            b2.b();
            b2.close();
            aumr aumr2 = aunk.b;
            if (aumr2 == null) {
                aumr2 = aumr.c;
            }
            return aorl.a((Object) aumr2);
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
