package defpackage;

/* renamed from: azcw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azcw implements azcv {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.places"));
        a = agvx.a(agvw, "disable_sending_for_place_updates", false);
        b = agvx.a(agvw, "location_request_minimum_interval_millis", 30000);
        c = agvx.a(agvw, "should_ignore_signals_for_place_inference", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }
}
