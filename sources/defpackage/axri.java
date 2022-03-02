package defpackage;

/* renamed from: axri  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axri implements axrh {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.icing"));
        a = agvx.a(agvw, "gms_icing_app_param_thing_sync_enabled.", true);
        b = agvx.a(agvw, "AppParamsFlags__server_side_contextual_sources_bitfield", 0);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }
}
