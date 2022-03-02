package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: flt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class flt implements fcu {
    public final amzy a;
    private final iby b;

    public flt(iby iby, List list) {
        iva.a((Object) iby);
        this.b = iby;
        this.a = amzy.a((Collection) list);
    }

    public final aorr a(fde fde) {
        iby iby = this.b;
        wkz wkz = new wkz();
        wkz.b = false;
        return aopr.a(qbc.a(iby.a(wkz)), (amqy) new flr(this), (Executor) aoqm.a);
    }

    public final qbk a() {
        return qbk.AUTH_API_CREDENTIALS_INTERNAL_FETCH_PROFILE_DATA;
    }
}
