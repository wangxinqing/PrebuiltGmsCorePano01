package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: kex  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kex implements kew {
    public static final ith a = new ith("AppPreferencesStoreImpl", "");
    public final kkf b;
    public final Map c = new HashMap();

    public kex(kkf kkf) {
        this.b = kkf;
    }

    public final jzy a(khq khq) {
        klf b2 = this.b.b(khq);
        iva.a((Object) b2, (Object) "Authorized app doesn't exist");
        kaa kaa = new kaa();
        kaa.b = b2.c;
        kaa.c = b2.e;
        kaa.d = b2.d;
        return kaa.a();
    }
}
