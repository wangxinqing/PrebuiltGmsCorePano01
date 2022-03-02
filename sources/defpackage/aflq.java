package defpackage;

import android.util.Pair;
import java.util.List;

/* renamed from: aflq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aflq implements aoqb {
    private final afme a;
    private final afkj b;

    public aflq(afme afme, afkj afkj) {
        this.a = afme;
        this.b = afkj;
    }

    public final aorr a(Object obj) {
        afme afme = this.a;
        afkj afkj = this.b;
        aorr a2 = aorl.a((Object) amzy.j());
        for (Pair aflr : (List) obj) {
            a2 = aopr.a(a2, (aoqb) new aflr(afme, aflr, afkj), afme.e);
        }
        return aopr.a(a2, afls.a, afme.e);
    }
}
