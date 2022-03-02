package defpackage;

/* renamed from: axjc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axjc implements axjb {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.gass"));
        agvx.a(agvw, "Gass__enable_ad_attestation_signal", true);
        a = agvx.a(agvw, "gass:get_ad_attestation_signal_flex_secs", 86400);
        b = agvx.a(agvw, "gass:get_ad_attestation_signal_period_secs", 86400);
        c = agvx.a(agvw, "gass:get_ad_attestation_signal_require_charging", false);
        d = agvx.a(agvw, "gass:ad_attest_signal_uri", "https://www.googleapis.com/androidcheck/v1/attestations/adAttest?key=AIzaSyDaepk5bynjTA7ZhzF_0fzIHIXAkZlz3dA");
        e = agvx.a(agvw, "gass:get_ad_attestation_signal_valid_period_secs", 172800);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }

    public final String d() {
        return (String) d.c();
    }

    public final long e() {
        return ((Long) e.c()).longValue();
    }
}
