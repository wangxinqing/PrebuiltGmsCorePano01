package defpackage;

import java.util.List;

/* renamed from: aeuk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeuk extends awem {
    private final awef b;
    private final awef c;
    private final awef d;
    private final awef e;
    private final awef f;
    private final awef g;
    private final bapu h;

    public aeuk(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3, awef awef4, awef awef5, awef awef6, bapu bapu3) {
        super(bapu2, awey.a(aeuk.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
        this.d = aweu.a(awef3);
        this.e = aweu.a(awef4);
        this.f = aweu.a(awef5);
        this.g = aweu.a(awef6);
        this.h = bapu3;
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b(), this.d.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        List list = (List) obj;
        boolean booleanValue = ((Boolean) list.get(0)).booleanValue();
        boolean booleanValue2 = ((Boolean) list.get(1)).booleanValue();
        auku auku = (auku) list.get(2);
        awef awef = this.e;
        awef awef2 = this.f;
        awef awef3 = this.g;
        awdn b2 = awds.b(this.h);
        if (!booleanValue && !booleanValue2) {
            ((pia) b2.a()).e("Sync called with both upload and download disabled.", new Object[0]);
            return aorl.a((Object) aokp.o);
        }
        auku auku2 = auku.UNKNOWN;
        int ordinal = auku.ordinal();
        if (ordinal == 1) {
            return awef2.b();
        }
        if (ordinal == 2) {
            return awef.b();
        }
        if (ordinal == 3) {
            return awef3.b();
        }
        String valueOf = String.valueOf(auku);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("Not syncing unsupported protocol ");
        sb.append(valueOf);
        throw new affu(sb.toString(), 1);
    }
}
