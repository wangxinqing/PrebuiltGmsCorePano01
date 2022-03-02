package defpackage;

/* renamed from: azrg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azrg implements azrf {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.udc")).a("gms.udc.");
        a = agvx.a(a2, "FacsClientFeature__dasu_logging_enabled", false);
        b = agvx.a(a2, "FacsClientFeature__dasu_logging_sampling_interval", 1000);
        c = agvx.a(a2, "FacsClientFeature__event_logging_enabled", false);
        d = agvx.a(a2, "FacsClientFeature__event_logging_sampling_interval", 1000);
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

    public final long d() {
        return ((Long) d.c()).longValue();
    }
}
