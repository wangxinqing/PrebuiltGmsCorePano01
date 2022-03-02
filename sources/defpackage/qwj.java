package defpackage;

import java.util.Map;

/* renamed from: qwj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class qwj implements qwp {
    private final qwq a;
    private final qxx b;

    public qwj(qwq qwq, qxx qxx) {
        this.a = qwq;
        this.b = qxx;
    }

    public final void a(qxp qxp) {
        Map map;
        qwq qwq = this.a;
        qxx qxx = this.b;
        synchronized (qwq) {
            if (qxp.b(qxx) && (map = (Map) qwq.c.get(qxx.e)) != null && map.containsKey(qxx.g)) {
                map.put(qxx.g, true);
            }
        }
    }
}
