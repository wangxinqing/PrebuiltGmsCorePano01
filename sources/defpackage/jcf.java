package defpackage;

import android.content.ComponentName;

/* renamed from: jcf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jcf {
    public static final agvx a;
    public static final agvx b = agvx.a(jcg.a, "stats:wakeLocks:time_out_duration", 600000);
    public static final agvx c = agvx.a(jcg.a, "stats:wakeLocks:enable_log_calling_package_info", true);
    public static final agvx d = agvx.a(jcg.a, "stats:wakeLocks:max_timeout_heldlock", Long.MAX_VALUE);
    public static final agvx e = agvx.a(jcg.a, "stats_wakeLocks_enable_work_chains_pi", false);
    public static final agvx f = agvx.a(jcg.a, "stats_wakeLocks_timeout_overrides", iyg.b, jce.a);

    static {
        agvw agvw = jcg.a;
        ComponentName componentName = jcl.a;
        a = agvx.a(agvw, "stats:wakeLocks:level", 0);
    }
}
