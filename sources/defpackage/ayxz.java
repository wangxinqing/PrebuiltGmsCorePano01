package defpackage;

import java.util.HashMap;

/* renamed from: ayxz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayxz implements ayxw {
    public static final agvx a;
    public static final agvx b;
    public static final agxg c;

    static {
        agvw a2 = new agvw("direct_boot:com.google.android.gms.phenotype").a("gms:phenotype:");
        try {
            a = agvx.a(a2, "AppScopeConfig__all_apps_scope", (auib) aucj.a((aucj) auib.b, new byte[]{10, 5, 73, 67, 73, 78, 71}), ayxx.a);
            try {
                b = agvx.a(a2, "ph_appcfg_com_d_google_d_android_d_gms", (auib) aucj.a((aucj) auib.b, new byte[]{10, 8, 71, 77, 83, 95, 67, 79, 82, 69, 10, 22, 71, 77, 83, 67, 79, 82, 69, 95, 65, 78, 68, 82, 79, 73, 68, 95, 80, 82, 73, 77, 69, 83}), ayxy.a);
                HashMap hashMap = new HashMap(2);
                hashMap.put("AppScopeConfig__all_apps_scope", a);
                hashMap.put("ph_appcfg_com_d_google_d_android_d_gms", b);
                c = new agxg(a2, hashMap);
            } catch (auda e) {
                throw new AssertionError("Could not parse proto flag \"ph_appcfg_com_d_google_d_android_d_gms\"");
            }
        } catch (auda e2) {
            throw new AssertionError("Could not parse proto flag \"AppScopeConfig__all_apps_scope\"");
        }
    }

    public final auib a() {
        return (auib) a.c();
    }

    public final agxg b() {
        return c;
    }
}
