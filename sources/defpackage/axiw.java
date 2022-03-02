package defpackage;

/* renamed from: axiw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axiw implements axiv {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;
    public static final agvx h;
    public static final agvx i;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.fonts")).a("gms:fonts:");
        a = agvx.a(a2, "bundled_fonts_for_early_extract", "Google_Sans-400-100_0-0_0.ttf,Google_Sans-500-100_0-0_0.ttf,Google_Sans_Display-400-100_0-0_0.ttf");
        b = agvx.a(a2, "fonts:check_disk_space_before_download", true);
        c = agvx.a(a2, "contentprovider:timeout_millis", 10000);
        d = agvx.a(a2, "fonts:delete_files_reported_as_directory", true);
        e = agvx.a(a2, "directory:update:interval_seconds", 86400);
        f = agvx.a(a2, "fonts:eviction:enabled", true);
        g = agvx.a(a2, "fonts:eviction:min_available_bytes_download", 33554432);
        h = agvx.a(a2, "fonts:eviction:min_time_between_eviction_calls_millis", 60000);
        i = agvx.a(a2, "fonts:min_available_bytes_update", 16777216);
        agvx.a(a2, "prefetch:enabled", false);
    }

    public final String a() {
        return (String) a.c();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
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

    public final long g() {
        return ((Long) g.c()).longValue();
    }

    public final long h() {
        return ((Long) h.c()).longValue();
    }

    public final long i() {
        return ((Long) i.c()).longValue();
    }
}
