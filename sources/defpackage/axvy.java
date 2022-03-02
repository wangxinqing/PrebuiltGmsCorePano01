package defpackage;

/* renamed from: axvy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axvy implements axvx {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.instantapps")).a();
        a = agvx.a(a2, "TwoPhaseResolutions__enable_two_phase_resolutions", false);
        b = agvx.a(a2, "TwoPhaseResolutions__intent_filter_fetch_throttling_interval_secs", 0);
        c = agvx.a(a2, "TwoPhaseResolutions__intent_filter_triggering_window_duration_secs", 120);
        d = agvx.a(a2, "TwoPhaseResolutions__intent_filter_triggering_window_start_delay_secs", 15);
        e = agvx.a(a2, "TwoPhaseResolutions__recently_used_domain_digests_ttl_secs", 7776000);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
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
