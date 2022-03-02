package defpackage;

/* renamed from: axur  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axur implements axuq {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.instantapps")).a();
        a = agvx.a(a2, "DebugLogging__dump_domain_filter_after_sync", false);
        b = agvx.a(a2, "DebugLogging__dump_domain_filter_before_match_url", false);
        c = agvx.a(a2, "DebugLogging__enable_debug_logging_for_domain_filter", false);
        d = agvx.a(a2, "DebugLogging__max_packages_to_dump", 600);
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

    public final long d() {
        return ((Long) d.c()).longValue();
    }
}
