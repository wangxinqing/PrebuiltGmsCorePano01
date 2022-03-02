package defpackage;

import android.accounts.Account;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: aeyr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeyr extends awem {
    private final awef b;
    private final awef c;
    private final awef d;

    public aeyr(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3) {
        super(bapu2, awey.a(aeyr.class), bapu);
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
        afeb afeb = (afeb) list.get(2);
        ArrayList arrayList = new ArrayList();
        for (afdx e : afeb.a((Account) list.get(0), (aukh) list.get(1))) {
            aukf e2 = e.e();
            if (e2 != null && e2.a == 3) {
                arrayList.add((aukk) e2.b);
            }
        }
        return aorl.a((Object) amzy.a((Collection) arrayList));
    }
}
