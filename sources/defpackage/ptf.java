package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ptf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ptf {
    private final Map a = new HashMap();
    private final Map b = new HashMap();

    public ptf(oqo oqo) {
        aucx aucx = oqo.e;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            oqn oqn = (oqn) aucx.get(i);
            Map map = this.a;
            oqy oqy = oqn.d;
            map.put((oqy == null ? oqy.r : oqy).b, oqn);
            Map map2 = this.b;
            oqy oqy2 = oqn.d;
            if (oqy2 == null) {
                oqy2 = oqy.r;
            }
            map2.put(oqy2.m, oqn);
        }
    }

    public final String a(String str) {
        oqn oqn = (oqn) this.a.get(str);
        return oqn != null ? oqn.c.l() : "";
    }

    public final String b(String str) {
        return c(str).l();
    }

    public final auay c(String str) {
        oqn oqn = (oqn) this.b.get(str);
        return oqn == null ? auay.b : oqn.c;
    }
}
