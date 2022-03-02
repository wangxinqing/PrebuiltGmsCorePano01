package defpackage;

/* renamed from: azpu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azpu implements azpt {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.subscribedfeeds"));
        a = agvx.a(agvw, "subscribedfeeds_certs_gsf", 1);
        b = agvx.a(agvw, "subscribedfeeds_bundled_certs", true);
        agvx.a(agvw, "subscribedfeeds_device_certs", true);
        agvx.a(agvw, "subscribedfeeds_update_certs_frequently", false);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
