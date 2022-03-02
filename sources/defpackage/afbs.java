package defpackage;

import android.accounts.Account;
import java.util.List;

/* renamed from: afbs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afbs extends awem {
    private final awef b;
    private final awef c;

    public afbs(bapu bapu, bapu bapu2, awef awef, awef awef2) {
        super(bapu2, awey.a(afbs.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        List list = (List) obj;
        return aorl.a((Object) Long.valueOf(((afai) list.get(1)).c((Account) list.get(0))));
    }
}
