package defpackage;

import java.util.List;

/* renamed from: aewp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aewp extends awem {
    private final awef b;
    private final awef c;

    public aewp(bapu bapu, bapu bapu2, awef awef, awef awef2) {
        super(bapu2, awey.a(aewp.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        List list = (List) obj;
        aeri aeri = (aeri) list.get(0);
        aevc aevc = (aevc) list.get(1);
        afdo a = aevc.c().a();
        try {
            afcd a2 = aevc.b().a(a, aeri.B());
            a.close();
            return aorl.a((Object) a2);
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
