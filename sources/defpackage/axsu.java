package defpackage;

/* renamed from: axsu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axsu implements axst {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.icing.mdd"));
        a = agvx.a(agvw, "abs_free_space_after_download", 524288000);
        b = agvx.a(agvw, "abs_free_space_after_download_extremely_low_storage_allowed", 2097152);
        c = agvx.a(agvw, "abs_free_space_after_download_low_storage_allowed", 104857600);
        d = agvx.a(agvw, "downloader_enforce_https", true);
        e = agvx.a(agvw, "downloader_max_threads", 2);
        f = agvx.a(agvw, "enforce_low_storage_behavior", true);
        g = agvx.a(agvw, "fraction_free_space_after_download", 0.1d);
        agvx.a(agvw, "time_to_wait_for_downloader", 120000);
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

    public final boolean d() {
        return ((Boolean) d.c()).booleanValue();
    }

    public final long e() {
        return ((Long) e.c()).longValue();
    }

    public final boolean f() {
        return ((Boolean) f.c()).booleanValue();
    }

    public final double g() {
        return ((Double) g.c()).doubleValue();
    }
}
