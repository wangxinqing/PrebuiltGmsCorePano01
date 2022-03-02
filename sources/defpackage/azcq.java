package defpackage;

/* renamed from: azcq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azcq implements azcp {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.places"));
        a = agvx.a(agvw, "prefetched_candidate_download_radius_meters", 400);
        b = agvx.a(agvw, "prefetching_flex_seconds", 86400);
        c = agvx.a(agvw, "prefetching_grace_seconds", 60);
        d = agvx.a(agvw, "prefetching_period_seconds", 1036800);
        e = agvx.a(agvw, "should_prefetch_personal_places", false);
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

    public final boolean e() {
        return ((Boolean) e.c()).booleanValue();
    }
}
