package defpackage;

import java.net.UnknownHostException;
import java.util.HashMap;

/* renamed from: aepy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aepy implements aoqb {
    private final aeqd a;

    public aepy(aeqd aeqd) {
        this.a = aeqd;
    }

    public final aorr a(Object obj) {
        aomt aomt;
        aeqd aeqd = this.a;
        Exception exc = (Exception) obj;
        aucd o = aokh.c.o();
        try {
            if (((Boolean) pba.G.a()).booleanValue()) {
                HashMap hashMap = new HashMap();
                for (Throwable th : amtb.c(exc)) {
                    hashMap.put(th.getClass(), th);
                }
                if (!hashMap.containsKey(UnknownHostException.class)) {
                    if (hashMap.containsKey(babl.class)) {
                        if (((babl) hashMap.get(babl.class)).a.r.equals(babj.o.r)) {
                            aomt = aomt.UNAVAILABLE;
                        }
                    }
                    if (hashMap.containsKey(babl.class)) {
                        if (((babl) hashMap.get(babl.class)).a.r.equals(babj.f.r)) {
                            aomt = aomt.DEADLINE_EXCEEDED;
                        }
                    }
                    aomt = aomt.FAILURE;
                } else {
                    aomt = aomt.UNKNOWN_HOST_EXCEPTION;
                }
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aokh aokh = (aokh) o.b;
                aokh.b = aomt.a();
                aokh.a |= 16;
                anax anax = aeqd.a;
                aomt a2 = aomt.a(((aokh) o.b).b);
                if (a2 == null) {
                    a2 = aomt.UNDEFINED;
                }
                if (anax.contains(a2)) {
                    throw new aeqe(exc);
                }
                throw exc;
            }
            aomt aomt2 = aomt.FAILURE;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aokh aokh2 = (aokh) o.b;
            aokh2.b = aomt2.a();
            aokh2.a |= 16;
            throw exc;
        } catch (Throwable th2) {
            ((aetj) aeqd.g.a()).a((aokh) o.i());
            throw th2;
        }
    }
}
