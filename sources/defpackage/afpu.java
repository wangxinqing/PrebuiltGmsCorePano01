package defpackage;

import java.util.ArrayList;

/* renamed from: afpu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afpu implements aoqb {
    private final afqn a;

    public afpu(afqn afqn) {
        this.a = afqn;
    }

    public final aorr a(Object obj) {
        afqn afqn = this.a;
        Void voidR = (Void) obj;
        afqr afqr = afqn.f;
        ArrayList arrayList = new ArrayList();
        try {
            for (aflh c : afqr.c.a()) {
                arrayList.add(afqr.c(c));
            }
        } catch (Exception e) {
            afqr.b.a("Failed to cancel all downloads during clear", e);
        }
        return aopr.a(aorl.b((Iterable) arrayList).a((aoqa) new afqp(afqr), afqr.k), (aoqb) new afpv(afqn), afqn.n);
    }
}
