package defpackage;

/* renamed from: axka  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axka implements axjz {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.gcm"));
        a = agvx.a(agvw, "gcm_enable_aa_bucketing_clearcut_logging", true);
        b = agvx.a(agvw, "gcm_enforce_quota_in_dnd_mode", false);
        c = agvx.a(agvw, "gcm_high_priority_quotas", "30,10,40,5");
        d = agvx.a(agvw, "gcm_suppressed_notifications_dnd", "511");
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final String c() {
        return (String) c.c();
    }

    public final String d() {
        return (String) d.c();
    }
}
