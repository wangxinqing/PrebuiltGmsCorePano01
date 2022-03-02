package defpackage;

import com.google.android.gms.auth.api.credentials.Credential;
import java.util.Comparator;
import java.util.Map;

/* renamed from: fnx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fnx implements amqy {
    static final amqy a = new fnx();

    private fnx() {
    }

    public final Object a(Object obj) {
        iwd iwd = fof.a;
        amzt j = amzy.j();
        anhk i = amzy.a((Comparator) anfk.a(fca.a(fnz.a)).a(), (Iterable) anfb.a((amzy) obj, fny.a).b.entrySet()).listIterator();
        while (i.hasNext()) {
            j.c((Credential) anfk.a(fca.a(foa.a)).b((Iterable) ((Map.Entry) i.next()).getValue()));
        }
        return j.a();
    }
}
