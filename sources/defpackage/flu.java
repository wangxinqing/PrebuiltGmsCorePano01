package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: flu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class flu implements aoqa {
    private final fmb a;
    private final fde b;

    public flu(fmb fmb, fde fde) {
        this.a = fmb;
        this.b = fde;
    }

    public final aorr a() {
        fmb fmb = this.a;
        fde fde = this.b;
        amzt j = amzy.j();
        anhk i = fmb.d.listIterator();
        while (i.hasNext()) {
            fde fde2 = fde;
            j.c(aooz.a(fde2.a(qbk.AUTH_API_CREDENTIALS_CREDENTIAL_DATA_PROVIDER_LIST_CREDENTIALS, fmb.b.a((pyv) i.next(), fmb.c), ((Long) fdf.c.c()).longValue(), TimeUnit.MILLISECONDS), Exception.class, fly.a, (Executor) aoqm.a));
        }
        return qay.a(j.a(), (amqy) new flz(fmb));
    }
}
