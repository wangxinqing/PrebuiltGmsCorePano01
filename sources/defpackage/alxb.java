package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: alxb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alxb extends alxd {
    private final List d;

    public alxb(alxg alxg, amic amic) {
        super(amic);
        List<amic> a = a("value").e().a();
        this.d = new ArrayList(a.size());
        for (amic a2 : a) {
            this.d.add(alxg.a(a2));
        }
    }

    public final List a() {
        if (!this.d.isEmpty()) {
            return Collections.singletonList(aluv.a(this.a, 0, (Iterable) this.d));
        }
        return Collections.emptyList();
    }
}
