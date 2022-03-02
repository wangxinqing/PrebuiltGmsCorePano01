package defpackage;

/* renamed from: azts  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azts implements aztr {
    public static final agvx a;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.usagereporting")).a("gms:usagereporting:");
        a = agvx.a(a2, "connectionless_timeout_seconds", 15);
        agvx.a(a2, "disable_create_gac", false);
        agvx.a(a2, "use_connectionless", true);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }
}
