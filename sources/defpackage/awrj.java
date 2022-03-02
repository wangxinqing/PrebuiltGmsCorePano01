package defpackage;

/* renamed from: awrj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awrj implements awri {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.checkin"));
        a = agvx.a(agvw, "enable_clearcut_checkin_event_client_side_policy", false);
        b = agvx.a(agvw, "enable_clearcut_checkin_event_logging", false);
        c = agvx.a(agvw, "enable_clearcut_checkin_event_logging_debugging", false);
        d = agvx.a(agvw, "enable_default_checkin_event_logging", true);
        e = agvx.a(agvw, "read_from_dropbox_delay_ms", 0);
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
