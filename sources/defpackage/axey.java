package defpackage;

/* renamed from: axey  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axey implements axex {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.droidguard"));
        a = agvx.a(agvw, "droidguard_client_timeout_millis", 60000);
        b = agvx.a(agvw, "droidguard_connection_timeout_millis", 30000);
        c = agvx.a(agvw, "droidguard_read_timeout_millis", 30000);
        d = agvx.a(agvw, "gms:droidguard:retry_backoff_seconds_base", 900);
        e = agvx.a(agvw, "gms:droidguard:retry_backoff_seconds_limit", 28800);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }

    public final long c() {
        return ((Long) c.c()).longValue();
    }

    public final long d() {
        return ((Long) d.c()).longValue();
    }

    public final long e() {
        return ((Long) e.c()).longValue();
    }
}
