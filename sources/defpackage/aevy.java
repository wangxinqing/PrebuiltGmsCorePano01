package defpackage;

import android.accounts.Account;
import java.util.List;

/* renamed from: aevy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aevy extends awem {
    private final awef b;
    private final awef c;
    private final awef d;
    private final awef e;
    private final awef f;
    private final awef g;

    public aevy(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3, awef awef4, awef awef5, awef awef6) {
        super(bapu2, awey.a(aevy.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
        this.d = aweu.a(awef3);
        this.e = aweu.a(awef4);
        this.f = aweu.a(awef5);
        this.g = aweu.a(awef6);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b(), this.d.b(), this.e.b(), this.f.b(), this.g.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        List list = (List) obj;
        return ((auls) list.get(4)).a(aevt.a((Account) list.get(0), (aukh) list.get(1), (aumr) list.get(2), (afeb) list.get(3), false, (aeri) list.get(5)));
    }
}
