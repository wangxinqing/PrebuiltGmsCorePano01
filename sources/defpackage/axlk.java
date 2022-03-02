package defpackage;

/* renamed from: axlk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axlk implements axlj {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.gcm"));
        a = agvx.a(agvw, "gcm_enable_aia_registration_flow", 1);
        agvx.a(agvw, "gcm_forward_to_aia", true);
        b = agvx.a(agvw, "gcm_include_aia", true);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
