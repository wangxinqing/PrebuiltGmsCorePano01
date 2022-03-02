package defpackage;

import android.accounts.Account;
import java.util.List;

/* renamed from: aerm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aerm extends awem {
    private final awef b;
    private final awef c;
    private final awef d;

    private aerm(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3) {
        super(bapu2, awey.a(aerm.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
        this.d = aweu.a(awef3);
    }

    public static aerm a(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3) {
        return new aerm(bapu, bapu2, awef, awef2, awef3);
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        List list = (List) obj;
        return ((aerk) list.get(0)).a((Account) list.get(1), (List) list.get(2));
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b(), this.d.b());
    }
}
