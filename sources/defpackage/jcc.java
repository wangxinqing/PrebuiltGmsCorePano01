package defpackage;

import android.content.ComponentName;

/* renamed from: jcc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jcc {
    public static final agvx a;
    public static final agvx b = agvx.a(jcg.a, "stats:connections:ignored_calling_processes", "");
    public static final agvx c = agvx.a(jcg.a, "stats:connections:ignored_calling_services", "");
    public static final agvx d = agvx.a(jcg.a, "stats:connections:ignored_target_processes", "");
    public static final agvx e = agvx.a(jcg.a, "stats:connections:ignored_target_services", "com.google.android.gms.auth.GetToken");
    public static final agvx f = agvx.a(jcg.a, "stats:connections:time_out_duration", 600000);

    static {
        agvw agvw = jcg.a;
        ComponentName componentName = jcl.a;
        a = agvx.a(agvw, "stats:connections:level", 0);
    }
}
