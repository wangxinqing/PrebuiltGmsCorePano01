package defpackage;

import java.util.Collection;
import java.util.Set;

/* renamed from: hfu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class hfu implements amrm {
    private final Set a;
    private final Set b;

    public hfu(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    public final boolean a(Object obj) {
        hfg hfg = (hfg) obj;
        return hfz.a(hfg, (Collection) this.a) || hfz.a(hfg, (Collection) this.b);
    }
}
