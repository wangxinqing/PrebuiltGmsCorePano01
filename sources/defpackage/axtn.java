package defpackage;

/* renamed from: axtn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axtn implements axtm {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.icing.mdh")).a();
        a = agvx.a(a2, "CoreFeature__do_not_broadcast_null_subscription_on_delete", true);
        b = agvx.a(a2, "CoreFeature__enable_network_tags", false);
        c = agvx.a(a2, "CoreFeature__enable_subscription_logging", true);
        agvx.a(a2, "CoreFeature__enable_subscription_ttl_on_access", true);
        d = agvx.a(a2, "CoreFeature__propagate_exceptions_from_execute_sync", false);
        e = agvx.a(a2, "CoreFeature__recreate_grpc_channel_on_flags_change", true);
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

    public final boolean d() {
        return ((Boolean) d.c()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) e.c()).booleanValue();
    }
}
