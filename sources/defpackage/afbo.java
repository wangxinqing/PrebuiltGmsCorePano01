package defpackage;

import android.accounts.Account;
import java.util.List;

/* renamed from: afbo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afbo extends awem {
    private final awef b;
    private final awef c;
    private final awef d;
    private final awef e;

    public afbo(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3, awef awef4) {
        super(bapu2, awey.a(afbo.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
        this.d = aweu.a(awef3);
        this.e = aweu.a(awef4);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b(), this.d.b(), this.e.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        List list = (List) obj;
        afai afai = (afai) list.get(1);
        aume aume = (aume) list.get(3);
        afai.a((Account) list.get(0), ((Long) list.get(2)).longValue());
        return aorl.a((Object) aokp.o);
    }
}
