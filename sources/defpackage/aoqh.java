package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aoqh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aoqh extends aopv {
    private List c;

    public final void a(int i, Object obj) {
        List list = this.c;
        if (list != null) {
            list.set(i, new aoqg(obj));
        }
    }

    public final void g() {
        List<aoqg> list = this.c;
        if (list != null) {
            ArrayList a = anda.a(list.size());
            for (aoqg aoqg : list) {
                a.add(aoqg != null ? aoqg.a : null);
            }
            b((Object) Collections.unmodifiableList(a));
        }
    }

    public aoqh(amzn amzn, boolean z) {
        super(amzn, z, true);
        List h = amzn.isEmpty() ? amzy.h() : anda.a(amzn.size());
        for (int i = 0; i < amzn.size(); i++) {
            h.add((Object) null);
        }
        this.c = h;
        f();
    }

    public final void a(aopu aopu) {
        super.a(aopu);
        this.c = null;
    }
}
