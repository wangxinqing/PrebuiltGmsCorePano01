package defpackage;

/* renamed from: awyo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awyo implements awyn {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms"));
        a = agvx.a(agvw, "CoreStats__enable_schedule_gcm_tasks_on_module_start", false);
        b = agvx.a(agvw, "CoreStats__enable_wakelock_gcore_prefix", true);
        c = agvx.a(agvw, "CoreStats__schedule_yesterday_task", false);
        d = agvx.a(agvw, "CoreStats__share_wireless_radio_activity_summary", false);
        agvx.a(agvw, "CoreStats__trace_aggregate_upload", false);
        e = agvx.a(agvw, "CoreStats__trace_upload_maximum_time_milliseconds", 172800000);
        agvx.a(agvw, "CoreStats__trace_upload_period_milliseconds", 86400000);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }

    public final boolean d() {
        return ((Boolean) d.c()).booleanValue();
    }

    public final long e() {
        return ((Long) e.c()).longValue();
    }
}
