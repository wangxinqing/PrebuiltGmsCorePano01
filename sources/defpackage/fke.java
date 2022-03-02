package defpackage;

import com.google.android.gms.auth.api.credentials.Credential;
import java.util.Collection;
import java.util.Collections;

/* renamed from: fke  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fke implements amqy {
    private final Credential a;

    public fke(Credential credential) {
        this.a = credential;
    }

    public final Object a(Object obj) {
        Collection a2 = amxi.a((Collection) (amzy) obj, (amrm) new fkk(this.a));
        if (!a2.isEmpty()) {
            return fkn.a((hmj) Collections.max(a2, new fbz(fkl.a)));
        }
        throw qbf.a("Unable to find the matching credential.", 8).c();
    }
}
