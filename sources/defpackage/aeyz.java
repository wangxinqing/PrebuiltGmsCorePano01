package defpackage;

import android.accounts.Account;
import java.util.List;

/* renamed from: aeyz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeyz extends awem {
    private final awef b;
    private final awef c;
    private final awef d;

    public aeyz(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3) {
        super(bapu2, awey.a(aeyz.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
        this.d = aweu.a(awef3);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b(), this.d.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        aukv aukv;
        List list = (List) obj;
        boolean z = false;
        Account account = (Account) list.get(0);
        aukh aukh = (aukh) list.get(1);
        aewt aewt = (aewt) list.get(2);
        if (aukh.a == 2) {
            aukv = (aukv) aukh.b;
        } else {
            aukv = aukv.e;
        }
        auku a = auku.a(aukv.d);
        if (a == null) {
            a = auku.UNKNOWN;
        }
        if (a == auku.SYNC_COMBINED) {
            z = true;
        }
        amrl.a(z, "Combined sync producer called for wrong %s sync variant!", (Object) a);
        throw new UnsupportedOperationException("Not yet available");
    }
}
