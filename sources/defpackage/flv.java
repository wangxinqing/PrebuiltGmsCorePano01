package defpackage;

import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;

/* renamed from: flv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class flv implements amqy {
    static final amqy a = new flv();

    private flv() {
    }

    public final Object a(Object obj) {
        iwd iwd = fmb.a;
        amzt j = amzy.j();
        anaa a2 = anfb.a((amzy) obj, flw.a);
        anhj a3 = a2.b().iterator();
        while (a3.hasNext()) {
            j.c((InternalCredentialWrapper) anfk.a(fca.a(flx.a)).b((Iterable) a2.g((String) a3.next())));
        }
        return j.a();
    }
}
