package defpackage;

/* renamed from: axfh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axfh implements axfg {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.droidguard"));
        a = agvx.a(agvw, "droidguard_fast_fail_flows", "ad_attest,recaptcha-frame,federatedMachineLearningReduced");
        b = agvx.a(agvw, "gms:droidguard:earliest_fsc_end_seconds", 3600);
        c = agvx.a(agvw, "gms:droidguard:enable_low_latency_api", true);
        d = agvx.a(agvw, "gms:droidguard:fsc_timeout_millis", 3600000);
        e = agvx.a(agvw, "gms:droidguard:latest_fsc_end_seconds", 2592000);
        f = agvx.a(agvw, "gms:droidguard:not_low_latency_flows", "ad_attest,attest,checkin,federatedMachineLearningReduced,msa-f");
    }

    public final String a() {
        return (String) a.c();
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

    public final long e() {
        return ((Long) e.c()).longValue();
    }

    public final String f() {
        return (String) f.c();
    }
}
