package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: cnh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cnh implements awdt {
    public final /* bridge */ /* synthetic */ Object a() {
        throw null;
    }

    public static final cns b() {
        cpp b = cpq.b();
        cno cno = new cno();
        clp clp = clp.DEFAULT;
        cnp d = cnq.d();
        d.a(30000);
        d.b();
        cno.a(clp, d.a());
        clp clp2 = clp.HIGHEST;
        cnp d2 = cnq.d();
        d2.a(1000);
        d2.b();
        cno.a(clp2, d2.a());
        clp clp3 = clp.VERY_LOW;
        cnp d3 = cnq.d();
        d3.a(86400000);
        d3.b();
        d3.a(Collections.unmodifiableSet(new HashSet(Arrays.asList(new cnr[]{cnr.NETWORK_UNMETERED, cnr.DEVICE_IDLE}))));
        cno.a(clp3, d3.a());
        cno.a = b;
        if (cno.a == null) {
            throw new NullPointerException("missing required property: clock");
        } else if (cno.b.keySet().size() >= clp.values().length) {
            Map map = cno.b;
            cno.b = new HashMap();
            cnk cnk = new cnk(cno.a, map);
            awdx.a((Object) cnk, "Cannot return null from a non-@Nullable @Provides method");
            return cnk;
        } else {
            throw new IllegalStateException("Not all priorities have been configured");
        }
    }
}
