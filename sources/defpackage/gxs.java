package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: gxs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gxs {
    public static final gyz a = new gxq();
    private static final iwd b = gzk.a("CallbackManager");
    private final Object c = new Object();
    private final Map d = new HashMap();

    private final anax d(long j) {
        anav j2 = anax.j();
        synchronized (this.c) {
            Iterator it = this.d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Long) entry.getValue()).longValue() <= j) {
                    j2.b((gxr) entry.getKey());
                    it.remove();
                }
            }
        }
        b.b("%d callbacks for checkin started at: %d for manager %s", Integer.valueOf(j2.a().e().size()), Long.valueOf(j), toString());
        return j2.a();
    }

    public final void a(long j) {
        b.b("onCheckinSuccess %s", toString());
        anhj a2 = d(j).iterator();
        while (a2.hasNext()) {
            ((gxr) a2.next()).a();
        }
    }

    public final void b(long j) {
        b.b("onCheckinFailure %s", toString());
        anhj a2 = d(j).iterator();
        while (a2.hasNext()) {
            ((gxr) a2.next()).b();
        }
    }

    public final void c(long j) {
        b.b("onCheckinRescheduled %s", toString());
        anhj a2 = d(j).iterator();
        while (a2.hasNext()) {
            ((gxr) a2.next()).c();
        }
    }

    public final void a(gxr gxr, long j) {
        iwd iwd = b;
        Long valueOf = Long.valueOf(j);
        iwd.b("Callback added for checkin started after: %d for manager %s", valueOf, toString());
        synchronized (this.c) {
            this.d.put(gxr, valueOf);
        }
    }
}
