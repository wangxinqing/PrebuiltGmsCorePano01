package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: tgd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tgd {
    private static final Map a = new HashMap();
    private static final anaf b = anaf.a("NearbyConnections", iyc.NEARBY_CONNECTIONS, "NearbyMediums", iyc.NEARBY_CONNECTIONS, "NearbyMessages", iyc.NEARBY_MESSAGES, "NearbySetup", iyc.NEARBY_SETUP, "NearbySharing", iyc.NEARBY_SHARING);
    private static final iyc c = iyc.NEARBY;

    public static synchronized jjg a(String str) {
        jjg jjg;
        synchronized (tgd.class) {
            jjg = (jjg) a.get(str);
            if (jjg == null) {
                jjg = jjg.a(str, (iyc) amrh.a((iyc) b.get(str), c));
                a.put(str, jjg);
            }
        }
        return jjg;
    }
}
