package defpackage;

import android.content.ComponentName;

/* renamed from: jcd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jcd {
    public static final agvx a;
    public static final agvx b = agvx.a(jcg.a, "stats:network_usage:interval_in_seconds", 0);
    public static final agvx c = agvx.a(jcg.a, "stats:network_usage:flex_time_in_seconds", 3600);
    public static final agvx d = agvx.a(jcg.a, "stats:network_usage:network_report_N_start_time_delta_in_millis", -86400000);
    public static final agvx e = agvx.a(jcg.a, "stats:network_usage:network_report_N_duration_in_millis", 86400000);
    public static final agvx f = agvx.a(jcg.a, "stats:network_usage:interval_in_seconds_for_androidN_bucket_interval", 0);
    public static final agvx g = agvx.a(jcg.a, "stats:network_usage:network_tracking_androidN_enabled", false);

    static {
        agvw agvw = jcg.a;
        ComponentName componentName = jcl.a;
        a = agvx.a(agvw, "stats:network_usage:level", 0);
        agvx.a(jcg.a, "stats:network_usage:yesterday_report_androidN_enabled", false);
        agvx.a(jcg.a, "stats:network_usage:yesterday_report_androidN_flex_time_in_seconds", 3600);
    }
}
