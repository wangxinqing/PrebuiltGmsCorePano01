package defpackage;

/* renamed from: azct  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azct implements azcs {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.places"));
        a = agvx.a(agvw, "semantic_location_event_interval_millis", 300000);
        b = agvx.a(agvw, "semantic_location_event_trigger_threshold", 0.4d);
        c = agvx.a(agvw, "semantic_location_provider_ignore_calls", false);
        d = agvx.a(agvw, "semantic_location_provider_ignore_results", false);
        e = agvx.a(agvw, "semantic_location_update_interval_millis", 300000);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final double b() {
        return ((Double) b.c()).doubleValue();
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
